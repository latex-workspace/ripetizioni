#include <fstream>
#include <iostream>

int fact(int n) {
  if (n == 1)
    return 1;

  return n * fact(n - 1);
}

int main(int argc, char *argv[]) { std::cout << fact(10) << std::endl; }
