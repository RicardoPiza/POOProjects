/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ricardo
 */
public class teste {
    private DAO dao;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ClienteCnpj jur = new ClienteCnpj();
        jur.cadastrarCliente("insert into cliente (nome, tel, end) values ('ricardo','24234252','av. saiodai')");
        
        
    }
    
}
