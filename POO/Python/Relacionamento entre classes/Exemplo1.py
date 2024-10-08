from os import system

system(" cls || clear")

class Endereco:
    def __init__(self,logradouro: str, numero:str) -> None:
        self.logradouro = logradouro
        self.numero = numero
    
    #Semelhante ao ToString()
    def __str__(self) -> str:
        return (
            f"\nLogradouro: {self.logradouro}"
            f"\nNúmero: {self.numero}"
            )
    
class Aluno:
    def __init__(self,nome: str,idade: int,endereco: Endereco) -> None:
        self.nome = nome
        self.idade = idade
        self.endereco = endereco
    
    def __str__(self) -> str:
        return (
            f"Nome: {self.nome}"
            f"\nIdade: {self.idade}"
            f"\nEndereço: {self.endereco}"    
            )
    
aluno = Aluno("Mario",20, Endereco("Rua A","33"))

print(aluno)