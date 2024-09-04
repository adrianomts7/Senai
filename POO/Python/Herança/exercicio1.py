from abc import ABC,abstractmethod
from os import system

system(" cls || clear")

class Endereco:
    def __init__(self,logradouro: str,numero: str,complemento: str,cep: str,cidade: str) -> None:
        self.logradouro = logradouro
        self.numero = numero
        self.complemento = complemento
        self.cep = cep
        self.cidade = cidade

    def __str__(self) -> str:
        return (f"\nLogradouro: {self.logradouro}"
                f"\nNúmero: {self.numero}"
                f"\nComplemento: {self.complemento}"
                f"\nCep: {self.cep}"
                f"\nCidade: {self.complemento}"
                )
    
class Funcionario(ABC):
    def __init__(self,nome: str, telefone: str, salario: float,email: str,endereco: Endereco) -> None:
        self.nome = nome
        self.telefone = telefone
        self.salario = salario
        self.email = email
        self.endereco = endereco

    @abstractmethod
    def salarioFinal(self) -> float:     
        pass

    def __str__(self) -> str:
        return (f"{super().__str__()}"
                f"\nNome: {self.nome}"
                f"\nTelefone: {self.telefone}"
                f"\nSálario: {self.salario}"
                f"\nE-mail: {self.email}"
                f"\nEndereço: {self.endereco}"
                )
    
class Engenheiro(Funcionario):
    BONIFICACAO = 0.5
    
    def __init__(self, nome: str, telefone: str, salario: float, email: str, endereco: Endereco,crea: str) -> None:
        super().__init__(nome, telefone, salario, email, endereco)
        self.crea = crea

    def salarioFinal(self) -> float:
        resultado = self.salario * self.BONIFICACAO
        return resultado
    
    def __str__(self) -> str:
        return (f"{super().__str__()}"
                f"\nCREA: {self.crea}"
                )
    
class Medico(Funcionario):
    BONIFICACAO = 0.8
    
    def __init__(self, nome: str, telefone: str, salario: float, email: str, endereco: Endereco,crm: str) -> None:
        super().__init__(nome, telefone, salario, email, endereco)
        self.crm = crm

    def salarioFinal(self) -> float:
        resultado = self.salario * self.BONIFICACAO
        return resultado
    
    def __str__(self) -> str:
        return (f"{super().__str__()}"
                f"\nCRM: {self.crm}"
                )

m1 = Medico("Marta","198273981",5500.9,"Marta@gmail.com",Endereco("Rua A","20","N/A","216716","Salvador"),"219388")
print(m1)
print()
eg1 = Engenheiro("Mario","187236",4500.70,"Mario@gmail.com",Endereco("Rua C","19","N/A","18279","Caninde"),"198273391")
print(eg1)