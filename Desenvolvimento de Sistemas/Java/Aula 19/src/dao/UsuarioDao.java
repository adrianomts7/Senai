package src.dao;

import java.util.ArrayList;
import java.util.List;

import src.model.Usuario;

public class UsuarioDao {
    
    private List<Usuario> usuarios;

    public UsuarioDao() {
        // Exemplo de dados de usuários
        usuarios = new ArrayList<>();
        usuarios.add(new Usuario("admin", "1234"));
        usuarios.add(new Usuario("usuario", "senha"));
    }

    public boolean autenticarUsuario(String login, String senha) {
        // Verifica se o login e senha estão corretos
        for (Usuario usuario : usuarios) {
            if (usuario.getLogin().equals(login) && usuario.getSenha().equals(senha)) {
                return true;
            }
        }
        return false; // Retorna falso se não encontrar o usuário ou senha
    }
}
