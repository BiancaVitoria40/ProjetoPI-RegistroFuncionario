package br.com.ActionX.Visual;

import br.com.ActionX.Conexao.Conexao;
import br.com.ActionX.Conexao.FuncionariosDAO;
import br.com.ActionX.Negocio.Funcionario;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class Principal {
    
    public static void main(String[] args) throws SQLException {
       
        Conexao cn = new Conexao();
        cn.getConexao();
        
        System.out.println("Status da conexao: " + cn.getStatusConexao());
        
        Funcionario func = new Funcionario();
        func.setIdFuncionario(1);
        func.setIdLogin(1);
        func.setNome("Gabriel 2");
        func.setEmail("bianca@gmail.com");
        func.setTelefone("11939378225");
        func.setGenero("Feminino");
        func.setRaca("Preto");
        func.setDt_nascimento("2002-04-12");
        func.setNacionalidade("Brasileiro");
        func.setEstado_civil("Casado");
        func.setStatus_func("a");
        func.setQtd_dependente(0);
        func.setQtd_pensionista(0);
        
        FuncionariosDAO funcDao = new FuncionariosDAO();
        
        funcDao.insereFuncionario(func);
        
        //funcDao.atualizaFuncionario(func);
        
        Funcionario func1 = new Funcionario();
        
        func1 = funcDao.buscaFuncionarioPorID(1);
        System.out.println(func1.getEstado_civil());
        
        List<Funcionario> listaDeFunc = new ArrayList<>();
        
        listaDeFunc = funcDao.buscaListaFuncionariosPorNome("Gabriel");
        
        for (Funcionario funci : listaDeFunc){
            System.out.println(funci.getNome());
        }
    }
    
}
