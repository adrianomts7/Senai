/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.newproject.dao;

import java.util.ArrayList;
import com.mycompany.newproject.model.Usuario;

/**
 *
 * @author aluno.den
 */
public class UsuarioDAO {
    private ArrayList<Usuario> usuarios = new ArrayList<>();
    
    public UsuarioDAO() {
        usuarios.add(new Usuario("admin", "admin"));
    }
    
    public boolean autenticar(String login, String senha) {
        for (Usuario u : usuarios) {
            if (u.getUsuario().equals(login) && u.getSenha().equals(senha)) {
                return true;
            }
        }
        return false;
    }
    
}
