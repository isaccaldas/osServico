
package br.com.ordemServico.dal;

import java.sql.*;

/**
 *
 * @author Isac Caldas
 */
public class ConexaoDB {
    

    //método responsável para estabelecer a conexão com o banco de dados
    public static Connection conectarBanco(){
    
        java.sql.Connection conexao =  null;
    
        //Carregando o driver do MySQL
        String driver = "com.mysql.jdbc.Driver";
        String user = "admin";
        String password = "1234";
        String url = "jdbc:mysql://localhost:3306/dbinfox";
        
    return 
    }
    
    
}
