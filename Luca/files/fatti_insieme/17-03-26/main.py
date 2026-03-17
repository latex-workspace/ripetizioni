# conta quante occorrenze di x ci sono nella lista v
# v = [1,5,78,2,6,1,1]


def f(v: list[int], x: int) -> int:
    def f_rec(v: list[int], x: int, count: list[int]):
        if len(v) == 0:
            return

        if v[0] == x:
            count[0] += 1

        f_rec(v[1:], x, count)

    count = [0]
    f_rec(v, x, count)
    return count[0]


v = [1, 5, 78, 2, 6, 1, 1]
x = 1

print(f(v, x))
