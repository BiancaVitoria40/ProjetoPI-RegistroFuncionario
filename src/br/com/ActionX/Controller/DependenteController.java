package br.com.ActionX.Controller;

import br.com.ActionX.Conexao.DependentesDAO;
import br.com.ActionX.Negocio.Dependentes;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author bianc
 */
public class DependenteController {
    public int InsereDependente(Dependentes dep){
        
        DependentesDAO dDAO = new DependentesDAO();
        return dDAO.insereDependente(dep);
    }
    
    public List<Dependentes> BuscaDependentePorIDFuncionario (int id) throws SQLException{
        DependentesDAO dDAO = new DependentesDAO();
        return dDAO.buscaDependentePorIDFuncionario(id);
    }
    
    public Dependentes BuscaDependentePorID (int id) throws SQLException{
        DependentesDAO dDAO = new DependentesDAO();
        return dDAO.buscaDependentePorID(id);
    }
    
        
    public void AtualizaDependente (Dependentes dep) throws SQLException{
        DependentesDAO dDAO = new DependentesDAO();
        dDAO.atualizaDependente(dep);
    }
}
