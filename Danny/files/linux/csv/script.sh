#! /bin/bash

# $1: dati.txt
# stampa in out.txt tutte le righe riordinate 
# da così
# nome;cognome;email;classe
# a così
# cognome;nome;classe;email
#
# escludi le righe che iniziano con #

#####################################
# + Metto righe di un file in lista
####################################
OLD_IFS=$IFS
IFS=$'\n'
FILTERED_OUT=( "$(grep -v "^\s*#" "$1")" )
# grep -v "^#" "$1" # non matcha se ci sono leading spaces
IFS=$OLD_IFS
#####################################
# - Metto righe di un file in lista
####################################

echo -n "" > out.txt

for line in ${FILTERED_OUT[@]}; do
  NAME=$(echo $line | cut -d ';' -f 1)
  SURNAME=$(echo $line | cut -d ';' -f 2)
  EMAIL=$(echo $line | cut -d ';' -f 3)
  CLASS=$(echo $line | cut -d ';' -f 4)
  echo "$SURNAME;$NAME;$CLASS;$EMAIL" >> out.txt
done
