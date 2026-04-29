from funcoes import *

base = "base.csv"
lista_alunos = []

contagem = {}

popular_lista(lista_alunos, base)
exibir_lista(lista_alunos)

ordenar_lista(lista_alunos)
exibir_lista(lista_alunos)

buscar_por_nome(lista_alunos)

contagem = alunos_cada_ano(lista_alunos)
print(contagem)