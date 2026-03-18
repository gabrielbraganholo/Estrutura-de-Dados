from classes import Clima

def popular_lista(lista, nome_base):

    reader = open(nome_base, "r", encoding="utf8")

    for linha in reader:
        vetor_linha = linha.strip().split(",")
        obj = Clima(vetor_linha[0], vetor_linha[1], vetor_linha[2], vetor_linha[3].capitalize)

        if obj not in lista:
            lista.append(obj)

    reader.close()
    