#include <fstream>
#include <iostream>
#include <vector>

int main(int argc, char *argv[]) {

  if (!(argc == 3 or argc == 4)) {
    std::cerr << "Usage: " << argv[0]
              << " <size> [<lower_bound>,<upper_bound>] file.txt" << std::endl;
    return 1;
  }

  int n = atoi(argv[1]);
  int lower_bound = 0;
  int upper_bound = INT_MAX;
  if (argc == 4) {
    std::string bounds = argv[2];
    size_t comma_pos = bounds.find(',');
    if (comma_pos == std::string::npos) {
      std::cerr << "Invalid bounds format. Use <lower_bound>,<upper_bound>."
                << std::endl;
      return 1;
    }
    lower_bound = atoi(bounds.substr(0, comma_pos).c_str());
    upper_bound = atoi(bounds.substr(comma_pos + 1).c_str());
  }

  std::srand(std::time(0));
  std::vector<int> v(n);

  for (int i = 0; i < n; i++) {
    v[i] = std::rand() % (upper_bound - lower_bound) + lower_bound;
  }
  sort(v.begin(), v.end());

  std::ofstream out(argv[3]);
  out << n << std::endl;
  for (int i = 0; i < n; i++) {
    out << v[i] << "\n";
  }

  std::cout << "Output written in " << argv[3] << std::endl;
}
