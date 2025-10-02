#! /bin/bash

# Versione 1, accetta solamente 1 ingrediente

# Controllo numero di parametri
if test 1 -ne $#; then
  echo "Numero parametri sbagliato" 
  echo "Uso: $0 ingrediente"
  exit 1
fi


# Controllo numero di parametri (inutile in questo caso)
if test -z  $1; then
  # echo Devi specificare un ingrediente
  echo "Uso: $0 ingrediente"
  exit 1
fi


OUTPUT=$(cat menu.txt | grep $1)

if test -z "$OUTPUT"; then 
  echo "Nessuna pizza con $1 trovata"
else
  echo "$OUTPUT"
fi


# grep $1 menu.txt
