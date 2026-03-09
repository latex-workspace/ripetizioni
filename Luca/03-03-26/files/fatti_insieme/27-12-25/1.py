def crea_lista(n: int):
    """
    Ritorna lista con numeri da 1 a n
    """
    rv = []

    # rimepio la lista
    for i in range(1, n + 1):
        rv.append(i)

    return rv


def somma_pari(l: list[int]):
    """
    Prendo in input una lista e ritorno la somma dei numeri pari
    """
    sum = 0
    for e in l:
        if e % 2 == 0:
            sum += e

    return sum


def somma_no_loop(l: list[int]):
    n = len(l)

    if n % 2 != 0:
        n -= 1

    tot = n * (n + 1) // 2

    tot += n // 2
    tot //= 2
    return tot


l = crea_lista(11)
print("Creo lista l: ", l)
# somma_no_loop(l)
# print(sum(l))
print("Somma no loop: ", somma_no_loop(l))
print("Somma loop: ", somma_pari(l))
# sum = somma_pari(l)
# print(sum)
