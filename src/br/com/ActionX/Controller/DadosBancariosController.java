/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ActionX.Controller;

import br.com.ActionX.Conexao.DadosBancariosDAO;
import br.com.ActionX.Negocio.DadosBancarios;
import java.sql.SQLException;

/**
 *
 * @author bianc
 */
public class DadosBancariosController {
    
    public boolean InsereDadosBancarios(DadosBancarios db){
        DadosBancariosDAO dbDAO = new DadosBancariosDAO();
        
        dbDAO.insereDadosBancarios(db);
        return true;
    }
    
    public DadosBancarios BuscaDadosBancarios(int id) throws SQLException{
        DadosBancarios db = new DadosBancarios();
        DadosBancariosDAO dbDAO = new DadosBancariosDAO();
        db = dbDAO.buscaDadosBancariosPorIDFuncionario(id);
        return db;
    }
}
