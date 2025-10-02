#!/bin/bash

#Check arguments count
if [ ! -f "input.txt" ]; then
  echo "New file" > input.txt
fi

./custom_cat
