package br.com.ActionX.Conexao;

import br.com.ActionX.Negocio.DadosBancarios;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DadosBancariosDAO {
    
        public void insereDadosBancarios(DadosBancarios banco) {
        Conexao conexao = new Conexao();

        PreparedStatement st = null;

        try {

            String sql = "";
            sql += "";
            sql += "INSERT INTO dadosbancarios"
                    + "(`ID_Funcionario`," 
                    + "`Cod_banco`," 
                    + "`Agencia`," 
                    + "`Tipo_Conta`," 
                    + "`Conta`," 
                    + "`Digito`," 
                    + "`Status`)"
                    + "VALUES"
                    + "(?, ?, ?, ?, ?, ?, ?)";

            st = conexao.getConexao().prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            st.setInt(1, banco.getIdFuncionario());
            st.setString(2, banco.getCod_banco());
            st.setString(3, banco.getAgencia());
            st.setString(4, banco.getTipo_conta());
            st.setString(5, banco.getConta());
            st.setString(6, banco.getDigito());
            st.setString(7, banco.getStatus());
        

            System.out.println(sql);

            int linhasAfetadas = st.executeUpdate();

            if (linhasAfetadas > 0) {
                ResultSet rs = st.getGeneratedKeys();
                if (rs.next()) {
                    int id = rs.getInt(1);
                    banco.setId_dadosBancarios(id);
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
        
        public void atualizaDadosBancarios(DadosBancarios banco) {
        Conexao conexao = new Conexao();

        PreparedStatement st = null;

        try {

            String sql = "";
            sql += "";
            sql += "UPDATE registrofuncionario.dadosbancarios" +
                    "SET" +
                    "ID_Funcionario = ?," +
                    "Cod_banco = ?," +
                    "Agencia = ?," +
                    "Tipo_Conta = ?," +
                    "Conta = ?," +
                    "Digito = ?," +
                    "Status = ?" +
                    "WHERE ID_DadosBancarios = ?;";

            st = conexao.getConexao().prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            st.setInt(1, banco.getIdFuncionario());
            st.setString(2, banco.getCod_banco());
            st.setString(3, banco.getAgencia());
            st.setString(4, banco.getTipo_conta());
            st.setString(5, banco.getConta());
            st.setString(6, banco.getDigito());
            st.setString(7, banco.getStatus());

            System.out.println(sql);

            int linhasAfetadas = st.executeUpdate();

            if (linhasAfetadas > 0) {
                ResultSet rs = st.getGeneratedKeys();
                if (rs.next()) {
                    int id = rs.getInt(1);
                    banco.setId_dadosBancarios(id);
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
}
