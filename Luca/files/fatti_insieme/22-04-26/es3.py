def f(n):
    if n <= 0:
        return 0
    rv = n - g(n - 1)
    print(rv)
    return rv

def g(n):
    if n <= 0:
        return 1

    rv = n - f(n - 1)
    print(rv)
    return rv

print(f(4))
