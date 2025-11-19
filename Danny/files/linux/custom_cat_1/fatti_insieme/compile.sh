# Creo file a meno che non sia già esistente
if [ ! -f input.txt ]; then 
  echo "Creo file"
  echo "New file" >> input.txt
fi

#Compilo
g++ main.cpp
#Rinomino
mv a.out foo
#Eseguo
./foo
