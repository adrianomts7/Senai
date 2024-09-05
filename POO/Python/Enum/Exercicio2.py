from enum import Enum
import os

os.system("cls || clear")

class Sexo(Enum):
    MASCULINO = "Masculino"
    FEMININO = "Feminino"

class Setor(Enum):
    FINANCEIRO = "Financeiro"
    RECURSOS_HUMANOS = "Recursos Humanos"
    VENDAS = "Vendas"
    MARKETING = "Marketing"

class Funcionario:
    def __init__(self, id: str,nome: str,salario: float,setor: Setor, sexo: Sexo,idade: int) -> None:
        self.id = id
        self.nome = nome
        self.salario = salario
        self.setor = setor
        self.sexo = sexo
        self.idade = idade

    def __str__(self) -> str:
        return (f"Id: {self.id}"
                f"\nNome: {self.nome}"
                f"\nSálario: R$ {self.salario}"
                f"\nSetor: {self.setor.value}"
                f"\nSexo: {self.sexo.value}"
                f"\nIdade: {self.idade}"    
                )

f1 = Funcionario("172681","Marta",5007.90,Setor.FINANCEIRO,Sexo.FEMININO,22)
print(f1)   