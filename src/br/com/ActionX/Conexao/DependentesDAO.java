package br.com.ActionX.Conexao;

import br.com.ActionX.Negocio.Dependentes;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DependentesDAO {

    public int insereDependente(Dependentes dep) {
        Conexao conexao = new Conexao();

        PreparedStatement st = null;

        try {

            String sql = "";
            sql += "";
            sql += "INSERT INTO registrofuncionario.dependentes"
                    + "(ID_Funcionario, "
                    + "Nome, "
                    + "Email, "
                    + "Telefone, "
                    + "Tipo_Dependente, "
                    + "Certidao, "
                    + "Data_nascimento, "
                    + "Genero, "
                    + "CPF, "
                    + "Status) "
                    + "VALUES "
                    + "(?, "
                    + "?, "
                    + "?, "
                    + "?, "
                    + "?, "
                    + "?, "
                    + "?, "
                    + "?, "
                    + "?, "
                    + "'Ativo');";

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
            

            System.out.println(sql);

            int linhasAfetadas = st.executeUpdate();

            if (linhasAfetadas > 0) {
                ResultSet rs = st.getGeneratedKeys();
                if (rs.next()) {
                    int id = rs.getInt(1);
                    dep.setId_dependentes(id);
                    return id;
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
        return 0;
    }

    public void atualizaDependente(Dependentes dep) {
        Conexao conexao = new Conexao();

        PreparedStatement st = null;

        try {

            String sql = "";
            sql += "";
            sql += "UPDATE registrofuncionario.dependentes "
                    + "SET "
                    + "Nome = ?, "
                    + "Email = ?, "
                    + "Telefone = ?, "
                    + "Tipo_Dependente = ?, "
                    + "Certidao = ?, "
                    + "Data_nascimento = ?, "
                    + "Genero = ?, "
                    + "CPF = ?, "
                    + "Status = ? "
                    + "WHERE ID_Dependente = ?;";

            st = conexao.getConexao().prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            st.setString(1, dep.getNome());
            st.setString(2, dep.getEmail());
            st.setString(3, dep.getTelefone());
            st.setString(4, dep.getTipo_dependente());
            st.setString(5, dep.getCertidao());
            st.setString(6, dep.getData_nascimento());
            st.setString(7, dep.getGenero());
            st.setString(8, dep.getCpf());
            st.setString(9, dep.getStatus());
            st.setInt(10, dep.getId_dependentes());

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

    public List<Dependentes> buscaDependentePorIDFuncionario(int ID) throws SQLException {
        //Conecta ao banco de dados por meio da classe de conexão
        Conexao con = new Conexao();
        con.getConexao(); //Obtendo a conexão
        PreparedStatement stmt = null;
        ResultSet resultado = null;

        List<Dependentes> listaDeDependentes = new ArrayList<>();
        try {
            String sql = "";
            sql += "";
            sql += " select * from dependentes where id_funcionario = ? order by ID_dependente desc";

            //Executa a query (comando SQL)
            stmt = con.getConexao().prepareStatement(sql);
            stmt.setInt(1, ID);
            resultado = stmt.executeQuery();
            
            while (resultado.next()) {

                Dependentes dep = new Dependentes();
                
                dep.setId_dependentes(resultado.getInt("ID_Dependente"));
                dep.setidFuncionario(resultado.getInt("ID_Funcionario"));
                dep.setNome(resultado.getString("Nome"));
                dep.setEmail(resultado.getString("Email"));
                dep.setTelefone(resultado.getString("Telefone"));
                dep.setTipo_dependente(resultado.getString("Tipo_Dependente"));
                dep.setCertidao(resultado.getString("Certidao"));
                dep.setData_nascimento(resultado.getString("Data_nascimento"));
                dep.setGenero(resultado.getString("Genero"));
                dep.setCpf(resultado.getString("CPF"));
                dep.setStatus(resultado.getString("Status"));
                

                listaDeDependentes.add(dep) ;
            }
            return listaDeDependentes;
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
    
    public Dependentes buscaDependentePorID(int ID) throws SQLException {
        //Conecta ao banco de dados por meio da classe de conexão
        Conexao con = new Conexao();
        con.getConexao(); //Obtendo a conexão
        PreparedStatement stmt = null;
        ResultSet resultado = null;

        List<Dependentes> listaDeDependentes = new ArrayList<>();
        try {
            String sql = "";
            sql += "";
            sql += " select * from dependentes where ID_Dependente = ? order by ID_dependente limit 1";

            //Executa a query (comando SQL)
            stmt = con.getConexao().prepareStatement(sql);
            stmt.setInt(1, ID);
            resultado = stmt.executeQuery();
            Dependentes dep = new Dependentes();
            while (resultado.next()) {

                dep.setId_dependentes(resultado.getInt("ID_Dependente"));
                dep.setidFuncionario(resultado.getInt("ID_Funcionario"));
                dep.setNome(resultado.getString("Nome"));
                dep.setEmail(resultado.getString("Email"));
                dep.setTelefone(resultado.getString("Telefone"));
                dep.setTipo_dependente(resultado.getString("Tipo_Dependente"));
                dep.setCertidao(resultado.getString("Certidao"));
                dep.setData_nascimento(resultado.getString("Data_nascimento"));
                dep.setGenero(resultado.getString("Genero"));
                dep.setCpf(resultado.getString("CPF"));
                dep.setStatus(resultado.getString("Status"));
                

                return dep ;
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
}
