import pytest 
from models.conta import Conta

@pytest.fixture
def conta_valida():
    return Conta(222,333)

def test_numero_conta_valor(conta_valida):
    assert conta_valida._numero_conta == 222

def test_agencia_valida(conta_valida):
    assert conta_valida._agencia == 333

def test_depositar_valor_positivo(conta_valida):
    conta_valida.depositar(100)
    assert conta_valida._saldo == 100

def test_saldo_inicial_zero(conta_valida):
    assert conta_valida._saldo == 0

def test_deposito_valor_negativo_saldo_zero(conta_valida):
    conta_valida.depositar(-100)
    assert conta_valida._saldo == 0