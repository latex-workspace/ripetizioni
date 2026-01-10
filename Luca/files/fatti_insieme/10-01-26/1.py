def merge(d1: dict[str, int], d2: dict[str, int]) -> dict[str, int]:
    d3 = {}
    for k in d1:
        d3[k] = d1[k]

    for k in d2:
        if k in d3:
            d3[k] += d2[k]
        else:
            d3[k] = d2[k]

    return d3


def merge2(d1: dict[str, int], d2: dict[str, int]) -> dict[str, int]:
    keys = set(d1.keys()).union(set(d2.keys()))
    return {k: d1.get(k, 0) + d2.get(k, 0) for k in keys}


d1 = {"a": 1, "b": 2, "c": 3}
d2 = {"c": 3, "d": 2, "e": 4}
# dovrebbe risultare: {"a": 1, "b": 2, "c": 6, "d": 2, "e": 4}

print(merge(d1, d2))
print(merge2(d1, d2))
