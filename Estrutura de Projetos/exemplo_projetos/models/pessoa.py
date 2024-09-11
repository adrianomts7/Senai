from models.enum.sexo import sexo

class Pessoa:
    def __init__(self,nome: str,idade: int,sexo: sexo) -> None:
        self.nome = nome 
        self.idade = idade
        self.sexo = sexo

    def __str__(self) -> str:
        return (f"\nNome: {self.nome}"
                f"\nIdade: {self.idade}"
                f"\nSexo: {self.sexo.value}"
                )    