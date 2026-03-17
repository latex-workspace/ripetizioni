def print_list(l: list):
    def print_list_rec(l: list):
        if len(l) == 0:
            return
        print(l[0], end=" ")
        print_list_rec(l[1:])

    print_list_rec(l)
    print()


l = [1, 2, 3, 4, 5, 6, 7, 8]

# print(l[:-1])

print_list(l)  #  1 2 3 4 5 6 7 8
