# v = []
# for i in range(15):
#     v.append(set())

v = [set() for _ in range(15)]
v[1].add(3)
print(v)
