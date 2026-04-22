def get_dot_notation(t: dict) -> str:
    id = 0
    nodes = edges = ""

    def get_dot_rec(t: dict) -> int:
        nonlocal id, nodes, edges
        my_id = id
        id += 1
        nodes += f"{my_id} [label={t['v']}]\n"

        for c in t["childs"]:
            child_id = get_dot_rec(c)
            edges += f"{my_id} -> {child_id}\n"

        return my_id

    get_dot_rec(t)
    return f"digraph T {{\n{nodes}\n{edges}}}"
