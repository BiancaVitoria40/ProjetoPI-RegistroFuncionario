package br.com.ActionX.Controller;

import br.com.ActionX.Conexao.LoginDAO;
import br.com.ActionX.Conexao.RedefineSenhasDAO;
import br.com.ActionX.Negocio.Login;
import java.sql.SQLException;

/**
 *
 * @author bianc
 */
public class RedefineSenhaController {
    
    public boolean CriarSolicitacao (String usuario) throws SQLException{
        
        LoginDAO lDAO = new LoginDAO();
        RedefineSenhasDAO rDAO = new RedefineSenhasDAO();
        Login login = new Login();
        login = lDAO.buscaLogin(usuario);
        
        if(login == null){
            return false;
        } else {
            rDAO.insereSolicitacao(login.getId_login());
            return true;
        }
    }
}
