from abc import ABC,abstractmethod
from os import system

system(" cls || clear")

class Funcionario(ABC):
    def __init__(self, nome: str,salario:float) -> None:
        self.nome = nome
        self.salario = salario

    @abstractmethod
    def salarioFinal(self) -> float:
        pass

    def __str__(self) -> str:
        return (
            f"Nome: {self.nome}"
            f"\nSálario: {self.salario}"
        )


class Motoboy(Funcionario):
    #Acréscimo de 10%
    BONIFICACAO = 1.1

    def salarioFinal(self) -> float:
        resultado = self.salario * self.BONIFICACAO
        return resultado

class Engenheiro(Funcionario):

    BONIFICACAO = 1.2

    def __init__(self, nome: str, salario: float, crea:str) -> None:
        super().__init__(nome, salario)
        self.crea = crea

    def salarioFinal(self) -> float:
        resultado = self.salario * self.BONIFICACAO
        return resultado

    def __str__(self) -> str:
        return (f"{super().__str__()}"
                f"\nCREA: {self.crea}"
                )


moto1 = Motoboy("Marcio",2550.95)
print(moto1)
print(f"Sálario Final R$ {moto1.salarioFinal()}")
print()
eng1 = Engenheiro("Marta",2550.95,"19823791")
print(eng1)