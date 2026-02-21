vendite = [
    "Mela",
    "Mela",
    "Banana",
    "Mela",
    "Arancia",
    "Banana",
    "Mela",
    "Kiwi",
    "Banana",
    "Banana",
]


def create_dict(vendite: list[str]) -> dict[str, int]:
    result = dict()
    for item in vendite:
        if item in result:
            result[item] += 1
        else:
            result[item] = 1

    return result


# Se ci sono più item con lo stesso numero di vendite, restituisco uno qualsiasi di essi
def get_best_selling_1(vendite: dict[str, int]) -> str | None:
    best_selling = None
    for item, count in vendite.items():
        if best_selling is None or count > vendite[best_selling]:
            best_selling = item

    return best_selling


# Se ci sono più item con lo stesso numero di vendite, restituisco tutti i best selling items
def get_best_selling_2(vendite: dict[str, int]) -> list[str] | None:
    best_selling = None
    for item, count in vendite.items():
        if best_selling is None or count > vendite[best_selling]:
            best_selling = item
    if best_selling is None:
        return None

    result = []
    for item, count in vendite.items():
        if count == vendite[best_selling]:
            result.append(item)

    return result


dict_vendite = create_dict(vendite)
print("Vendite:", dict_vendite)
print("Best selling item (1):", get_best_selling_1(dict_vendite))
print("Best selling item (2):", get_best_selling_2(dict_vendite))
