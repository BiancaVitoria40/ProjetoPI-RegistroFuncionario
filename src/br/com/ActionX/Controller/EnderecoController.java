package br.com.ActionX.Controller;

import br.com.ActionX.Conexao.EnderecoDAO;
import br.com.ActionX.Negocio.Enderecos;
import java.sql.SQLException;

/**
 *
 * @author bianc
 */
public class EnderecoController {
    
    public int InsereEndereco (Enderecos end){
        
        EnderecoDAO endDAO = new EnderecoDAO();
        return endDAO.insereEndereco(end);
    }
    
        public Enderecos BuscaEndereco(int id) throws SQLException{
        Enderecos end = new Enderecos();
        EnderecoDAO endDAO = new EnderecoDAO();
        end = endDAO.buscaEnderecoPorIDFuncionario(id);
        return end;
    }
        
    public void AtualizaEnderecos (Enderecos end){
        EnderecoDAO endDAO = new EnderecoDAO();
        endDAO.atualizaEndereco(end);
    }
    
}
