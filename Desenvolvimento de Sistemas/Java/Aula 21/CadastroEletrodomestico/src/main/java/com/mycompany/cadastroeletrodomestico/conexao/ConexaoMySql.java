/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastroeletrodomestico.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Adriano Mateus
 */
public class ConexaoMySql {
    
    private static final String URL = "jdbc:mysql://localhost:3306/cadastro_eletrodomestico";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    
    public static Connection conectar() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException("Erro na conexão com o banco de dados " + e.getMessage());
        }
    };
}
