#include <errno.h>
#include <fcntl.h>
#include <signal.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <sys/ipc.h>
#include <sys/msg.h>
#include <sys/types.h>
#include <sys/wait.h>
#include <unistd.h>

int mod(int a, int b) {
  int r = a % b;
  return r < 0 ? r + b : r;
}

int main(int argc, char *argv[]) {

  if (argc != 3) {
    fprintf(stderr, "Usage: %s <file> <k>\n", argv[0]);
    return EXIT_FAILURE;
  }

  int k;
  FILE *file;

  char *end;
  errno = 0;
  k = strtol(argv[2], &end, 10);
  if (errno != 0 || *end != '\0') {
    fprintf(stderr, "Invalid value for k: %s\n", argv[2]);
    return EXIT_FAILURE;
  }

  file = fopen(argv[1], "r");
  if (file == NULL) {
    perror("Cannot open file");
    return EXIT_FAILURE;
  }

  char c;
  while ((c = fgetc(file)) != EOF) {
    if (c >= 'a' && c <= 'z') {
      printf("%c", 'a' + mod(k + c - 'a', 'z' - 'a' + 1));
    } else if (c >= 'A' && c <= 'Z') {
      printf("%c", 'A' + mod(k +c - 'A', 'Z' - 'A' + 1));
    } else {
      printf("%c", c);
    }
  }
}
