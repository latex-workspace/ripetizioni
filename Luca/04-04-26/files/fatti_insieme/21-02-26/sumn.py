def sum(n):
    # caso base
    if n == 0:
        return 0

    # chiamata rec
    return n + sum(n - 1)


print(sum(5))
