from sqlalchemy import create_engine,String,Integer,Column
from sqlalchemy.orm import sessionmaker,declarative_base
import os

db = create_engine("sqlite:///meubanco.db")

Session = sessionmaker(bind=db)
session = Session()

Base = declarative_base()

class Aluno(Base):
    __tablename__ = "alunos"
    
    ra = Column("registro", Integer, primary_key=True, autoincrement=True)
    nome = Column("nome", String)
    idade = Column("idade", Integer)
    email = Column("email", String)

    def __init__(self, nome: str, idade: int, email: str) -> None:
        self.nome = nome
        self.idade = idade
        self.email = email

os.system(" cls || clear ")

Base.metadata.create_all(bind=db)

for i in range(2):
    nome = input("Digite o seu nome: ")
    idade = int(input("Digite a sua idade: "))
    email = input("Digite o seu email: ")

    os.system("cls || clear")
    aluno = Aluno(nome=nome, idade=idade, email=email)
    session.add(aluno)
    session.commit()

lista_alunos = session.query(Aluno).all()

for usuario in lista_alunos:
    print(f"{aluno.ra} - {aluno.nome} - {aluno.idade} - {aluno.email}")     