#include <fstream>
#include <iostream>

void print_step_combinations_rec(int v[], int curr_index, int n, int step,
                                 int upper_bound) {
  if (curr_index == n) {
    std::cout << "[";
    for (int i = 0; i < n - 1; i++) {
      std::cout << v[i] << ", ";
    }
    std::cout << v[n - 1] << "]" << std::endl;
    return;
  }

  for (int i = 0; i <= upper_bound / step; i++) {
    v[curr_index] = i * step;
    print_step_combinations_rec(v, curr_index + 1, n, step, upper_bound);
  }
}

void print_step_combinations(int n, int step, int upper_bound) {
  int v[n];
  for (int i = 0; i < n; i++) {
    v[i] = 0;
  }
  print_step_combinations_rec(v, 0, n, step, upper_bound);
}

int main(int argc, char *argv[]) {
  print_step_combinations(2, 2, 4); // 3^2 combinazioni
  // print_step_combinations(3, 5, 16); //4^3 combinazioni
}
