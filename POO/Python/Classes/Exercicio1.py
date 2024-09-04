import os

os.system("cls || clear ")

# Criando a classe Aluno.
class Aluno:
    #Criando um construtor.
    def __init__(self,nome: str,idade: int) -> None:
        self.nome = nome
        self.idade = idade

#Instanciando classes.
aluno = Aluno("Marta",22)

print(aluno.nome)
print(aluno.idade)