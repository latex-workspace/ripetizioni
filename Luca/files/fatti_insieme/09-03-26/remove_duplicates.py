from pprint import pprint

t = {
    "v": 1,
    "childs": [
        {
            "v": 2,
            "childs": [
                {"v": 5, "childs": []},
                {
                    "v": 6,
                    "childs": [
                        {
                            "v": 2,
                            "childs": [
                                {"v": 3, "childs": []},
                                {"v": 3, "childs": []},
                            ],
                        },
                    ],
                },
            ],
        },
        {
            "v": 3,
            "childs": [
                {"v": 8, "childs": []},
                {"v": 9, "childs": []},
                {"v": 10, "childs": []},
            ],
        },
        {
            "v": 4,
            "childs": [
                {"v": 7, "childs": []},
                {
                    "v": 1,
                    "childs": [
                        {
                            "v": 4,
                            "childs": [
                                {
                                    "v": 7,
                                    "childs": [
                                        {"v": 8, "childs": []},
                                    ],
                                },
                                {"v": 8, "childs": []},
                            ],
                        },
                    ],
                },
            ],
        },
    ],
}


def count_rec(t: dict, rv: dict[int, int]):
    if t["v"] not in rv:
        rv[t["v"]] = 0
    rv[t["v"]] += 1

    for c in t["childs"]:
        count_rec(c, rv)


def count(t: dict):
    rv = {}
    count_rec(t, rv)

    return rv


def remove_duplicates_rec(t: dict, duplicates: set[int]) -> int:
    duplicates_count = 0
    if t["v"] in duplicates:
        t["v"] = "x"
        duplicates_count += 1

    for c in t["childs"]:
        duplicates_count += remove_duplicates_rec(c, duplicates)
    return duplicates_count


def remove_duplicates(t: dict) -> int:
    values_count = count(t)
    duplicates = set()
    for k, v in values_count.items():
        if v > 1:
            duplicates.add(k)

    # print(duplicates)
    return remove_duplicates_rec(t, duplicates)


duplicates_count = remove_duplicates(t)
print(f"found {duplicates_count} duplicated")
