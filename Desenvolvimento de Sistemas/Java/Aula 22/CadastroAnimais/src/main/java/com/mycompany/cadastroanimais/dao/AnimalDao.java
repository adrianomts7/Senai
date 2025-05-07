/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastroanimais.dao;

import com.mycompany.cadastroanimais.conexão.ConexapMySql;
import com.mycompany.cadastroanimais.models.Animal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author aluno.den
 */
public class AnimalDao {
    public void inserir(Animal animal) {
        String sql = "INSERT INTO animais(nome, especie, idade) VALUES (?, ?, ?) ";
        
        try (Connection conn = ConexapMySql.conectar();
            PreparedStatement stmt = conn.prepareStatement(sql)){
            
            stmt.setString(1, animal.getNome());
            stmt.setString(2, animal.getEspecie());
            stmt.setInt(3, animal.getIdade());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public ArrayList<Animal> listar() {
        ArrayList<Animal> lista = new ArrayList<>();
        String sql = "SELECT * FROM animais";
        
        try (Connection conn = ConexapMySql.conectar();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {
            
            while (rs.next()) {
                Animal a = new Animal(
                  rs.getInt("id"),
                  rs.getString("nome"),
                  rs.getString("especie"),
                  rs.getInt("idade")
                );
                
                lista.add(a);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return lista;
    }
    
    public ArrayList<Animal> buscarPorNome(String nome) {
        ArrayList<Animal> lista = new ArrayList<>();
        String sql = "SELECT * FROM animais WHERE nome LIKE ?";
        
        try (Connection conn = ConexapMySql.conectar();
                PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setString(1, "%" + nome + "%");
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()) {
              Animal a = new Animal(
                  rs.getInt("id"),
                  rs.getString("nome"),
                  rs.getString("especie"),
                  rs.getInt("idade")     
              );
              
              lista.add(a);
            }   
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return lista;
    }
    
    public void atualizar(Animal animal) {
        String sql = "UPDATE animais SET nome = ?, especie = ?, idade = ? WHERE id = ?";
        
        try (Connection conn = ConexapMySql.conectar(); 
                PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setString(1, animal.getNome());
            stmt.setString(2, animal.getEspecie());
            stmt.setInt(3, animal.getIdade());
            stmt.setInt(4, animal.getId());
            stmt.executeUpdate();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void remover(int id) {
        String sql = "DELETE FROM animais WHERE id = ?";
        
        try (Connection conn = ConexapMySql.conectar();
                PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }
    
}
