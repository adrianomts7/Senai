from services.usuario_services import UsuarioService
from repositories.usuario_repository import usuarioRepository
from config.connection import Session

def main():
    session = Session()
    repository = usuarioRepository
    service = UsuarioService

    service.criar_usuario("Marta","marta@gmail.com","123")

    print("\nListando todos os usuarios")
    usuarios = service.listar_todos_usuarios()

    for usuario in usuarios:
        print(f"{usuario.nome} - {usuario.email}")

if __name__ == "__main__":
    main()