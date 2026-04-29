from aluno import Aluno


def popular_lista(lista, base):

    arquivo = open(base, "r", encoding="utf8")

    for item in arquivo:
        vetor_linha = item.strip().split(",")
        obj = Aluno(vetor_linha[0], vetor_linha[1], vetor_linha[2], int(vetor_linha[3]))

        if obj not in lista:
            lista.append(obj)

    arquivo.close()


def exibir_lista(lista):

    for item in lista:
        print(item)

    print("")


def ordenar_lista(lista):

    lista.sort(key=lambda aluno: (aluno.ano_ingresso, aluno.nome))


def buscar_por_nome(lista):

    nome = input("Digite um nome: ")

    for aluno in lista:
        if nome.lower() in aluno.nome.lower():
            print(aluno)
            print(" ")
            return

    print("Nome não encontrado!")
    print(" ")


def alunos_cada_ano(lista):

    quantidade = {}

    for aluno in lista:
        ano = aluno.ano_ingresso

        if ano in quantidade:
            quantidade[ano] += 1
        else:
            quantidade[ano] = 1

    return quantidade