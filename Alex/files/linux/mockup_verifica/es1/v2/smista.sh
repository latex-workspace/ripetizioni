#! /bin/bash

DIR_1=./home
DIR_2=./root
DIR_3=./tmp
FILE_NAME="output.txt"

# DIR_1=~
# DIR_2=/
# DIR_3=/tmp
#
HOME_EXECUTABLES=()
HOME_NON_EXECUTABLES=()

ROOT_EXECUTABLES=()
ROOT_NON_EXECUTABLES=()


for f in $DIR_1/*; do
  if [ -f "$f" ] && [ -x "$f" ];  then
    HOME_EXECUTABLES+=($f)
  else
    HOME_NON_EXECUTABLES+=($f)
  fi
done

for f in $DIR_2/*; do
  if [ -f "$f" ] && [ -x "$f" ];  then
    ROOT_EXECUTABLES+=($f)
  else
    ROOT_NON_EXECUTABLES+=($f)
  fi
done



OUT_PATH=$DIR_3/$FILE_NAME

echo -n "" > $OUT_PATH #pulisce il contenuto del file

echo "File eseguibili nella cartella home: " >> $OUT_PATH
for x in "${HOME_EXECUTABLES[@]}"; do
  echo -e "\t $x" >> $OUT_PATH
done

echo "File eseguibili nella cartella root: " >> $OUT_PATH
for x in "${ROOT_EXECUTABLES[@]}"; do
  echo -e "\t $x" >> $OUT_PATH
done

echo "File NON eseguibili nella cartella home: " >> $OUT_PATH
for x in "${HOME_NON_EXECUTABLES[@]}"; do
  echo -e "\t $x" >> $OUT_PATH
done

echo "File NON eseguibili nella cartella root: " >> $OUT_PATH
for x in "${ROOT_NON_EXECUTABLES[@]}"; do
  echo -e "\t $x" >> $OUT_PATH
done


cat $OUT_PATH
# pico $OUT_PATH

# rm $OUT_PATH
