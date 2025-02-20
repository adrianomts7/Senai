from models.usuario import Usuario
from sqlalchemy.orm import Session

class usuarioRepository:
    def __init__(self,session: Session) -> None:
        self.session = session

    def salvar_usuario(self, usuario: Usuario):
        self.session.add(usuario)
        self.session.commit()
        self.session.refresh()

    def pesquisar_usuario_por_email(self,email: str):
        return self.session.query(Usuario).filter_by(email = email).first()

    def deletar_usuario(self, usuario: Usuario):
        self.session.delete(usuario)
        self.session.commit()
        self.session.refresh()

    def lista_todos_usuario(self):
        return self.session.query(Usuario).all()