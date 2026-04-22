# Funzione minimo inefficiente
def my_min1(v: list[int]) -> int:
    for i in range(len(v)):
        ha_elemento_minore = False
        for j in range(len(v)):
            if v[j] < v[i]:
                ha_elemento_minore = True
        if not ha_elemento_minore:
            return v[i]
    return -1


# Funzione minimo efficiente
def my_min2(v: list[int]) -> int:
    min = v[0]
    for i in range(1, len(v)):
        if v[i] < min:
            min = v[i]
    return min


# Minimo senza considererare gli indici in scartati
def my_min3(v: list[int], scartati: set[int]) -> int:
    min_pos = -1
    for i in range(0, len(v)):
        if not i in scartati:
            if min_pos == -1 or v[i] < v[min_pos]:
                min_pos = i
    return min_pos


# Versione fatta insieme
def my_sort1(v: list[int]) -> list[int]:
    rv = []
    scartati = set()
    for _ in range(len(v)):
        min_pos = my_min3(v, scartati)
        min_val = v[min_pos]
        rv.append(min_val)
        scartati.add(min_pos)

    return rv


# Selection sort corretto
def my_sort2(v: list[int]) -> list[int]:
    rv = v.copy()

    for i in range(len(v) - 1):
        min_pos = i

        for j in range(i + 1, len(v)):
            if rv[j] < rv[min_pos]:
                min_pos = j

        rv[i], rv[min_pos] = rv[min_pos], rv[i]  # scambia elementi

    return rv


v = [5, 8, 2, 1, 56, 2, 36]
# v = [x for x in range(10000, 0, -1)] # vettore grande

print(my_sort1(v))
print(my_sort2(v))
