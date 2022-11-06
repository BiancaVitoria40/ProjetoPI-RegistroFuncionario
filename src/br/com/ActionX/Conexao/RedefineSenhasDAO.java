package br.com.ActionX.Conexao;

import br.com.ActionX.Negocio.RedefineSenhas;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RedefineSenhasDAO {
    
        public void insereSolicitacao(RedefineSenhas senha) {
        Conexao conexao = new Conexao();

        PreparedStatement st = null;

        try {

            String sql = "";
            sql += "";
            sql += "INSERT INTO redefinesenhas"
                    + "(ID_Login, "
                    + "Dt_Criacao) "
                    + "VALUES"
                    + "(?, now())";

            st = conexao.getConexao().prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            
            st.setInt(1, senha.getId_redefineSenhas());

            System.out.println(sql);

            int linhasAfetadas = st.executeUpdate();

            if (linhasAfetadas > 0) {
                ResultSet rs = st.getGeneratedKeys();
                if (rs.next()) {
                    int id = rs.getInt(1);
                    senha.setId_redefineSenhas(id);
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
    
        public void deletarSolicitacao(RedefineSenhas senha) {
        Conexao conexao = new Conexao();

        PreparedStatement st = null;

        try {

            String sql = "";
            sql += "";
            sql += "DELETE FROM redefinesenhas"
                    + "WHERE ID_redefiniSenha = ?";

            st = conexao.getConexao().prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            
            st.setInt(1, senha.getId_redefineSenhas());

            System.out.println(sql);

            int linhasAfetadas = st.executeUpdate();

            if (linhasAfetadas > 0) {
                ResultSet rs = st.getGeneratedKeys();
                if (rs.next()) {
                    int id = rs.getInt(1);
                    senha.setId_redefineSenhas(id);
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
