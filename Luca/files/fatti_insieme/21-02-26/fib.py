def fib_memo_wrap(n):
    memo = []
    for i in range(n + 1):
        memo.append(-1)

    memo[0] = 1
    memo[1] = 1

    return fib_memo(n, memo)


def fib_memo(n, memo):
    if memo[n] != -1:
        return memo[n]
    else:
        memo[n] = fib_memo(n - 1, memo) + fib_memo(n - 2, memo)
        return memo[n]


def fib_rec(n):
    if n == 0 or n == 1:
        return 1

    return fib_rec(n - 1) + fib_rec(n - 2)


def fib(n):
    if n == 0 or n == 1:
        return 1
    l = [1, 1]
    result = 0
    for i in range(2, n + 1):
        result = l[0] + l[1]
        l[0] = l[1]
        l[1] = result

    return result


print(fib_memo_wrap(50))
print(fib(50))
# print(fib_rec(50))
