#! /bin/bash

# Versione 1, accetta solamente 1 ingrediente
# ./menu.sh ing1 ing2 ... ingn

# Controllo numero di parametri
if test $# -lt 1 ; then
  echo "Devi specificare almeno un ingrediente"
  exit 1
fi

# ARR=( "$@" )
# for x in "${ARR[@]}"; do 
#   echo $x
# done

PIZZE="$(cat menu.txt)"

for x in "$@"; do 
  PIZZE=$(echo "$PIZZE" | grep $x)
  # echo "Filtro per l'ingrediente: $x"
  # echo "$PIZZE"
done


if test -z "$PIZZE"; then
  echo "Nessuna pizza trovata con gli ingredienti specificati"
else
  echo "$PIZZE"
fi

# ./menu.sh formaggio olive origano
# ./menu.sh formaggio olive
# ./menu.sh formaggio
# ./menu.sh
