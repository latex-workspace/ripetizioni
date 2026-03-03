def max_rec(v: list[int]) -> int:
    if len(v) == 1:
        return v[0]
    return max(v[0], max_rec(v[1:]))


v = [1, 6, 8, 2, 14, 6, 34, -3, 7]
print(f"max: {max_rec(v)}")
