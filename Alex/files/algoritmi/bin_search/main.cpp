#include <_stdio.h>
#include <fstream>
#include <iostream>

int linear_search(int v[], int size, int n) {
  for (int i = 0; i < size; i++) {
    if (v[i] == n) {
      return i;
    }
  }
  return -1;
}

void print_array(int v[], int i, int j) {
  for (; i < j; i++) {
    std::cout << v[i] << " ";
  }
  std::cout << std::endl;
}

int bin_search_aux(int v[], int i, int j, int n) {
  if (j == i) {
    if (v[i] == n) {
      return i;
    } else {
      return -1;
    }
  }

  // print_array(v, i, j + 1);
  int mid = (i + j) / 2;
  if (n <= v[mid]) {
    return bin_search_aux(v, i, mid, n);
  } else {
    return bin_search_aux(v, mid + 1, j, n);
  }
}

int bin_search(int v[], int size, int n) {
  return bin_search_aux(v, 0, size - 1, n);
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
  // int v[] = {2, 4, 5, 7, 8, 9, 13};

  // puoi generare array con
  // ./gen_array 1000000 0,2000000 input.txt
  std::ifstream input("input.txt");
  int size;
  input >> size;
  int v[size];
  for (int i = 0; i < size; i++) {
    input >> v[i];
  }

  int data[] = {0, 99, 161, 1999999};

  auto t1 = measureExecutionTime([&v, size, &data]() {
    for (int i = 0; i < sizeof(data) / sizeof(int); i++) {
      std::cout << "bin_search(" << data[i]
                << ") = " << bin_search(v, size, data[i]) << "\n";
    }
  });

  std::cout << std::endl;
  auto t2 = measureExecutionTime([&v, size, &data]() {
    for (int i = 0; i < sizeof(data) / sizeof(int); i++) {
      std::cout << "linear_search(" << data[i]
                << ") = " << linear_search(v, size, data[i]) << "\n";
    }
  });

  std::cout << std::endl;
  std::cout << "bin_search\t"
            << ": " << t1.count() << " microseconds" << std::endl;

  std::cout << "linear_search\t"
            << ": " << t2.count() << " microseconds" << std::endl;
}
