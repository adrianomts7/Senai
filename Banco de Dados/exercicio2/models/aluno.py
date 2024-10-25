from sqlalchemy import Column,String,Integer
from sqlalchemy.orm import declarative_base
from config.conexao import db

Base = declarative_base()

class Aluno(Base):
    __tablename__ = "alunos"

    id = Column(Integer, primary_key=True, autoincrement=True)
    ra = Column(String(250), unique=True)
    nome = Column(String(250))
    sobrenome = Column(String(250))
    email = Column(String(250))
    senha = Column(String(250))

    def __init__(self,ra: str, nome: str, sobrenome: str, email: str, senha: str):
        self.ra = ra
        self.nome = nome
        self.sobrenome = sobrenome
        self.email = email
        self.senha = senha

Base.metadata.create_all(bind=db)