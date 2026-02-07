def cifraio(s, k: int):
    for i in range(len(s)):
        c = s[i]
        if ord(c) >= ord("a") and ord(c) <= ord("z"):
            pos_in_alfabeto = ord(c) - ord("a")
            shifted_pos_in_alfabeto = (pos_in_alfabeto + k) % (ord("z") - ord("a") + 1)
            cripted = chr(ord("a") + shifted_pos_in_alfabeto)
            s[i] = cripted
        elif ord(c) >= ord("A") and ord(c) <= ord("Z"):
            pos_in_alfabeto = ord(c) - ord("A")
            shifted_pos_in_alfabeto = (pos_in_alfabeto + k) % (ord("Z") - ord("A") + 1)
            cripted = chr(ord("A") + shifted_pos_in_alfabeto)
            s[i] = cripted


s = list("abc%-deFg")
k = -1

# print(s_l)

cifraio(s, k)
print(s)
