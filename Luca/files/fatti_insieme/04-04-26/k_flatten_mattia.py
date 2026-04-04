def k_flatten_rec(l: list[int | list], depth: int, k: int)->list[int]:
    flattened = []
    sum = 0


    for x in l:
        if isinstance(x, list): # x è una lista
            if depth < k:
                s = k_flatten_rec(x, depth+1, k)
                for x in s:
                    flattened.append(x)
            else:
                s = k_flatten_rec(x, depth+1, k)
                sum = s[0]

        else:
            if depth < k:
                flattened.append(x)
            else:
                sum += x
    
    if depth < k:
        return flattened
    else:
        return [sum]

l = [1, [2, 3, [4, 5, 6], 7], [[8, 9], [10, 11]]]
k = 2

print(k_flatten_rec(l,0, k)) #[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]





