#include <fstream>
#include <iostream>

int fibonacci_rec(int n) {
  // std::cout << n << std::endl;
  if (n == 1 || n == 2)
    return 1;

  // fib(n) = fib (n-1) + fib(n-2)
  return fibonacci_rec(n - 1) + fibonacci_rec(n - 2);
}

int main(int argc, char *argv[]) {
  std::cout << fibonacci_rec(100) << std::endl;
}
