import pytest
from projeto_com_teste.models.enums.sexo import Sexo
from projeto_com_teste.models.pessoa import Pessoa

@pytest.fixture
def pessoa_valida():
    pessoa = Pessoa("Marta",22,Sexo.FEMININO)
    return pessoa

def test_pessoa_mudar_nome(pessoa_valida):
    pessoa_valida._nome = "Jose"
    assert pessoa_valida._nome == "Jose"

def test_pessoa_nome_valido(pessoa_valida):
    assert pessoa_valida._nome == "Marta"

def test_pessoa_idade_valida(pessoa_valida):
    assert pessoa_valida._idade == 22 

def test_pessoa_idade_negativa(pessoa_valida):
    pessoa_valida.set_idade(-1)
    assert pessoa_valida._idade == 0