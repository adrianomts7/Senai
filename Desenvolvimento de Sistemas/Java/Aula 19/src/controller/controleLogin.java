package src.controller;

import src.dao.UsuarioDao;

public class controleLogin {
    private UsuarioDao usuarioDAO;

    public controleLogin() {
        usuarioDAO = new UsuarioDao(); // Cria a instância de UsuarioDAO
    }

    public boolean autenticar(String login, String senha) {
        // Verifica se o login e a senha estão corretos
        return usuarioDAO.autenticarUsuario(login, senha);
    }
}
