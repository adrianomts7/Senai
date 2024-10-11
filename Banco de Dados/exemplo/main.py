from sqlalchemy import create_engine,String,Integer,Column
from sqlalchemy.orm import sessionmaker,declarative_base
import os

# Criando banco de dados
db = create_engine("sqlite:///meubanco.db")

# Conexão com o banco de dados
Session = sessionmaker(bind=db)
session = Session()

# Criando tabela
Base = declarative_base()

class Usuario(Base):
    # Definindo nome da tabela
    __tablename__ = "usuarios"
    
    # Definindo atributos da tabelas
    id = Column("id",Integer, primary_key=True, autoincrement=True)
    nome = Column("nome", String)
    email = Column("email", String)
    senha = Column("senha", String)

    def __init__(self, nome: str, email: str, senha: str) -> None:
        self.nome = nome
        self.email = email
        self.senha = senha

os.system("cls || clear")

# Criando tabela no banco de dados
Base.metadata.create_all(bind=db)

# Salvar no banco de dados.
for i in range(2):
    nome = input("Digite o seu nome: ")
    email = input("Digite o seu email: ")
    senha = input("Digite a sua senha: ")

    os.system("cls || clear")
    usuario = Usuario(nome=nome,email=email,senha=senha)
    session.add(usuario)
    session.commit()

# Mostrando conteúdos do banco de dados
print("Listando Usuario do banco de dados")
lista_usuarios = session.query(Usuario).all()

for usuario in lista_usuarios:
    print(f"{usuario.id} - {usuario.nome} - {usuario.email} - {usuario.senha}")

# Deletando um usuario
print("\nExcluindo usuario do banco de dados.")
email_usuario = input("Informe o email do usuario: ")
usuario = session.query(Usuario).filter_by(email=email_usuario).first()

if usuario:
    session.delete(usuario)
    session.commit()
    print("\nUsuario deletado com sucesso")
else: 
    print("\nUsuario não foi deletado")

# Atualizando a lista após deletar o usuario
print("\nLista atualizadaq após deletar usuario no banco de dados")
lista_usuarios = session.query(Usuario).all()

for usuario in lista_usuarios:
    print(f"{usuario.id} - {usuario.nome} - {usuario.email} - {usuario.senha}")

# Atualizar usuario
print("Atualizando dados do usuario")
email_usuario = input("Informe o email do usuario: ")

usuario = session.query(Usuario).filter_by(email=email_usuario).first()

if usuario:
    usuario.nome = input("Digite o seu nome: ")
    usuario.email = input("Digite o seu email: ")
    usuario.senha = input("Digite sua senha: ")
    session.commit()

else:
    print("\nUsuario não encontrado.")

# Pesquisando um usuario
print("\nPesquisando o Usuario")
email_usuario = input("Informe o email do usuario: ")

usuario = session.query(Usuario).filter_by(email=email_usuario).first()
if usuario:
    print(f"{usuario.id} - {usuario.nome} - {usuario.email}")
else:
    print("\nUsuario não encontrado")

# Fechando conexão 
session.close()