class Aluno:

    def __init__(self, nome, curso, sexo, ano_ingresso):
        self.nome = nome
        self.curso = curso
        self.sexo = sexo
        self.ano_ingresso = ano_ingresso

    def __str__(self):
        return f"{self.nome} | {self.curso} | {self.sexo} | {self.ano_ingresso}"