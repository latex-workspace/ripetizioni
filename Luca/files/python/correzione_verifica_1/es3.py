# punto 3: parsing dizionario
def create_dict(record: str) -> dict[str, str] | None:
    # punto 2: pulizia
    record = record.strip()
    record = record.removeprefix("##")
    record = record.removesuffix("##")

    result = dict()
    for item in record.split(";"):
        key, value = item.split(":")
        result[key.strip().lower()] = value.strip()

    if "messaggio" not in result or "utente" not in result:
        return None

    # punto 4 normalizzazione
    cleared_mex = result["messaggio"]
    while cleared_mex.endswith(".") or cleared_mex.endswith("!"):
        cleared_mex = cleared_mex[:-1]

    cleared_mex = cleared_mex.replace("_", " ")
    result["messaggio"] = cleared_mex.strip()

    result["utente"] = result["utente"].upper()

    return result


def parse(raw_data: str) -> list[dict[str, str]]:
    result = []

    raw_data = raw_data.strip()
    for record in raw_data.split("|"):
        message = create_dict(record)
        if message is not None:
            result.append(message)
        else:
            print("Warning: malformed record skipped:", record)

    return result


def filter(messages: list[dict[str, str]]) -> list[dict[str, str]]:
    result = []
    for message in messages:
        if not "errore" in message["messaggio"].lower():
            result.append(message)

    return result


raw_data = """ ##messaggio:ciao_mondo!! ; utente:mario88 ; data:2024-05-20## |
##messaggio:python_e_bello ; utente:luca_deep ; data:2024-05-21## |
##messaggio:errore_di_sistema... ; utente:admin_99 ; data:2024-05-22## |
##messaggio:nuovo_aggiornamento_disponibile... ; utente:dev_user ;
data:2024-05-23## | ##messaggio:attenzione_errore_fatale!!! ; utente:root_admin ;
data:2024-05-24## | ##messaggio:tutto_funziona_correttamente ; utente:user_test ;
data:2024-05-25## """


out = parse(raw_data)
print("Out:\n", out)
filtered_out = filter(out)
print("Filtered out:\n", filtered_out)
