
import DAO.DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ricardo
 */
public class ClienteCnpj extends Cliente implements DAO {
    private DAO dao;
    public String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public ClienteCnpj() {
    }  
    
    @Override
    public Connection conectar() {
        Connection con = null;
        try {
            Class.forName(DAO.driver);
            con = DriverManager.getConnection(DAO.url, DAO.user, DAO.password);
            return con;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    @Override
    public void cadastrarCliente(String sql) {
        try {
            conectar();
            java.sql.Statement st = conectar().createStatement();
            st.executeUpdate(sql);
            st.close();
            conectar().close();
            
        } catch (Exception e) {
            System.out.println("Falha ao conectar com banco de dados" + e.toString());
        }
    }

    @Override
    public void listarCliente(String sql) {
        try {
            conectar();
            java.sql.Statement st = conectar().createStatement();
            st.executeUpdate(sql);
            st.close();
            conectar().close();
            
        } catch (Exception e) {
            System.out.println("Falha ao conectar com banco de dados" + e.toString());
        }
    }

    @Override
    public void atualizarCliente(String sql) {
        try {
            conectar();
            java.sql.Statement st = conectar().createStatement();
            st.executeUpdate(sql);
            st.close();
            conectar().close();
            
        } catch (Exception e) {
            System.out.println("Falha ao conectar com banco de dados" + e.toString());
        }
    }

    @Override
    public void excluirCliente(String sql) {
        try {
            conectar();
            java.sql.Statement st = conectar().createStatement();
            st.executeUpdate(sql);
            st.close();
            conectar().close();
            
        } catch (Exception e) {
            System.out.println("Falha ao conectar com banco de dados" + e.toString());
        }
    }

}
