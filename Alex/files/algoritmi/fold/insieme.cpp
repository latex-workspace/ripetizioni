#include <fstream>
#include <iostream>

void print_vec(int v[], int size) {
  for (int i = 0; i < size; i++) {
    std::cout << v[i] << " ";
  }
  std::cout << std::endl;
}

// restituisce la somma di ogni elemento del vettore
int sum(int v[], int size) {

  print_vec(v, size);

  if (size == 1) {
    return v[0];
  }

  return v[size - 1] + sum(v, size - 1);
};

int main(int argc, char *argv[]) {
  int v[] = {1, 2, 3, 4, 5};
  std::cout << sum(v, 5) << std::endl;
}
