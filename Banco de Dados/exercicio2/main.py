from servicos.aluno_servico import AlunosServices
from repositorio.aluno_repositorio import AlunoRepository
from configuracao.conexao import Session

session = Session()
repositorio = AlunoRepository(session)
services = AlunosServices(repositorio)

ra = str(input("Digite o seu ra: "))
nome = str(input("Digite o seu nome: "))
sobrenome = str(input("Digite o seu sobrenome: "))
email = str(input("Digite o seu e-mail: "))
senha = str(input("Digite a sua senha: "))

services.criar_aluno(ra=ra, nome=nome, sobrenome=sobrenome, email=email, senha=senha)

alunos = services.listar_todos_alunos()

for aluno in alunos:
    print(f"{aluno.ra} - {aluno.nome} - {aluno.sobrenome}")


