# def saluta(nome, cognome):
#       print("Ciao,", nome, cognome + "!")
#
# saluta("Alice", "Visintainer")
# saluta("Bob", "Rossi")

def moltiplica(x, y):
    return x * y

print(moltiplica(x=2, y=3)) # x=2, y=3


def saluta(nome, messaggio="Ciao"):
     print(messaggio + ", " + nome)
saluta("Alice")                  # Ciao, Alice
saluta("Bob", "Salve") # Salve, Bob
