def square(l: list[int]) -> list[int]:
    rv = []
    for e in l:
        rv.append(e * e)

    return rv


l = [1, 2, 3, 5, 7, 7]
print("Lista originale: ", l)
squared_numbers = square(l)
print("Lista numeri al quadrato: ", squared_numbers)
print("Lista numeri al quadrato: ", [e * e for e in l])
