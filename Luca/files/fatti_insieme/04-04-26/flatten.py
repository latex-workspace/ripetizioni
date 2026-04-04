def flatten(l: list[int | list])->list[int]:
    flattened = []

    for x in l:
        if isinstance(x, list): # x è una lista
            s = flatten(x)
            for x in s:
                flattened.append(x)
        else:
            flattened.append(x)

    return flattened

l = [1, [2, 3, [4, 5, 6], 7], [[8, 9], [10, 11]]]
print(flatten(l)) #[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]

