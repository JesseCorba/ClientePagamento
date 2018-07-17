/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jesse
 */

//Classe responsável para por fabricar as conexões(abre conexão)
public class ConnectionFactory {
    public Connection getConnection(){
        String nomeUsuario = "postgres";//usuário do servidor
        String senhaUsuario = "1234";//senha do servidor
        String enderecoServidor = "locahost";
        String nomeBanco = "Pessoa";
        
        try {
            return DriverManager.getConnection("JDBC:postgresql://"+ enderecoServidor+
                    "/"+nomeBanco,nomeUsuario,senhaUsuario);
        } catch (SQLException ex) {
            System.out.println("Erro, não abrir conexão");
            throw new RuntimeException(ex);
        }
        
    }
    
}
