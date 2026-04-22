def scala(n):

    if n == 0:
        return 0

    result = n + scala(n - 1)

    if (n % 2 == 0):
        print(n)

    return result

print(scala(5))
