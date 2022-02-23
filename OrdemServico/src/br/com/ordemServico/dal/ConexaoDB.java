
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
    
        //definindo os parametros do driver do MySQL
        String driver = "com.mysql.jdbc.Driver";
        String user = "root";
        String password = "1234";
        String url = "jdbc:mysql://localhost:3306/dbinfox";
        
        
        //Estabelendo a conexao com o banco de dados
        try{
            //Não é necessário usar-se Class.forName(String) a partir do Java 6, mas fazê-lo mesmo assim pode fazer o seu programa recusar-se a ser inicializado caso o driver não estiver no classpath.
           // Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        }catch(Exception e){
            System.out.println(e);
            return null;
        }//fim conectarBanco
        
    }
    
    
}
