#! /bin/bash

OLD_IFS=$IFS
IFS=$'\n'                # Split lines properly
PROCESSES=( $(ps -l) )   # Capture output line by line
IFS=$OLD_IFS             # Restore original IFS

# Skip the header (first line)
SUBLIST=( "${PROCESSES[@]:1}" )

# Print each line of the sublist (optional)
for i in "${!SUBLIST[@]}"; do
  echo [$((i + 1))] ${SUBLIST[i]}
done


IN=-1
while ! [ $IN -eq 2 ]; do
  read IN
  echo "$IN"
done

IFS=$OLD_IFS


