#! /bin/bash

DIR_1=./home
DIR_2=./root
DIR_3=./tmp
FILE_NAME="output.txt"

# DIR_1=~
# DIR_2=/
# DIR_3=/tmp


OLD_IFS=$IFS
IFS=$'\n'
LS_OUT_HOME=( $(ls -l "$DIR_1") )  
IFS=$OLD_IFS  # restore IFS

LS_OUT_HOME=( "${LS_OUT_HOME[@]:1}")

LS_OUT_STR_HOME=""
for line in "${LS_OUT_HOME[@]}"; do
  LS_OUT_STR_HOME+="$line\n"
done
# echo -e "$LS_OUT_STR_HOME"
# LS_OUT_HOME=$(printf "%s\n" "${LS_OUT_HOME[@]}") #In alternativa al ciclo

OLD_IFS=$IFS
IFS=$'\n'
LS_OUT_ROOT=( $(ls -l "$DIR_2") )  
IFS=$OLD_IFS  # restore IFS

LS_OUT_ROOT=( "${LS_OUT_ROOT[@]:1}")

LS_OUT_STR_ROOT=""
for line in "${LS_OUT_ROOT[@]}"; do
  LS_OUT_STR_ROOT+="$line\n"
done
# echo -e "$LS_OUT_STR_ROOT"
# LS_OUT_ROOT=$(printf "%s\n" "${LS_OUT_ROOT[@]}") #In alternativa al ciclo


OLD_IFS=$IFS
IFS=$'\n'
HOME_EXECUTABLES=( $(echo -e $LS_OUT_STR_HOME | grep -E "^...x") )
HOME_NON_EXECUTABLES=( $(echo -e $LS_OUT_STR_HOME | grep -v -E "^...x") )
#
ROOT_EXECUTABLES=( $(echo -e $LS_OUT_STR_ROOT | grep -E "^...x") )
ROOT_NON_EXECUTABLES=( $(echo -e $LS_OUT_STR_ROOT | grep -E -v "^...x") )

IFS=$OLD_IFS



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
