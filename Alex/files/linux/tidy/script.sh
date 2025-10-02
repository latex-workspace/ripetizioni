#!/bin/bash
create_dir_if_non_existing() {
  if [ ! -d "./input" ]; then
    mkdir input
  fi
  if [ ! -d "./src" ]; then
    mkdir src
  fi
}

# Default behavior: copy files
FLAG_CLEANUP=0
FLAG_MOVE=0
FLAG_COPY=1

#Check arguments count
if [ $# -ne 0 ] && [ $# -ne 1 ]; then
  echo "Usage: $0 <arg1>"
  exit
fi

# Check for unknown arguments
if [ $# -eq 1 ]; then 
  if [ "$1" != "--cleanup" ] && [ "$1" != "--copy" ] && [ "$1" != "--move" ]; then
    echo "Unknown argument: $1"
    exit
  fi

  if [ "$1" == "--cleanup" ]; then
    FLAG_CLEANUP=1
    FLAG_MOVE=0
    FLAG_COPY=0
  fi
  if [ "$1" == "--copy" ]; then
    FLAG_CLEANUP=0
    FLAG_MOVE=0
    FLAG_COPY=1
  fi
  if [ "$1" == "--move" ]; then
    FLAG_CLEANUP=0
    FLAG_MOVE=1
    FLAG_COPY=0
  fi
fi

# echo FLAG_CLEANUP: $FLAG_CLEANUP
# echo FLAG_MOVE: $FLAG_MOVE
# echo FLAG_COPY: $FLAG_COPY

# Cleanup
if [ $FLAG_CLEANUP -eq 1 ]; then
  if [ -d "./input" ]; then
    echo "Removing input directory"
    rm -r ./input
  fi
  if [ -d "./src" ]; then
    echo "Removing src directory"
    rm -r ./src
  fi
  exit
fi

# Copying
if [ "$FLAG_COPY" -eq 1 ]; then
  create_dir_if_non_existing
  echo "Copying files..."
  cp ./*.txt ./input/
  cp ./*.cpp ./src/
  exit
fi

# Moving
if [ "$FLAG_MOVE" -eq 1 ]; then
  create_dir_if_non_existing
  echo "Moving files..."
  mv ./*.txt ./input/
  mv ./*.cpp ./src/
  exit
fi
