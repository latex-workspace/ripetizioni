def inv(l: list[int]) -> list[int]:
    if len(l) == 1:
        return l
    else:
        return [l[-1]] + inv(l[:-1])


l = [1, 2, 3, 4, 5]
print(inv(l))
