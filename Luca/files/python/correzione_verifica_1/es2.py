def filter(
    lista: list[tuple[str, str, float]], category: str
) -> list[tuple[str, str, float]]:
    result = []
    for item in lista:
        if item[1] == category:
            result.append(item)

    return result


def get_tot_import(lista: list[tuple[str, str, float]]) -> float:
    result = 0.0
    for item in lista:
        result += item[2]

    return result


spese = [
    ("Marco", "Trasporti", 50.0),
    ("Giulia", "Cibo", 15.5),
    ("Marco", "Cibo", 24.5),
    ("Luca", "Alloggio", 100.0),
    ("Giulia", "Trasporti", 30.0),
]

category = "Trasporti"
trasporti = filter(spese, category)
print(f'Lista filtrata per "{category}": ', trasporti)
print(f'Spese per categoria "{category}":', get_tot_import(trasporti))
