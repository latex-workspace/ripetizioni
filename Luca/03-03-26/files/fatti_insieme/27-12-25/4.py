def filter_even(l: list[int]) -> list[int]:
    rv = []
    for e in l:
        if e % 2 == 0:
            rv.append(e)

    return rv


l = [1, 2, 3, 5, 7, 7]
print("Lista originale: ", l)
print("Lista numeri pari: ", filter_even(l))
even_numbers = [x for x in l if x % 2 == 0]
print("Lista numeri pari: ", even_numbers)
