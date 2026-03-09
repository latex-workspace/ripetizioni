def conta_vocali(s):
    vocali = {"a": 0, "e": 0, "i": 0, "o": 0, "u": 0}

    for lettera in s:
        if lettera in vocali:
            vocali[lettera] += 1

    return vocali


s = "ciaoao"
print(conta_vocali(s))
