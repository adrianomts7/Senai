from models.aluno import Aluno
from repositorio.aluno_repositorio import AlunoRepository

class AlunosServices:
    def __init__(self, repositorio: AlunoRepository) -> None:
        self.repositorio = repositorio

    def criar_aluno(self, nome: str, email: str, senha: str):
        try:
            aluno = Aluno(nome=nome, email=email, senha=senha)
            self.repositorio.salvar_aluno(aluno)
            print("Aluno Salvo com sucesso")
        except TypeError as erro:
            print(f"Erro ao salvar o arquivo: {erro}")
        except Exception as erro:
            print(f"Ocorreu um erro inesperado: {erro}")

    def listar_todos_alunos(self):
        return self.repositorio.lista_todos_alunos()