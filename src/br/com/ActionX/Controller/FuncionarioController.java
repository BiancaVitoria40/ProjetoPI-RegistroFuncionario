/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ActionX.Controller;

import br.com.ActionX.Conexao.EnderecoDAO;
import br.com.ActionX.Conexao.FuncionariosDAO;
import br.com.ActionX.Negocio.Enderecos;
import br.com.ActionX.Negocio.Funcionario;
import java.sql.SQLException;

/**
 *
 * @author bianc
 */
public class FuncionarioController {
    
    public int CadastrarFuncionario(Funcionario func){
        FuncionariosDAO fDAO = new FuncionariosDAO();
        
        return fDAO.insereFuncionario(func);
    }
    
    public Funcionario BuscaFuncionarioPorID(int id) throws SQLException{
        Funcionario func = new Funcionario();
        FuncionariosDAO funcDAO = new FuncionariosDAO();
        func = funcDAO.buscaFuncionarioPorID(id);
        return func;
    }
    
    public void AtualizaFuncionario(Funcionario func){
        FuncionariosDAO fDAO = new FuncionariosDAO();
        fDAO.atualizaFuncionario(func);
    }
}
