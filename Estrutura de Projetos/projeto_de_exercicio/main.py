from models.endereco import Endereco
from models.enum.setor import Setor
from models.enum.sexo import Sexo
from models.enum.unidade_federativa import unidadeFederativa
from models.funcionario import Funcionario

f2 = Funcionario(23981,"Mateus","17781628","091820","917929","20/07/2000",Sexo.MASCULINO,Setor.ENGENHARIA,6500,"719203212","Mateus@gmail.com",Endereco("Rua A","20","Nada","27218681","Salvador",unidadeFederativa.BAHIA))
print(f2)