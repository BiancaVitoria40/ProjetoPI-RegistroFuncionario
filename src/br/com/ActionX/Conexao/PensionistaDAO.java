package br.com.ActionX.Conexao;

import br.com.ActionX.Negocio.Pensionista;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PensionistaDAO {

    public void inserePensionista(Pensionista pensao) {
        Conexao conexao = new Conexao();

        PreparedStatement st = null;

        try {

            String sql = "";
            sql += "";
            sql += "INSERT INTO pensionista"
                    + "`ID_Funcionario`,"
                    + "`Nome`,"
                    + "`CPF`,"
                    + "`Cod_banco`,"
                    + "`Agencia`,"
                    + "`Tipo_Conta`,"
                    + "`Conta`,"
                    + "`Digito`) "
                    + "VALUES"
                    + "(?, ?, ?, ?, ?, ?, ?, ?)";

            st = conexao.getConexao().prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            st.setInt(1, pensao.getId_funcionario());
            st.setString(2, pensao.getNome());
            st.setString(3, pensao.getCpf());
            st.setString(4, pensao.getCod_banco());
            st.setString(5, pensao.getAgencia());
            st.setString(6, pensao.getTipo_conta());
            st.setString(7, pensao.getConta());
            st.setString(8, pensao.getDigito());

            System.out.println(sql);

            int linhasAfetadas = st.executeUpdate();

            if (linhasAfetadas > 0) {
                ResultSet rs = st.getGeneratedKeys();
                if (rs.next()) {
                    int id = rs.getInt(1);
                    pensao.setId_pensionista(id);
                }
                rs.close();
            } else {
                throw new SQLException("Erro inesperado! Nenhuma linha afetada!");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            conexao.fechaConexao();
        }

    }
    
    public void atualizaPensionista(Pensionista pensao) {
        Conexao conexao = new Conexao();

        PreparedStatement st = null;

        try {

            String sql = "";
            sql += "";
            sql += "UPADTE pensionista"
                    + "SET"
                     + "`ID_Pensionista` = ?,"
                    + "`ID_Funcionario` = ?,"
                    + "`Nome` = ?,"
                    + "`CPF` = ?,"
                    + "`Cod_banco` = ?,"
                    + "`Agencia` = ?,"
                    + "`Tipo_Conta` = ?,"
                    + "`Conta` = ?,"
                    + "`Digito` = ? "
                    + "WHERE ID_Pensionista = ?; ";

            st = conexao.getConexao().prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            st.setInt(1, pensao.getId_funcionario());
            st.setString(2, pensao.getNome());
            st.setString(3, pensao.getCpf());
            st.setString(4, pensao.getCod_banco());
            st.setString(5, pensao.getAgencia());
            st.setString(6, pensao.getTipo_conta());
            st.setString(7, pensao.getConta());
            st.setString(8, pensao.getDigito());

            System.out.println(sql);

            int linhasAfetadas = st.executeUpdate();

            if (linhasAfetadas > 0) {
                ResultSet rs = st.getGeneratedKeys();
                if (rs.next()) {
                    int id = rs.getInt(1);
                    pensao.setId_pensionista(id);
                }
                rs.close();
            } else {
                throw new SQLException("Erro inesperado! Nenhuma linha afetada!");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            conexao.fechaConexao();
        }

    }
    
    public List<Pensionista> buscaListaPensionistas() throws SQLException {
            
        Conexao con = new Conexao();
        con.getConexao(); //Obtendo a conexão
        PreparedStatement stmt = null;
        ResultSet resultado = null;

        //Prepara a lista de carros para retornar
        List<Pensionista> listaDePensionista = new ArrayList<>();

        try {
           
            String sql = "select * from pensionista";

            
            stmt = con.getConexao().prepareStatement(sql);
            resultado = stmt.executeQuery();

           
            while (resultado.next()) {
                Pensionista pensionista = new Pensionista(); 
             
                pensionista.setId_funcionario(resultado.getInt("ID_Funcionario"));
                pensionista.setId_pensionista(resultado.getInt("ID_Pensionista"));
                pensionista.setNome(resultado.getString("Nome"));
                pensionista.setCpf(resultado.getString("CPF"));
              
                

                listaDePensionista.add(pensionista);
            }

            // Retorna a lista de carros
            return listaDePensionista;
        } catch (SQLException e) { //Caso dê alguma exceção
            System.out.println(e.getMessage());
            return null;
        } finally {
            // Após terminar, fecha a conexão, stmt, rs
            resultado.close();
            stmt.close();
            con.getConexao().close();
        }
    }
    
    public List<Pensionista> buscaListaPensionistaPorIdFuncionario(Pensionista pensao) throws SQLException {
            
        Conexao con = new Conexao();
        con.getConexao(); //Obtendo a conexão
        PreparedStatement stmt = null;
        ResultSet resultado = null;

        //Prepara a lista de carros para retornar
        List<Pensionista> listaDePensionista = new ArrayList<>();

        try {
           
           String sql = "";
            sql += "";
            sql
                    += "SELECT pensionista.ID_Funcionario, "
                    + "    pensionista.ID_Funcionario, "
                    + "    pensionista.ID_Pensionista, "
                    + "    pensionista.Nome, "
                    + "    pensionista.CPF, "
                    + "    pensionista.Cod_banco, "
                    + "    pensionista.Agencia, "
                    + "    pensionista.Conta, "
                    + "    pensionista.Digito, "
                    + "    funcionarios.Tipo_Conta "
                    + "FROM registrofuncionario.pensionista "
                    + "WHERE ID_Pensionista = ?";

            
            stmt = con.getConexao().prepareStatement(sql);
            stmt.setInt(1, pensao.getId_funcionario());
            resultado = stmt.executeQuery();

           
            while (resultado.next()) {
                Pensionista pensionista = new Pensionista(); 
             
                pensionista.setId_funcionario(resultado.getInt("ID_Funcionario"));
                pensionista.setId_pensionista(resultado.getInt("ID_Pensionista"));
                pensionista.setNome(resultado.getString("Nome"));
                pensionista.setCpf(resultado.getString("CPF"));
                pensionista.setCod_banco(resultado.getString("Cod_banco"));
                pensionista.setAgencia(resultado.getString("Agencia"));
                pensionista.setConta(resultado.getString("Conta"));
                pensionista.setDigito("Digito");
                pensionista.setTipo_conta("Tipo conta");
              
                

                listaDePensionista.add(pensionista);
            }

            // Retorna a lista de carros
            return listaDePensionista;
        } catch (SQLException e) { //Caso dê alguma exceção
            System.out.println(e.getMessage());
            return null;
        } finally {
            // Após terminar, fecha a conexão, stmt, rs
            resultado.close();
            stmt.close();
            con.getConexao().close();
        }
    }




}
