def sum_rec(l: list[int | list])->int:
    sum = 0 

    for x in l:
        if isinstance(x, list):
            sum += sum_rec(x)
        else:
            sum += x

    return sum

def k_flatten_rec(l: list[int | list], depth: int, k: int)->list[int]:
    flattened = []

    if depth >= k:
        return [sum_rec(l)]

    for x in l:
        if isinstance(x, list): # x è una lista
            s = k_flatten_rec(x, depth+1, k)

            for x in s:
                flattened.append(x)
        else:
            flattened.append(x)

    return flattened

l = [1, [2, 3, [4, 5, 6], 7], [[8, 9], [10, 11]]]
k = 2

print(k_flatten_rec(l,0, k)) #[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]





