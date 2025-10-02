#include <fstream>
#include <iostream>
using namespace std;
int main(int argc, char *argv[]) {

  ifstream myfile("input.txt");

  while (myfile) {
    string line;
    getline(myfile, line);
    cout << line << endl;
  }

  return 0;
}
