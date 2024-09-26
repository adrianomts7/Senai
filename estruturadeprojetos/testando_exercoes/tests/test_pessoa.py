import pytest
from testando_exercoes.models.pessoa import Pessoa

@pytest.fixture
def pessoa_valida():
    return Pessoa("Marta",22)

def test_pessoa_nome_valido(pessoa_valida):
    assert pessoa_valida.nome == "Marta"

def test_pessoa_idade_valida(pessoa_valida):
    assert pessoa_valida.idade == 22

def test_pessoa_idade_negativa_retorna_mensagem():
    with pytest.raises(ValueError, match="A idade não pode ser negativa"):
        Pessoa("Marta",-22)

def test_pessoa_idade_acima_130_retorna_mensagem():
    with pytest.raises(ValueError, match="A idade não pode ser maior que 130 Anos"):
        Pessoa("Marta",131)

def test_pessoa_idade_tipo_invalido_retorna_mensagem():
    with pytest.raises(TypeError, match="A idade deve ser um numero inteiro"):
        Pessoa("Marta","22")