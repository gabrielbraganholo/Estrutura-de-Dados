from classes import Clima
from funcoes import popular_lista, exibir_lista, mes_mais_quente, ano_mais_quente, ano_mais_chuvoso

lista = []
base_dados = "base.csv"

popular_lista(lista, base_dados)
exibir_lista(lista)

meses = mes_mais_quente(lista)
print("Meses mais quentes:", meses)

anos_quente = ano_mais_quente(lista)
print("Anos mais quentes:", anos_quente)

anos_chuva = ano_mais_chuvoso(lista)
print("Anos mais chuvosos:", anos_chuva)