package br.com.ActionX.Conexao;

import br.com.ActionX.Negocio.Login;
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
            sql += "SELECT ID_Login, " +
                   "Usuario, " +
                   "Senha, " +
                   "Dt_Criacao, " +
                   "Dt_Atualizacao, " +
                   "Status " +
                   "FROM registrofuncionario.logins " +
                   "WHERE Usuario = ? "+
                   "AND Status = 'Ativo' "+
                   "LIMIT 1" ;

            //Executa a query (comando SQL)
            stmt = con.getConexao().prepareStatement(sql);
            stmt.setString(1, usuario);
            
            resultado = stmt.executeQuery();
            
            while(resultado.next()){
            System.out.println(resultado.getString("Usuario"));

            Login login = new Login();
            
                login.setId_login(resultado.getInt("ID_Login"));
                login.setUsuario(resultado.getString("Usuario"));
                login.setSenha(resultado.getString("Senha"));
                login.setDt_criacao(resultado.getString("Dt_Criacao"));
                login.setDt_atualizacao(resultado.getString("Dt_Atualizacao"));
            
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
        
        public void atualizaLogin(Login us) {
        Conexao conexao = new Conexao();

        PreparedStatement st = null;

        try {

            String sql = "";
            sql += "";
            sql += "UPDATE `logins`\n"
                    + "SET\n"
                    + "`Usuario` = ?,\n"
                    + "`Senha` = ?,\n"
                    + "`Dt_Criacao` = ?,\n"
                    + "`Dt_Atualizacao` = ?,\n"
                    + "WHERE `ID_Login` = ?;";

            st = conexao.getConexao().prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            st.setString(1, us.getUsuario());
            st.setString(2, us.getSenha());
            st.setString(3, us.getDt_criacao());
            st.setString(4, us.getDt_atualizacao());

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



    
}
