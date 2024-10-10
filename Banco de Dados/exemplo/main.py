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
usuario = Usuario(nome="Marta",email="marta@gmaill.com",senha="123")
session.add(usuario)
session.commit()

# Mostrando conteúdos do banco de dados
lista_usuarios = session.query(Usuario).all()

for usuario in lista_usuarios:
    print(f"{usuario.id} - {usuario.nome} - {usuario.email} - {usuario.senha}")