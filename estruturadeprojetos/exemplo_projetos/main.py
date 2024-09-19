from models.pessoa import Pessoa
from models.enum.sexo import sexo

aluno = Pessoa("Marta",22,sexo.FEMININO)
print(aluno)