def count_distinct(words: list[str]) -> int:
    unique = set(words)
    # print(unique)
    return len(unique)


def remove_duplicates(words: list[str]) -> list[str]:
    """
    Removes duplicates from the list while preserving order
    """
    seen = set()
    l = list()

    for e in words:
        if e not in seen:
            l.append(e)
            seen.add(e)

    return l


words = ["p1", "p2", "p3", "p1", "p2", "p4"]
# count = count_distinct(words)
# print(count)

print(remove_duplicates(words))
