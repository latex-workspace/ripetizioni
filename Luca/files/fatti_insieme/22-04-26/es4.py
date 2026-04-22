# def f(v: list[int]):
#     if len(v) == 0:
#         return 0
#
#     even = []
#     odd = []
#     for i in range(len(v)):
#         if v[i] % 2 == 0:
#             even.append(v[i])
#         else:
#             odd.append(v[i])
#
#     return f(even) + f(odd) + 1

def r():
    count = 0
    def f(v: set[int], comb: list[int]):
        nonlocal count
    
    
        if len(v) == 0:
            count +=1
            print(comb)
            return 0
    
    
        for i in v:
            comb.append(i)
            diff = v.difference({i})
            f(diff, comb)
            comb.pop()
    f(set([1,2,3,4]), [])
    print(count)


r()
# f(set([1,2,3,4,5,6,7,8]), [])

