package DAO;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.*;

public interface DAO {

    String driver = "com.mysql.cj.jdbc.Driver";
    String url = "jdbc:mysql://127.0.0.1:3306/JAVAAPP?useTimezone=true&serverTimezone=UTC";
    String user = "root";
    String password = "45243253";

        public abstract Connection conectar();
        public abstract void cadastrarCliente(String sql);        
        public abstract void listarCliente(String sql);
        public abstract void atualizarCliente(String sql);
        public abstract void excluirCliente(String sql);
        
    
}
