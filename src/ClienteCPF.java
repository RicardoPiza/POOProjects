
import java.sql.Connection;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */





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
    public void cadastrarCliente(String sql) {
    }

    @Override
    public void listarCliente(String sql) {
    }

    @Override
    public void atualizarCliente(String sql) {
    }

    @Override
    public void excluirCliente(String sql) {
    }

    @Override
    public Connection conectar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
