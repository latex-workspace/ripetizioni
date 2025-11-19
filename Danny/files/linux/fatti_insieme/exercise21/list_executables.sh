#!/bin/bash

EXECUTABLE_LIST=$(ls -l | grep -E "^...x")

echo -n "Numero totale di eseguibili: "
echo "$EXECUTABLE_LIST" | wc -l

echo "$EXECUTABLE_LIST"
