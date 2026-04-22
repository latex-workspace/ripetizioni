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


def search(t: dict, val: int) -> bool:
    if t["v"] == val:
        return True

    for c in t["childs"]:
        if search(c, val) == True:
            return True

    return False


print(search(t, -10))
