/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ActionX.Controller;

import br.com.ActionX.Conexao.DocumentosDAO;
import br.com.ActionX.Conexao.EnderecoDAO;
import br.com.ActionX.Negocio.Documentos;
import br.com.ActionX.Negocio.Enderecos;
import java.sql.SQLException;

/**
 *
 * @author bianc
 */
public class EnderecoController {
    
    public boolean InsereEndereco (Enderecos end){
        
        EnderecoDAO endDAO = new EnderecoDAO();
        endDAO.insereEndereco(end);
        return true;
    }
    
        public Enderecos BuscaEndereco(int id) throws SQLException{
        Enderecos end = new Enderecos();
        EnderecoDAO endDAO = new EnderecoDAO();
        end = endDAO.buscaEnderecoPorIDFuncionario(id);
        return end;
    }
    
}
