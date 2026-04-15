from matriz import Matriz

dimensao = 10
matriz = [[0 for _ in range(dimensao)] for _ in range(dimensao)]

#gerando uma matriz especial
matriz[1][5] = 1
matriz[6][4] = 1
matriz[1][3] = 1
matriz[6][8] = 1
matriz[3][8] = 1
matriz[4][2] = 1

Matriz.exibir_matriz(matriz, dimensao, dimensao)

lista_especial = []
Matriz.converter_matriz(matriz, dimensao, dimensao, lista_especial)
Matriz.exibir_lista(lista_especial)
