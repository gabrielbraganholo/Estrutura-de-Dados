import random

def popular_lista_aleatoria(lista, quantidade, fase_inicial, fase_final):
    """método que popula uma lista com números inteiros e aleatórios dentro de uma faixa

    Args:
        lista (int): armazena números inteiros e aleatórios
        quantidade (int): total de números inteiros a serem inseridos
        fase_inicial (int): número inicial da faixa
        fase_final (int): número final da faixa
    """
    for i in range(quantidade):
        lista.append(random.randint(fase_inicial, fase_final))

def exibir_lista(lista):
    """método que recebe uma lista e a exibe, elementos um abaixo do outro

    Args:
        lista (int)/: lista contendo números inteiros
    """
    for item in lista:
        print(item)

    print("+---------------+")
    print("Total de elementos: ", len(lista))