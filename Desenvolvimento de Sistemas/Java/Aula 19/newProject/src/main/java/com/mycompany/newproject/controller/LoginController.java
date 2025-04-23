/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.newproject.controller;

import com.mycompany.newproject.dao.UsuarioDAO;
import com.mycompany.newproject.model.Usuario;

/**
 *
 * @author aluno.den
 */
public class LoginController {
    private UsuarioDAO dao = new UsuarioDAO();
    
    public boolean autenticar(String login, String senha) {
        return dao.autenticar(login, senha);
    }
    
}
