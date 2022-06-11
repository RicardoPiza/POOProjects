
import DAO.DAO;
import java.sql.Connection;
import java.sql.DriverManager;


public class ClienteCPF extends Cliente implements DAO {
    public String cpf;
    
    public String getCpf() {
        return cpf;
    }
        
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public ClienteCPF() {
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
    public void listarCliente(String sql) {try {
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
