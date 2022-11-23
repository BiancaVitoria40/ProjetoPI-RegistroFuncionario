package br.com.ActionX.Conexao;

import br.com.ActionX.Negocio.Documentos;
import br.com.ActionX.Negocio.Login;
import br.com.ActionX.Negocio.RedefineSenhas;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RedefineSenhasDAO {

    public void insereSolicitacao(int id) {
        Conexao conexao = new Conexao();
        RedefineSenhas senha = new RedefineSenhas();
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

            st.setInt(1, id);

            System.out.println(sql);

            int linhasAfetadas = st.executeUpdate();

            if (linhasAfetadas > 0) {
                ResultSet rs = st.getGeneratedKeys();
                if (rs.next()) {
                    int ids = rs.getInt(1);
                    senha.setId_redefineSenhas(ids);
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

    public void deletarSolicitacao(int id) {
        Conexao conexao = new Conexao();

        PreparedStatement st = null;

        try {

            String sql = "";
            sql += "";
            sql += "DELETE FROM redefinesenhas "
                    + "WHERE ID_redefineSenha = ?";

            st = conexao.getConexao().prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            st.setInt(1, id);

            System.out.println(sql);

            int linhasAfetadas = st.executeUpdate();

            if (linhasAfetadas > 0) {
                ResultSet rs = st.getGeneratedKeys();
                if (rs.next()) {
                    int id2 = rs.getInt(1);
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

    public List<RedefineSenhas> buscaListaSolicitacoes() throws SQLException {

        Conexao con = new Conexao();
        con.getConexao(); //Obtendo a conexão
        PreparedStatement stmt = null;
        ResultSet resultado = null;

        //Prepara a lista de carros para retornar
        List<RedefineSenhas> listaDeSolicitacoes = new ArrayList<>();

        try {
            // Comando SQL na base = tabela de carros
            String sql = " select rs.*, l.Usuario from redefinesenhas rs "
                    + " left join logins l on "
                    + " rs.ID_Login = l.ID_Login;";

            //Executa a query (comando SQL)
            stmt = con.getConexao().prepareStatement(sql);
            resultado = stmt.executeQuery();

            //Para cada item retornado no comando (SQL) faça...
            while (resultado.next()) {
                RedefineSenhas rs = new RedefineSenhas(); //Criando uma instância, novo carro na memória

                rs.setId_redefineSenhas(resultado.getInt("ID_redefineSenha"));
                rs.setId_login(resultado.getInt("ID_Login"));
                rs.setDt_criacao(resultado.getDate("Dt_Criacao"));
                rs.setUsuario(resultado.getString("Usuario"));

                listaDeSolicitacoes.add(rs);
            }

            return listaDeSolicitacoes;
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

    public RedefineSenhas buscaSolicitacoPorID(int id) throws SQLException {

        Conexao con = new Conexao();
        con.getConexao(); //Obtendo a conexão
        PreparedStatement stmt = null;
        ResultSet resultado = null;

        //Prepara a lista de carros para retornar
        List<RedefineSenhas> listaDeSolicitacoes = new ArrayList<>();

        try {
            // Comando SQL na base = tabela de carros
            String sql = " select rs.*, l.Usuario from redefinesenhas rs "
                    + " left join logins l on "
                    + " rs.ID_Login = l.ID_Login "
                    + "where rs.ID_redefineSenha = ?";

            //Executa a query (comando SQL)
            stmt = con.getConexao().prepareStatement(sql);
            stmt.setInt(1, id);
            resultado = stmt.executeQuery();

            //Para cada item retornado no comando (SQL) faça...
            while (resultado.next()) {
                RedefineSenhas rs = new RedefineSenhas(); //Criando uma instância, novo carro na memória

                rs.setId_redefineSenhas(resultado.getInt("ID_redefineSenha"));
                rs.setId_login(resultado.getInt("ID_Login"));
                rs.setDt_criacao(resultado.getDate("Dt_Criacao"));
                rs.setUsuario(resultado.getString("Usuario"));

                return rs;
            }

            return null;
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

    public void atualizaSenha(Documentos doc) {
        Conexao conexao = new Conexao();

        PreparedStatement st = null;

        try {

            String sql = "";
            sql += "";
            sql += "UPDATE Documentos "
                    + "SET "
                    + "RG = ?,"
                    + "CPF = ?,"
                    + "Titulo_Eleitor = ?,"
                    + "CTPS = ?,"
                    + "Serie = ?,"
                    + "UF = ?,"
                    + "Certidao_Nascimento = ?, "
                    + "Certidao_Civil = ?, "
                    + "Reservista = ?, "
                    + "PIS = ? "
                    + "WHERE ID_Documento = ?; ";

            st = conexao.getConexao().prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            st.setString(1, doc.getRg());
            st.setString(2, doc.getCpf());
            st.setString(3, doc.getTitulo_eleitor());
            st.setString(4, doc.getCtps());
            st.setString(5, doc.getSerie());
            st.setString(6, doc.getUf());
            st.setString(7, doc.getCertidao_nascimento());
            st.setString(8, doc.getCertidao_civil());
            st.setString(9, doc.getReservista());
            st.setString(10, doc.getPis());
            st.setInt(11, doc.getId_documento());

            System.out.println(sql);

            int linhasAfetadas = st.executeUpdate();

            if (linhasAfetadas > 0) {
                ResultSet rs = st.getGeneratedKeys();
                if (rs.next()) {
                    int id = rs.getInt(1);
                    doc.setId_documento(id);
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
