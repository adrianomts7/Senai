from models.enum.setor import Setor
from models.enum.sexo import Sexo
from models.enum.unidade_federativa import unidadeFederativa
from models.endereco import Endereco

class Funcionario:
    def __init__(self,id: int,nome: str,cpf: str,rg: str,matricula: str,dataNascimento: str,sexo: Sexo,setor: Setor,salario: float,telefone: str,email: str,endereco: Endereco) -> None:
        self.id = id
        self.nome = nome
        self.cpf = cpf
        self.rg = rg
        self.matricula = matricula
        self.dataNascimento = dataNascimento
        self.sexo = sexo
        self.setor = setor
        self.salario = salario
        self.telefone = telefone
        self.email = email
        self.endereco = endereco

    def __str__(self) -> str:
        return(f"\nId: {self.id}"
               f"\nNome: {self.nome}"
               f"\nCpf: {self.cpf}"
               f"\nRg: {self.rg}"
               f"\nMatricula: {self.matricula}"
               f"\nData de Nascimento: {self.dataNascimento}"
               f"\nSetor: {self.setor.value}"
               f"\nSálario: R$ {self.salario}"
               f"\nTelefone: {self.telefone}"
               f"\nE-mail: {self.email}"
               f"\nEndereço: {self.endereco}"
               )