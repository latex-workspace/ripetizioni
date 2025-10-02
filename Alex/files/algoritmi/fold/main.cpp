#include <fstream>
#include <iostream>

int fold(int v[], int size) {
  if (size == 0)
    return 0;
  return v[size - 1] + fold(v, size - 1);
}

int main(int argc, char *argv[]) {
  int v[] = {1, 2, 3, 4, 5};
  std::cout << fold(v, 5) << std::endl;
}

