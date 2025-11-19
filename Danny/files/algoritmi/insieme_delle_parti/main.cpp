#include <fstream>
#include <iostream>

void print_set_rec(int v[], int curr_index, int size, bool take[]) {
  if (curr_index == size) {
    std::string s;
    for (int i = 0; i < size; i++) {
      if (take[i]) {
        s += std::to_string(v[i]);
        s += ", ";
      }
    }
    if (s.size() > 0) {
      s = s.substr(0, s.size() - 2);
    }
    std::cout << "[" << s << "]" << std::endl;
    return;
  }

  take[curr_index] = false;
  print_set_rec(v, curr_index + 1, size, take);
  take[curr_index] = true;
  print_set_rec(v, curr_index + 1, size, take);
}

void print_set(int v[], int size) {
  bool take[size];
  print_set_rec(v, 0, size, take);
}

int main(int argc, char *argv[]) {
  int v[] = {1, 2, 3, 4};
  print_set(v, 4);
}
