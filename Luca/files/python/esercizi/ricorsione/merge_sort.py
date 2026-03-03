def merge_sort(v: list[int]):
    if len(v) <= 1:
        return v

    mid = len(v) // 2
    left_half = merge_sort(v[:mid])
    right_half = merge_sort(v[mid:])

    return merge(left_half, right_half)


def merge(left: list[int], right: list[int]):
    merged = []
    i = j = 0

    while i < len(left) and j < len(right):
        if left[i] < right[j]:
            merged.append(left[i])
            i += 1
        else:
            merged.append(right[j])
            j += 1

    merged.extend(left[i:])
    merged.extend(right[j:])

    return merged


v = [1, 5, -2, 6, 51, -24, 5, 3, 18]
print(f"sorted: {merge_sort(v)}")
