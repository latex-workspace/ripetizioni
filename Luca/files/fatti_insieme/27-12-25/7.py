def count_instances(words: list[str]) -> dict[str, int]:
    rv = dict()
    for e in words:
        e = e.lower()
        if e not in rv:
            rv[e] = 1
        else:
            rv[e] += 1

    return rv


words = ["p1", "p2", "p3", "P1", "p2", "p4"]

print(count_instances(words))
