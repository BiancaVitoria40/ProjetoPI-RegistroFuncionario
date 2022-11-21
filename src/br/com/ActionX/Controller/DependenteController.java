/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ActionX.Controller;

import br.com.ActionX.Conexao.DependentesDAO;
import br.com.ActionX.Negocio.Dependentes;
import java.sql.SQLException;

/**
 *
 * @author bianc
 */
public class DependenteController {
    public boolean InsereDependente(Dependentes dep){
        
        DependentesDAO dDAO = new DependentesDAO();
        dDAO.insereDependente(dep);
        return true;
    }
    
    public Dependentes BuscaDependentePorIDFuncionario (int id) throws SQLException{
        DependentesDAO dDAO = new DependentesDAO();
        return dDAO.buscaDependentePorIDFuncionario(id);
    }
}
