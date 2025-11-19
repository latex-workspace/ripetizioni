#! /bin/bash

# script.sh username password
# se username e password sono corretti, stampa "Accesso riuscito", altrimenti "Accesso negato"
# cut -d <delimiter> -f <offset> 

if test $# -ne 2; then
  echo "Devi specificare username e password"
  exit 1
fi

OUT=$(cut -d '-' -f 1 -f 4 users.txt | grep "$1-$2")
if test -n "$OUT"; then
  echo "Accesso riuscito"
else
  echo "Accesso negato"
fi

# if cut -d '-' -f 1 -f 4 users.txt | grep "$1-$2"; then
#   echo "Accesso riuscito"
# else
#   echo "Accesso negato"
# fi

# cut -d '-' -f 1 -f 4 users.txt | grep "$1-$2" && echo "Accesso riuscito" || echo "Accesso negato"
