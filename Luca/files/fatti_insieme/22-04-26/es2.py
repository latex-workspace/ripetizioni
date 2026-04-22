def k(n):
    print(n)
    if n == 0:
        return 0
    if n == 1:
        return 1
    return  k(n - 1) + k(n - 2)

print(k(5))


