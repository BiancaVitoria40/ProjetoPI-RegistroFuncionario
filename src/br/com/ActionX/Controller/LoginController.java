package br.com.ActionX.Controller;

import br.com.ActionX.Conexao.LoginDAO;
import br.com.ActionX.Negocio.Login;
import java.sql.SQLException;

/**
 *
 * @author bianc
 */
public class LoginController {
    
    public Login ValidaLogin(String usuario, String senha) throws SQLException{
        
        Login result = new Login();
        LoginDAO loginDAO = new LoginDAO();
        
        result = loginDAO.buscaLogin(usuario);
        
        if(result == null){
            return null;
        }
        if(result.getUsuario().equals(usuario) && result.getSenha().equals(senha)){
            return result;
        }
        
        return null;
    }
    
    public boolean CriaLogin(String usuario, String senha){
            LoginDAO loginDAO = new LoginDAO();
            Login login = new Login();
            Login login2 = new Login();
            
            login.setUsuario(usuario);
            login.setSenha(senha);
            
            
            try{
            login2 = loginDAO.buscaLogin(usuario);
            
            if(login2 == null){
            loginDAO.insereLogin(login);
            return true;
            
            }else{
                System.out.println("Esse usuário já existe!");
                return false;
            }
            
            }catch(Exception e){
                System.out.println(e);
                return false;
            }
    }
}
