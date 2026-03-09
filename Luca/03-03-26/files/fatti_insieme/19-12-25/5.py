#tipo chiave tuple[int, int, int]
#tipo valore list[int]

d: dict[tuple[int, int, int], list[int]]  = {(1,2,3): [1,2,3], (3,4,5): [1,2,3]}

def my_print(a:int | str, b: int | str):
    print(a,b)
def saluta(nome: str) -> None:
    print(f"Ciao, {nome}")


my_print("stringa", 5)
my_print(1, 5)

# x: dict[tup, int ] = 42
# print(x)
#
# x = "stringa"
# print(x)
