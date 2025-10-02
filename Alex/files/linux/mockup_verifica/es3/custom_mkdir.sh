#!/bin/bash

# Controllo del numero di parametri
if [ $# -ne 2 ]; then
  echo "Errore: devi fornire due parametri: <percorso_directory> <nome_nuova_directory>"
  exit 1
fi


# Controllo che p1 sia una directory esistente
if [ ! -d "$1" ]; then
  echo "Errore: '$1' non è una directory esistente."
  exit 1
fi

# Creazione della nuova directory
NEW_DIR="$1/$2"

mkdir "$NEW_DIR" && echo "La directory '$NEW_DIR' è stata creata con successo." || echo "Errore: impossibile creare la directory."
