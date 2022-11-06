package br.com.ActionX.Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    
   
    private String statusConexao = "N�o conectado!";
    
    public Connection getConexao(){
     
        Connection conexao = null;
        
        
        try{
            
            String nomeDriver = "com.mysql.cj.jdbc.Driver"; 
            Class.forName(nomeDriver);
            
            
            String servidor = "localhost"; 
            String schema = "registrofuncionario";  
            
            
            String url = "jdbc:mysql://" + servidor + "/" + schema;
            
            
            String usuario = "root";
            String senha = "130730";
            
            
            conexao = (Connection)DriverManager.getConnection(url,usuario,senha);
           
            
            
            if(conexao != null){ 
                statusConexao = "Conectado!";
            } else{
                statusConexao = "N�o conectado!";
            }
            
            
            return conexao;
            
        } catch(ClassNotFoundException e){ 
            System.out.println("Driver de conex�o n�o encontrado!");
            return null;
        } catch(SQLException e){
            System.out.println("Falha na conex�o!");
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    
    public String getStatusConexao(){
        return statusConexao;
    }
    
    
    public boolean fechaConexao(){
        try{
            getConexao().close(); 
            statusConexao = "Conex�o Fechada"; 
            return true; 
        } catch(SQLException e){
            System.out.println(e.getMessage());
            return false;
        }       
    }
    
    public Connection reiniciaConexao(){
        fechaConexao(); 
        return getConexao(); 
    }

    
}
