import os

os.system("cls || clear")

class Pet:
    def __init__(self,nome: str, idade: int, raca: str, porte: str, alimentacao: str) -> None:
        self.nome = nome
        self.idade = idade
        self.raca = raca
        self.porte = porte
        self.alimentacao = alimentacao

    def exibir_dados(self) -> str:
       return (f"Nome: {self.nome}"
         f"\nIdade: {self.idade}"
         f"\nRaça: {self.raca}"
         f"\nPorte: {self.porte}"
         f"\nAlimentação: {self.alimentacao}"
         )
        
dig = Pet("Dig",8,"Pinsher","Pequeno","Ração")
dex = Pet("Dex",5,"vira-lata","Grande","Comida")

print(dig.exibir_dados())
print()
print(dex.exibir_dados())