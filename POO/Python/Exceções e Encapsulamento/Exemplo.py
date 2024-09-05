import os

os.system("cls || clear")

class Conta:
    def __init__(self,numero_conta: int,agencia: str) -> None:
        self.numero_conta = numero_conta
        self.agencia = agencia
        self._saldo = 0 # Atributo Protegido usar somente se tiver Herança

    # Semelhante ao getSaldo()
    @property
    def saldo(self): 
        return self._saldo

    def sacar(self,valor):
        self._saldo -= valor
        return self._saldo

    def depositar(self, valor):
        self._saldo += valor
        return self.saldo

class ContaCorrente(Conta):
    pass

class ContaPoupança(Conta):
    pass

#Instanciando Classes
conta_corrente = ContaCorrente(222,333)
conta_poupanca = ContaPoupança(444,555)

#print(f"Saldo: {conta_corrente._saldo}") 
#print(f"Saldo: {conta_corrente.saldo()}")
print(f"Número da Conta: {conta_corrente.numero_conta}")
print(f"Saldo: {conta_corrente.saldo}")