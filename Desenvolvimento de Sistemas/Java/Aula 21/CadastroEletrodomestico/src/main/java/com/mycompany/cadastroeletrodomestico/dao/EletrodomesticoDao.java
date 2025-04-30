/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastroeletrodomestico.dao;

import com.mycompany.cadastroeletrodomestico.conexao.ConexaoMySql;
import com.mycompany.cadastroeletrodomestico.models.Eletrodomestico;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Adriano Mateus
 */
public class EletrodomesticoDao {
    public void inserir(Eletrodomestico eletrodomestico) {
        String sql = "INSERT INTO eletrodomestico(nome, marca, voltagem, preco ) VALUES (?, ?, ?, ?)";
        
        try (Connection conn = ConexaoMySql.conectar();
                PreparedStatement stmt = conn.prepareStatement(sql)){
            
            stmt.setString(1, eletrodomestico.getNome());
            stmt.setString(2, eletrodomestico.getMarca());
            stmt.setInt(3, eletrodomestico.getVoltagem());
            stmt.setDouble(4, eletrodomestico.getPreco());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }
    
    public ArrayList<Eletrodomestico> listar() {
        ArrayList<Eletrodomestico> lista = new ArrayList<>();
        String sql = "SELECT * FROM  eletrodomestico";
        
        try (Connection conn = ConexaoMySql.conectar();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)){
            
            while(rs.next()) {
                Eletrodomestico e = new Eletrodomestico(
                    rs.getInt("id"),
                    rs.getString("nome"),
                    rs.getString("marca"),
                    rs.getInt("voltagem"),
                    rs.getDouble("preco")
                );
                
                lista.add(e);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return lista;
    }
    
    public ArrayList<Eletrodomestico> buscaPorNome(String nome) {
        ArrayList<Eletrodomestico> lista = new ArrayList<>();
        String sql = "SELECT * FROM eletrodomestico WHERE nome LIKE ?";
        
        try (Connection conn = ConexaoMySql.conectar(); 
                PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setString(1, "%" + nome + "%");
            ResultSet rs = stmt.executeQuery();
        
             while(rs.next()) {
                Eletrodomestico e = new Eletrodomestico(
                    rs.getString("nome"),
                    rs.getString("marca"),
                    rs.getInt("voltagem"),
                    rs.getDouble("preco")
                );
                
                lista.add(e);
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return lista;
    }
    
    public void atualizar(Eletrodomestico eletrodomestico) {
        String sql = "UPDATE eletrodomestico SET nome = ?, marca = ?, voltagem = ?, preco = ? WHERE id = ?";
        
        try (Connection conn = ConexaoMySql.conectar(); 
                PreparedStatement stmt = conn.prepareStatement(sql)) {
               
            stmt.setString(1, eletrodomestico.getNome());
            stmt.setString(2, eletrodomestico.getMarca());
            stmt.setInt(3, eletrodomestico.getVoltagem());
            stmt.setDouble(4, eletrodomestico.getPreco());
            stmt.setInt(5, eletrodomestico.getId());
            stmt.executeUpdate();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }   
    }
    
    public void remover(int id) {
        String sql = "DELETE FROM eletrodomestico WHERE id = ?";
        
        try (Connection conn = ConexaoMySql.conectar(); 
                PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }
}
