m = [[0, 1, 2], [3, 4, 5], [6, 7, 8], [9, 10, 11]]


def stampa_matrice(m: list[list]):
    for i in range(len(m)):
        for j in range(len(m[i])):
            print(m[i][j], end="\t")
        print()
    # print(m[0])
    # print(m[1])
    # print(m[2])


def stampa_matrice_w(m: list):
    def stampa_matrice_rec(m: list, row: int, col: int):
        if row == len(m):
            return

        if col == len(m[row]):
            print()
            stampa_matrice_rec(m, row + 1, 0)
        else:
            print(m[row][col], end="\t")
            stampa_matrice_rec(m, row, col + 1)

    stampa_matrice_rec(m, 0, 0)


stampa_matrice_w(m)
