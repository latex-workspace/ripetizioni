def power_set_rec(v: list[int], curr_set: set[int], rv: list[set[int]]):
    if len(v) == 0:
        return rv.append(curr_set.copy())

    # opzione 1: aggiungo elemento al set
    curr_set.add(v[0])
    power_set_rec(v[1:], curr_set, rv)
    curr_set.remove(v[0])

    # opzione 2: NON aggiungo elemento al set
    power_set_rec(v[1:], curr_set, rv)


def power_set(v: list[int]) -> list[set[int]]:
    rv = []
    power_set_rec(v, set(), rv)
    return rv


v = [1, 2]
print(f"perm: {power_set(v)}")
