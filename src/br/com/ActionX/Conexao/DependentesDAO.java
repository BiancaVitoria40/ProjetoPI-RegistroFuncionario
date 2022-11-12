package br.com.ActionX.Conexao;

import br.com.ActionX.Negocio.Dependentes;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DependentesDAO {
        public void insereDependente(Dependentes dep) {
        Conexao conexao = new Conexao();

        PreparedStatement st = null;

        try {

            String sql = "";
            sql += "";
            sql += "INSERT INTO registrofuncionario.dependentes" +
                    "(ID_Funcionario," +
                    "Nome," +
                    "Email," +
                    "Telefone," +
                    "Tipo_Dependente," +
                    "Certidao," +
                    "Data_nascimento," +
                    "Genero," +
                    "CPF," +
                    "Status)" +
                    "VALUES" +
                    "(?," +
                    "?," +
                    "?," +
                    "?," +
                    "?," +
                    "?," +
                    "?," +
                    "?," +
                    "?," +
                    "?);";

            st = conexao.getConexao().prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            st.setInt(1, dep.getId_funcionario());
            st.setString(2, dep.getNome());
            st.setString(3, dep.getEmail());
            st.setString(4, dep.getTelefone());
            st.setString(5, dep.getTipo_dependente());
            st.setString(6, dep.getCertidao());
            st.setString(7, dep.getData_nascimento());
            st.setString(8, dep.getGenero());
            st.setString(9, dep.getCpf());
            st.setString(9, dep.getStatus());

            System.out.println(sql);

            int linhasAfetadas = st.executeUpdate();

            if (linhasAfetadas > 0) {
                ResultSet rs = st.getGeneratedKeys();
                if (rs.next()) {
                    int id = rs.getInt(1);
                    dep.setId_dependentes(id);
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
        
        public void atualizaDependente(Dependentes dep) {
        Conexao conexao = new Conexao();

        PreparedStatement st = null;

        try {

            String sql = "";
            sql += "";
            sql += "UPDATE registrofuncionario.dependentes" +
                    "SET" +
                    "ID_Funcionario = ?," +
                    "Nome = ?," +
                    "Email = ?," +
                    "Telefone = ?," +
                    "Tipo_Dependente = ?," +
                    "Certidao = ?," +
                    "Data_nascimento = ?," +
                    "Genero = ?," +
                    "CPF = ?," +
                    "Status = ?" +
                    "WHERE ID_Dependente = ?;";

            st = conexao.getConexao().prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            st.setInt(1, dep.getId_funcionario());
            st.setString(2, dep.getNome());
            st.setString(3, dep.getEmail());
            st.setString(4, dep.getTelefone());
            st.setString(5, dep.getTipo_dependente());
            st.setString(6, dep.getCertidao());
            st.setString(7, dep.getData_nascimento());
            st.setString(8, dep.getGenero());
            st.setString(9, dep.getCpf());
            st.setString(10, dep.getStatus());

            System.out.println(sql);

            int linhasAfetadas = st.executeUpdate();

            if (linhasAfetadas > 0) {
                ResultSet rs = st.getGeneratedKeys();
                if (rs.next()) {
                    int id = rs.getInt(1);
                    dep.setId_dependentes(id);
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
