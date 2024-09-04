import os

os.system("cls || clear ")

# Criando a classe Aluno.
class Aluno:
    #Criando um construtor.
    def __init__(self,nome: str,idade: int) -> None:
        self.nome = nome
        self.idade = idade
    # Criando um método para exibir os dados.
    def exibir_dados(self) -> str:
        return (f"Nome: {self.nome}"
            f"\nIdade: {self.idade}"
            )

#Instanciando classes.
aluno = Aluno("Marta",22)

print(aluno.exibir_dados())