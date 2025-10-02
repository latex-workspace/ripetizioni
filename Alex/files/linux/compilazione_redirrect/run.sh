#!/bin/bash

#Default flags
FLAG_SUPPRESS=0
FLAG_REDIRRECT=0

#Check arguments count
if [ $# -ne 1 ] && [ $# -ne 2 ]; then
  echo "Usage: $0 <executable> [--suppress|--redirrect]"
  exit
fi

#Check for unknown arguments
if [ $# -eq 2 ]; then 
  if [ "$2" != "--suppress" ] && [ "$2" != "--redirrect" ]; then
    echo "Unknown argument: $2"
    exit
  fi

  if [ "$2" == "--suppress" ]; then
    FLAG_SUPPRESS=1
  fi
  if [ "$2" == "--redirrect" ]; then
    FLAG_REDIRRECT=1
  fi



fi


if [ "$FLAG_REDIRRECT" -eq 1 ]; then
  pwd
  $1 1>stdout.txt 2>stderr.txt
  exit
fi

if [ "$FLAG_SUPPRESS" -eq 1 ]; then
  #Stampo nel registro blackhole
  $1 &>/dev/null 
  exit
fi

$1
