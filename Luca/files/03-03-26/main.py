def find_file_rec(file_system: dict, filename: str, file_path: str) -> tuple[bool, str]:
    for key, value in file_system.items():
        if type(value) == dict:
            found, path = find_file_rec(value, filename, file_path + key + "/")
            if found:
                return (True, path)
        elif key == filename:
            return (True, file_path + filename)

    return (False, "Non trovato")


def find_file(file_system: dict, filename: str) -> tuple[bool, str]:
    return find_file_rec(file_system, filename, "~/")


file_system = {
    "documenti": {
        "uni": {"appunti.txt": "Ricordarsi di studiare la ricorsione"},
        "lista_spesa.txt": "Latte\nPane\nUova",
    },
    "immagini": {"foto.jpg": "contenuto_binario"},
    "README.txt": "Ecco un file system",
}

print(find_file(file_system, "appunti.txt"))  # True
print(find_file(file_system, "lista_spesa.txt"))  # True
print(find_file(file_system, "foto.jpg"))  # True
print(find_file(file_system, "README.txt"))  # True
print(find_file(file_system, "non_esiste.txt"))  # False
