from os import system

system(" cls || clear")

class ContaBancaria:
    def __init__(self,banco: str,agencia: str,numeroConta: str,tipoConta: str,saldoAtual: float,limiteDisponivel) -> None:
        self.banco = banco
        self.agencia = agencia
        self.numeroConta = numeroConta
        self.tipoConta = tipoConta
        self.saldoAtual = saldoAtual
        self.limiteDisponivel = limiteDisponivel

    def __str__(self) -> str:
        return (
            f"\nBanco: {self.banco}"
            f"\nAgência: {self.agencia}"
            f"\nNúmero da Conta: {self.numeroConta}"
            f"\nTipo de Conta: {self.tipoConta}"
            f"\nSaldo Atual: R$ {self.saldoAtual}"
            f"\nLimite Disponivel: R$ {self.limiteDisponivel}"
        ) 
    
class Funcionario:
    def __init__(self, codigoFuncionario: str,nome: str,endereco: str,telefone: str,email: str, contaBanco: ContaBancaria) -> None:
        self.codigoFuncionario = codigoFuncionario
        self.nome = nome
        self.endereco = endereco
        self.telefone = telefone
        self.email = email
        self.contaBanco = contaBanco

    def __str__(self) -> str:
        return (
            f"\nCódigo Funcionario: {self.codigoFuncionario}"
            f"\nNome: {self.nome}"
            f"\nEndereço: {self.endereco}"
            f"\nTelefone: {self.telefone}"
            f"\nE-mail: {self.telefone}"
            f"\nConta Bancaria: {self.contaBanco}"
        )
    
marta = Funcionario("198237198","Marta","Rua A","817291827","Marta@gmail.com",
                    ContaBancaria("Caixa","10928","019280","Conta Poupança",1500.50,5000))

print(marta)