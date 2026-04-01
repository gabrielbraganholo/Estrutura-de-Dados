from classes import Clima

def popular_lista(lista, nome_base):

    reader = open(nome_base, "r", encoding="utf8")

    for linha in reader:
        vetor_linha = linha.strip().split(",")
        obj = Clima(vetor_linha[0], vetor_linha[1], vetor_linha[2], vetor_linha[3])

        if obj not in lista:
            lista.append(obj)

    reader.close()

def exibir_lista(lista):
    for item in lista:
        print(f"{item.ano} - {item.mes} - {item.temperatura} - {item.precipitacao}")

def mes_mais_quente(lista):
    meses = ["Janeiro","Fevereiro","Março","Abril","Maio","Junho","Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"]

    maior = 0
    resultado = []

    for mes in meses:
        contador = 0

        for item in lista:
            if item.mes == mes and item.temperatura == "Quente":
                contador += 1

        if contador > maior:
            maior = contador
            resultado.clear()
            resultado.append(mes)

        elif contador == maior:
            resultado.append(mes)

    return resultado


def ano_mais_quente(lista):
    anos = ["2020","2021","2022","2023","2024"]

    maior = 0
    resultado = []

    for ano in anos:
        contador = 0

        for item in lista:
            if item.ano == ano and item.temperatura == "Quente":
                contador += 1

        if contador > maior:
            maior = contador
            resultado.clear()
            resultado.append(ano)

        elif contador == maior:
            resultado.append(ano)

    return resultado


def ano_mais_chuvoso(lista):
    anos = ["2020","2021","2022","2023","2024"]

    maior = 0
    resultado = []

    for ano in anos:
        contador = 0

        for item in lista:
            if item.ano == ano and item.precipitacao == "muita":
                contador += 1

        if contador > maior:
            maior = contador
            resultado.clear()
            resultado.append(ano)

        elif contador == maior:
            resultado.append(ano)

    return resultado