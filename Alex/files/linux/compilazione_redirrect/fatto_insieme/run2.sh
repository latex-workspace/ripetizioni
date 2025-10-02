#!/bin/bash

# ./run.sh ./exe                  -- Runna ./exe
# ./run.sh ./exe --suppress       -- Runna ./exe e sopprime output
# ./run.sh ./exe --redirrect      -- Runna ./exe e reindirizza output


# Comportamento di default
FLAG_SUPPRESS=0
FLAG_REDIRRECT=0

# Controllo parametri
if [ $# -ne 2 ] && [ $# -ne 1 ]; then
  echo "Numero di parametri sbagliato"
  exit
fi

if [ $# -eq 2 ]; then
  if [ "$2" != "--suppress" ] && [ "$2" != "--redirrect" ]; then
    echo "Parametri sbagliati"
    exit
  fi

  if [ "$2" == "--suppress" ]; then
    FLAG_SUPPRESS=1
  elif [ "$2" == "--redirrect" ]; then
    FLAG_REDIRRECT=1
  fi
fi







# Eseguo comando
if [ $FLAG_SUPPRESS -eq 1 ]; then
  $1 &>/dev/null
fi

if [ $FLAG_REDIRRECT -eq 1 ]; then
  $1 1> ./stdout.txt 2>./stderr.txt
fi

if [ $FLAG_SUPPRESS -eq 0 ] && [ $FLAG_REDIRRECT -eq 0 ]; then
  $1
fi
