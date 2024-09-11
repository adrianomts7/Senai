from models.enum.sexo import Sexo
from models.enum.setor import Setor
from models.funcionario import funcionario

f1 = funcionario(29187,"Marta",22,2567.88,Setor.FINANCEIRO,Sexo.FEMININO)
print(f1)