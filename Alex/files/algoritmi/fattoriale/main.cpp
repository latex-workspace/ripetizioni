#include <climits>
#include <fstream>
#include <iostream>

// Le funzioni ricorsive possono spesso andare in stack overflow. Per aumentare
// la dimensione dello stack, si può urase il seguente comando: ulimit -s
// ulimit -s $(ulimit -Hs)
int factorial_rec(long long n) {
  if (n == 0 || n == 1)
    return 1;
  return (n * factorial_rec(n - 1)) % INT_MAX;
}

int factorial_iter(int n) {
  long long result = 1;
  for (int i = 2; i <= n; i++) {
    result = (result * i) % INT_MAX;
  }
  return result;
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
  int n = 200000;

  int rv1, rv2;
  auto t1 = measureExecutionTime([n, &rv1]() { rv1 = factorial_rec(n); });
  auto t2 = measureExecutionTime([n, &rv2]() { rv2 = factorial_iter(n); });
  std::cout << "factiorial_rec\t" << rv1 << ", " << t1.count()
            << " microseconds" << std::endl;
  std::cout << "factiorial_iter\t" << rv2 << ", " << t2.count()
            << " microseconds" << std::endl;
}
