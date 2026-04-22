def get_names_by_age(d: dict[str, int], target_age: int) -> list[str]:
    names = []
    for name, age in d.items():
        # print(name, age)
        if target_age == age:
            names.append(name)

    return names


d = {"alice": 14, "sara": 22, "bob": 16, "marco": 22}
print("Nomi con età 22: ", get_names_by_age(d, 22))
print("Nomi con età 16: ", get_names_by_age(d, 16))
print("Nomi con età 11: ", get_names_by_age(d, 11))
