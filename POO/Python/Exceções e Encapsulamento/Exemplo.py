import os

os.system("cls || clear")

#Criando minha propria exerção
class SaldoInsuficienteError(Exception):
    pass

class Conta:
    def __init__(self,numero_conta: int,agencia: str) -> None:
        self.numero_conta = numero_conta
        self.agencia = agencia
        self._saldo = 0 # Atributo Protegido usar somente se tiver Herança

    # Semelhante ao getSaldo()
    @property
    def saldo(self): 
        return self._saldo

    def sacar(self) -> str:
        valor_saque = float(input("Digite o valor que deseja sacar: "))
        try:
            self.__verificar_sacar(valor_saque)
            self.__valor_negativo(valor_saque)
        except SaldoInsuficienteError as erro:
            return f"Prezado cliente: {erro}"

        self._saldo -= valor_saque
        return f"Saque Realizado com sucesso!"

    def depositar(self, valor):
        self._saldo += valor
        return self.saldo

    def __verificar_sacar(self,valor) -> None: #Metodo Privado
        if valor > self._saldo:
            raise SaldoInsuficienteError("Saldo insuficiente")

    def __valor_negativo(self,valor) -> None:
        if valor < 0:
            raise SaldoInsuficienteError("Digite um valor positivo")

class ContaCorrente(Conta):
    pass

class ContaPoupança(Conta):
    pass

#Instanciando Classes
conta_corrente = ContaCorrente(222,333)
conta_poupanca = ContaPoupança(444,555)

print(f"Número da Conta: {conta_corrente.numero_conta}")
print(f"Saldo: {conta_corrente.saldo}")

# Sacar com saldo insuficiente
print(conta_corrente.sacar())
print(f"Saldo: R$ {conta_corrente.saldo}")