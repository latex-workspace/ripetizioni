#include <fstream>
#include <iostream>

// int dim = 5;
// bool b[5];
//
int s[7] = {1, 2, 3, 4, 5, 6, 7};

void print_set(bool b[], int curr_index, int dim) {
  if (curr_index == 0) {
    std::cout << "---------------------------------------------" << std::endl;
    for (int i = 0; i < dim; i++) {
      // std::cout << b[i] << " ";
      std::cout << b[i] << " ";
    }

    std::cout << std::endl;
    for (int i = 0; i < dim; i++) {
      // std::cout << b[i] << " ";
      if (b[i] == true) {
        std::cout << s[i] << " ";
      } else {
        std::cout << "- ";
      }
    }
    std::cout << std::endl;
    return;
  }

  // o setto primo elemento a 1 e genero tutte le possibili combinazioni per i
  // seguenti elementi
  b[curr_index - 1] = 1;
  print_set(b, curr_index - 1, dim);

  // o setto primo elemento a 0 e genero tutte le possibili combinazioni per i
  // seguenti elementi
  b[curr_index - 1] = 0;
  print_set(b, curr_index - 1, dim);
}

void print_set_wrap(int dim) {
  bool b[dim];
  print_set(b, dim, dim);
}

int main(int argc, char *argv[]) {
  // print_set_wrap(2);
  print_set_wrap(7);
}
