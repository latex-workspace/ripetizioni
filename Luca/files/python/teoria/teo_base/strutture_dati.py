# Lista
l = [1, "prova", 3.2, True]
print(l[0])  # 1
print(l[1])  # prova
print(l[2])  # 3.2
print(l[3])  # True

# print(l[4])  # ERRORE
# print(l[-1])  # ERRORE


# Set
s = {1, 2, 3, 4}
t = set([3, 4, 5, 6])
print(2 in s)  # True
s.add(5)  # Aggiunge 5
s.remove(3)  # Rimuove 3
print("s:", s)
print("t:", t)
print("Unione", s | t)  # Unione
print("Intersezione", s & t)  # Intersezione
print("Differenza", s - t)  # Differenza
