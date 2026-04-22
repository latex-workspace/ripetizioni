def perm_rec(v: list[int], curr_perm: list[int], rv: list[tuple[int, ...]]):
    if len(v) == 0:
        return rv.append(tuple(curr_perm))

    for e in v:
        curr_perm.append(e)
        remaining = [x for x in v if x != e]
        perm_rec(remaining, curr_perm, rv)
        curr_perm.pop()


def perm(v: list[int]) -> list[set[int]]:
    rv = []
    perm_rec(v, [], rv)
    return rv


v = [1, 2, 3]
print(f"perm: {perm(v)}")
