#include <fstream>
#include <iostream>

int fibonacci_rec(int n) {
  if (n <= 2)
    return 1;
  return fibonacci_rec(n - 1) + fibonacci_rec(n - 2);
}

int fibonacci_rec_aux(int n, int mem[]) {
  if (n <= 2)
    return n;

  int f1, f2;
  if (mem[n - 1] == -1) {
    f1 = fibonacci_rec_aux(n - 1, mem);
    mem[n - 1] = f1;
  } else
    f1 = mem[n - 1];

  if (mem[n - 2] == -1) {
    f2 = fibonacci_rec_aux(n - 2, mem);
    mem[n - 2] = f2;
  } else
    f2 = mem[n - 2];

  return f1 + f2;
}

int fibonacci_rec_mem(int n) {
  int mem[n];
  for (int i = 0; i < n; i++) {
    mem[i] = -1;
  }
  return fibonacci_rec_aux(n, mem);
}

int fibonacci_iter(int n) {
  int fibonacci[n];
  fibonacci[0] = 1;
  fibonacci[1] = 1;
  for (int i = 2; i < n; i++) {
    fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
  }
  return fibonacci[n - 1];
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
  int n = 40;

  int rv1, rv2, rv3;
  auto t1 = measureExecutionTime([n, &rv1]() { rv1 = fibonacci_rec(n); });
  auto t2 = measureExecutionTime([n, &rv2]() { rv2 = fibonacci_iter(n); });
  auto t3 = measureExecutionTime([n, &rv3]() { rv3 = fibonacci_rec_mem(n); });
  std::cout << "fibonacci_rec\t\t" << rv1 << " " << t1.count()
            << " microseconds" << std::endl;
  std::cout << "fibonacci_iter\t\t" << rv2 << " " << t2.count() << "\t"
            << " microseconds" << std::endl;
  std::cout << "fibonacci_iter_mem\t" << rv3 << " " << t3.count() << "\t"
            << " microseconds" << std::endl;
}
