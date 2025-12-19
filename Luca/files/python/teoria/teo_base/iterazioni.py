lista = [1, 2, 3, 4, 5]
stringa = "Ciao mondo"
dizionario = {"a": 1, "b": 2, "c": 3}
insieme = {1, 2, 3, 4, 5}
tupla = (1, 2, 3, 4, 5)

for x in lista:
    print(x, " ", end="")

print()
for x in stringa:
    print(x, " ", end="")

print()
for x in dizionario:
    print(x, " ", end="")

print()
for x in insieme:
    print(x, " ", end="")

print()
for x in tupla:
    print(x, " ", end="")

print("\n")

# Chiave valore
for v in dizionario.values():
    print("Valore:", v)

# Chiave valore dizionario
for k, v in dizionario.items():
    print("Chiave:", k, "Valore:", v)

# Elemento con indice
print()
for i, v in enumerate(lista):
    print("Indice:", i, "Valore:", v)

print()
for i, v in enumerate(insieme):
    print("Indice:", i, "Valore:", v)

# Tramite range (per liste)
print()
for i in range(len(lista)):
    print(f"lista[{i}]:", lista[i])

# Tramite range al contrario (per liste)
print()
for i in range(len(lista) - 1, -1, -1):
    print(f"lista[{i}]:", lista[i])

# Tramite range ogni due (per liste)
print()
for i in range(0, len(lista), 2):
    print(f"lista[{i}]:", lista[i])

