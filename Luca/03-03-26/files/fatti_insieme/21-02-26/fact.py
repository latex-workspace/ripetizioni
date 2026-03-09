def fact(n: int):
    result = 1
    for i in range(1, n + 1):
        result *= i

    return result


def fact_rec(n: int):
    if n == 1:
        return 1

    return n * fact_rec(n - 1)


print(fact(4))
print(fact_rec(4))
