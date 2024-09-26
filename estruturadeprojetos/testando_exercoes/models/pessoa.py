class Pessoa:
    def __init__(self,nome: str,idade: int) -> None:
        self.nome = nome
        self.idade = self._verificar_idade(idade)

    def _verificar_idade(self,valor):
        self.__verificar_idade_tipo_invalido(valor)
        self.__verificar_idade_negativa(valor)
        self.__verificar_idade_acima_130(valor)

        self.idade = valor
        return valor
    
    def __verificar_idade_tipo_invalido(self,valor):
        if not isinstance(valor, int):
            raise TypeError("A idade deve ser um numero inteiro")

    def __verificar_idade_negativa(self,valor):
        if valor < 0:
            raise ValueError("A idade não pode ser negativa")
    
    def __verificar_idade_acima_130(self,valor):
        if valor > 130:
            raise ValueError("A idade não pode ser maior que 130 Anos")