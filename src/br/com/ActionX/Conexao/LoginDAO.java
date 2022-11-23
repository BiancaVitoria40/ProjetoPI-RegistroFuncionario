package br.com.ActionX.Conexao;

import br.com.ActionX.Negocio.Login;
import br.com.ActionX.Negocio.LoginCompleto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LoginDAO {

    public List<Login> buscaListaLogin() throws SQLException {

        Conexao con = new Conexao();
        con.getConexao(); //Obtendo a conexão
        PreparedStatement stmt = null;
        ResultSet resultado = null;

        //Prepara a lista de carros para retornar
        List<Login> listaDeLogins = new ArrayList<>();

        try {
            // Comando SQL na base = tabela de carros
            String sql = "select * from logins";

            //Executa a query (comando SQL)
            stmt = con.getConexao().prepareStatement(sql);
            resultado = stmt.executeQuery();

            //Para cada item retornado no comando (SQL) faça...
            while (resultado.next()) {
                Login login = new Login(); //Criando uma instância, novo carro na memória

                login.setId_login(resultado.getInt("ID_Login"));
                login.setUsuario(resultado.getString("Usuario"));
                login.setSenha(resultado.getString("Senha"));
                login.setDt_criacao(resultado.getString("Dt_Criacao"));
                login.setDt_atualizacao(resultado.getString("Dt_Atualizacao"));
                login.setStatus(resultado.getString("Status"));
                
                listaDeLogins.add(login);
            }

            // Retorna a lista de carros
            return listaDeLogins;
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

    public Login buscaLogin(String usuario) throws SQLException {

        Conexao con = new Conexao();
        con.getConexao(); //Obtendo a conexão
        PreparedStatement stmt = null;
        ResultSet resultado = null;

        //Prepara a lista de carros para retornar
        try {
            // Comando SQL na base = tabela de carros
            String sql = "";
            sql += "";
            sql += "SELECT ID_Login, "
                    + "Usuario, "
                    + "Senha, "
                    + "Dt_Criacao, "
                    + "Dt_Atualizacao, "
                    + "Status, "
                    + "Tipo_Login, "
                    + "Status "
                    + "FROM registrofuncionario.logins "
                    + "WHERE Usuario = ? "
                    + "LIMIT 1";

            //Executa a query (comando SQL)
            stmt = con.getConexao().prepareStatement(sql);
            stmt.setString(1, usuario);

            resultado = stmt.executeQuery();

            while (resultado.next()) {
                System.out.println(resultado.getString("Usuario"));

                Login login = new Login();

                login.setId_login(resultado.getInt("ID_Login"));
                login.setUsuario(resultado.getString("Usuario"));
                login.setSenha(resultado.getString("Senha"));
                login.setDt_criacao(resultado.getString("Dt_Criacao"));
                login.setDt_atualizacao(resultado.getString("Dt_Atualizacao"));
                login.setTipo_login(resultado.getString("Tipo_Login"));
                login.setStatus(resultado.getString("Status"));
                
                return login;
            }
            // Retorna a lista de carros
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

    public void insereLogin(Login us) {
        Conexao conexao = new Conexao();

        PreparedStatement st = null;

        try {

            String sql = "";
            sql += "";
            sql += "INSERT INTO logins"
                    + "(Usuario, "
                    + "Senha, "
                    + "Dt_Criacao, "
                    + "Dt_Atualizacao) "
                    + "VALUES"
                    + "(?, ?, now(), now())";

            st = conexao.getConexao().prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            st.setString(1, us.getUsuario());
            st.setString(2, us.getSenha());

            System.out.println(sql);

            int linhasAfetadas = st.executeUpdate();

            if (linhasAfetadas > 0) {
                ResultSet rs = st.getGeneratedKeys();
                if (rs.next()) {
                    int id = rs.getInt(1);
                    us.setId_login(id);
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

    public void atualizaLogin(String senha, int id) {
        Conexao conexao = new Conexao();

        PreparedStatement st = null;

        try {

            String sql = "";
            sql += "";
            sql += "update logins set Senha = ?, Dt_Atualizacao = now() where id_login = ?";

            st = conexao.getConexao().prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            st.setString(1, senha);
            st.setInt(2, id);

            int linhasAfetadas = st.executeUpdate();

            if (linhasAfetadas > 0) {
                ResultSet rs = st.getGeneratedKeys();
                if (rs.next()) {
                    int idN = rs.getInt(1);
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

    public List<LoginCompleto> buscaListaLoginCompleto() throws SQLException {

        Conexao con = new Conexao();
        con.getConexao(); //Obtendo a conexão
        PreparedStatement stmt = null;
        ResultSet resultado = null;

        //Prepara a lista de carros para retornar
        List<LoginCompleto> listaDeLogins = new ArrayList<>();

        try {
            // Comando SQL na base = tabela de carros
            String sql = " select l.*, f.Nome from logins l" +
                         " left join funcionarios f on" +
                         " l.id_login = f.id_login" +
                         " where l.Status = 'Ativo'";

            //Executa a query (comando SQL)
            stmt = con.getConexao().prepareStatement(sql);
            resultado = stmt.executeQuery();

            //Para cada item retornado no comando (SQL) faça...
            while (resultado.next()) {
                LoginCompleto login = new LoginCompleto(); //Criando uma instância, novo carro na memória

                login.setId_login(resultado.getInt("ID_Login"));
                login.setUsuario(resultado.getString("Usuario"));
                login.setSenha(resultado.getString("Senha"));
                login.setDt_criacao(resultado.getString("Dt_Criacao"));
                login.setDt_atualizacao(resultado.getString("Dt_Atualizacao"));
                login.setNome(resultado.getString("Nome"));

                listaDeLogins.add(login);
            }

            // Retorna a lista de carros
            return listaDeLogins;
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
    
    public List<LoginCompleto> buscaListaLoginCompletoPorNome(String nome) throws SQLException {

        Conexao con = new Conexao();
        con.getConexao(); //Obtendo a conexão
        PreparedStatement stmt = null;
        ResultSet resultado = null;

        //Prepara a lista de carros para retornar
        List<LoginCompleto> listaDeLogins = new ArrayList<>();

        try {
            // Comando SQL na base = tabela de carros
            String sql = " select l.*, f.Nome from logins l" +
                         " left join funcionarios f on" +
                         " l.id_login = f.id_login" +
                         " where nome like ?" +
                         " and l.Status = 'Ativo'";

            //Executa a query (comando SQL)
            stmt = con.getConexao().prepareStatement(sql);
            stmt.setString(1, nome);
            resultado = stmt.executeQuery();

            //Para cada item retornado no comando (SQL) faça...
            while (resultado.next()) {
                LoginCompleto login = new LoginCompleto(); //Criando uma instância, novo carro na memória

                login.setId_login(resultado.getInt("ID_Login"));
                login.setUsuario(resultado.getString("Usuario"));
                login.setSenha(resultado.getString("Senha"));
                login.setDt_criacao(resultado.getString("Dt_Criacao"));
                login.setDt_atualizacao(resultado.getString("Dt_Atualizacao"));
                login.setNome(resultado.getString("Nome"));

                listaDeLogins.add(login);
            }

            // Retorna a lista de carros
            return listaDeLogins;
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
    
    public void desativaLogin(int id) {
        Conexao conexao = new Conexao();

        PreparedStatement st = null;

        try {

            String sql = "";
            sql += "";
            sql += "update logins set Status = 'Inativo', Dt_Atualizacao = now() where id_login = ?";

            st = conexao.getConexao().prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            st.setInt(1, id);

            int linhasAfetadas = st.executeUpdate();

            if (linhasAfetadas > 0) {
                ResultSet rs = st.getGeneratedKeys();
                if (rs.next()) {
                    int idN = rs.getInt(1);
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
