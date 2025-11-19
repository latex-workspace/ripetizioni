#include <algorithm>
#include <fstream>
#include <iostream>

int min_steps_aux(int n) {
  if (n == 0)
    return 0;
  int r1, r2;
  if (n % 2 == 0) {
    r1 = min_steps_aux(n - 1) + 1;
    r2 = min_steps_aux(n / 2) + 1;
    return std::min(r1, r2);
  } else
    return min_steps_aux(n - 1) + 1;
}

int min_steps(int n) { return min_steps_aux(n); }

int min_steps_memo_aux(int n, int memo[]) {
  if (n == 0)
    return 0;
  int r1, r2;
  if (n % 2 == 0) {
    r1 =
        (memo[n - 1] != -1 ? memo[n - 1] : min_steps_memo_aux(n - 1, memo)) + 1;
    r2 =
        (memo[n / 2] != -1 ? memo[n / 2] : min_steps_memo_aux(n / 2, memo)) + 1;

    int rv = std::min(r1, r2);
    memo[n] = rv;
    return rv;
  } else {
    int rv =
        (memo[n - 1] != -1 ? memo[n - 1] : min_steps_memo_aux(n - 1, memo)) + 1;
    memo[n] = rv;
    return rv;
  }
}

int min_steps_memo(int n) {
  int memo[n];
  for (int i = 0; i < n; i++) {
    memo[i] = -1;
  }

  return min_steps_memo_aux(n, memo);
}

// Serve solo per misurare tempo di esecuzione
std::chrono::microseconds
measureExecutionTime(const std::function<void()> &closure) {
  auto start = std::chrono::high_resolution_clock::now();
  closure();
  auto end = std::chrono::high_resolution_clock::now();
  return std::chrono::duration_cast<std::chrono::microseconds>(end - start);
}

int main(int argc, char *argv[]) {

  int n = 300;
  int rv1, rv2;

  auto t1 = measureExecutionTime([n, &rv1]() { rv1 = min_steps(n); });
  auto t2 = measureExecutionTime([n, &rv2]() { rv2 = min_steps_memo(n); });

  std::cout << "min_steps_no_memo\t" << rv1 << " -> " << t1.count()
            << " microseconds" << std::endl;
  std::cout << "min_steps_memo  \t" << rv2 << " -> " << t2.count()
            << " microseconds" << std::endl;
  // ; // 6
  // min_steps(10); // 6
}
