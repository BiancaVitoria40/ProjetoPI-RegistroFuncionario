package br.com.ActionX.Conexao;

import br.com.ActionX.Negocio.Funcionario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FuncionariosDAO {

    public List<Funcionario> buscaListaFuncionarios() throws SQLException {
        //Conecta ao banco de dados por meio da classe de conexão
        Conexao con = new Conexao();
        con.getConexao(); //Obtendo a conexão
        PreparedStatement stmt = null;
        ResultSet resultado = null;

        //Prepara a lista de carros para retornar
        List<Funcionario> listaDeFuncionarios = new ArrayList<>();

        try {
            // Comando SQL na base = tabela de carros
            String sql = "select * from funcionarios";

            //Executa a query (comando SQL)
            stmt = con.getConexao().prepareStatement(sql);
            resultado = stmt.executeQuery();

            //Para cada item retornado no comando (SQL) faça...
            while (resultado.next()) {
                Funcionario func = new Funcionario(); //Criando uma instância, novo carro na memória

                func.setIdFuncionario(resultado.getInt("Id_Funcionario"));
                func.setNome(resultado.getString("nome"));
                func.setEmail(resultado.getString("email"));
                func.setTelefone(resultado.getString("Telefone"));
                func.setGenero(resultado.getString("Genero"));
                func.setRaca(resultado.getString("Raca"));
                func.setDt_nascimento(resultado.getString("dt_nascimento"));
                func.setNacionalidade(resultado.getString("Nacionalidade"));
                func.setEstado_civil(resultado.getString("Estado_Civil"));
                func.setStatus(resultado.getString("Status"));
                func.setDt_criacao(resultado.getString("Dt_Criacao"));
                func.setDt_atualizacao(resultado.getString("Dt_Atualizacao"));
                func.setQtd_dependente(resultado.getInt("Qtd_Dependentes"));
                func.setQtd_pensionista(resultado.getInt("Qtd_Pensionistas"));
                func.setIdLogin(resultado.getInt("ID_Login"));

                listaDeFuncionarios.add(func);
            }

            // Retorna a lista de carros
            return listaDeFuncionarios;
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

    public Funcionario buscaFuncionarioPorID(int ID) throws SQLException {
        //Conecta ao banco de dados por meio da classe de conexão
        Conexao con = new Conexao();
        con.getConexao(); //Obtendo a conexão
        PreparedStatement stmt = null;
        ResultSet resultado = null;

        try {
            String sql = "";
            sql += "";
            sql
                    += "SELECT funcionarios.ID_Funcionario, "
                    + "    funcionarios.ID_Login, "
                    + "    funcionarios.Nome, "
                    + "    funcionarios.Email, "
                    + "    funcionarios.Telefone, "
                    + "    funcionarios.Genero, "
                    + "    funcionarios.Raca, "
                    + "    funcionarios.Dt_Nascimento, "
                    + "    funcionarios.Nacionalidade, "
                    + "    funcionarios.Estado_Civil, "
                    + "    funcionarios.Status_func, "
                    + "    funcionarios.Dt_Criacao, "
                    + "    funcionarios.Dt_Atualizacao, "
                    + "    funcionarios.Qtd_Dependentes, "
                    + "    funcionarios.Qtd_Pensionistas "
                    + "FROM registrofuncionario.funcionarios "
                    + "WHERE ID_Funcionario = ?";

            //Executa a query (comando SQL)
            stmt = con.getConexao().prepareStatement(sql);
            stmt.setInt(1, ID);
            resultado = stmt.executeQuery();
            Funcionario func = new Funcionario();
            while(resultado.next()){
            

            func.setIdFuncionario(resultado.getInt("ID_Funcionario"));
            func.setNome(resultado.getString("nome"));
            func.setEmail(resultado.getString("email"));
            func.setTelefone(resultado.getString("Telefone"));
            func.setGenero(resultado.getString("Genero"));
            func.setRaca(resultado.getString("Raca"));
            func.setDt_nascimento(resultado.getString("dt_nascimento"));
            func.setNacionalidade(resultado.getString("Nacionalidade"));
            func.setEstado_civil(resultado.getString("Estado_Civil"));
            func.setStatus(resultado.getString("Status"));
            func.setDt_criacao(resultado.getString("Dt_Criacao"));
            func.setDt_atualizacao(resultado.getString("Dt_Atualizacao"));
            func.setQtd_dependente(resultado.getInt("Qtd_Dependentes"));
            func.setQtd_pensionista(resultado.getInt("Qtd_Pensionistas"));
            func.setIdLogin(resultado.getInt("ID_Login"));

            return func;
            }
            return func;
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

    public List<Funcionario> buscaListaFuncionariosPorNome(String nome) throws SQLException {
        //Conecta ao banco de dados por meio da classe de conexão
        Conexao con = new Conexao();
        con.getConexao(); //Obtendo a conexão
        PreparedStatement stmt = null;
        ResultSet resultado = null;

        //Prepara a lista de carros para retornar
        List<Funcionario> listaDeFuncionarios = new ArrayList<>();

        try {
            // Comando SQL na base = tabela de carros
            String sql = "select * from funcionarios where nome like ?;";

            //Executa a query (comando SQL)
            stmt = con.getConexao().prepareStatement(sql);
            stmt.setString(1, "%" + nome + "%");
            resultado = stmt.executeQuery();

            //Para cada item retornado no comando (SQL) faça...
            while (resultado.next()) {
                Funcionario func = new Funcionario();

                func.setIdFuncionario(resultado.getInt("Id_Funcionario"));
                func.setNome(resultado.getString("nome"));
                func.setEmail(resultado.getString("email"));
                func.setTelefone(resultado.getString("Telefone"));
                func.setGenero(resultado.getString("Genero"));
                func.setRaca(resultado.getString("Raca"));
                func.setDt_nascimento(resultado.getString("dt_nascimento"));
                func.setNacionalidade(resultado.getString("Nacionalidade"));
                func.setEstado_civil(resultado.getString("Estado_Civil"));
                func.setStatus(resultado.getString("Status"));
                func.setDt_criacao(resultado.getString("Dt_Criacao"));
                func.setDt_atualizacao(resultado.getString("Dt_Atualizacao"));
                func.setQtd_dependente(resultado.getInt("Qtd_Dependentes"));
                func.setQtd_pensionista(resultado.getInt("Qtd_Pensionistas"));
                func.setIdLogin(resultado.getInt("ID_Login"));

                listaDeFuncionarios.add(func);
            }

            return listaDeFuncionarios;
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

    public void insereFuncionario(Funcionario func) {
        Conexao conexao = new Conexao();

        PreparedStatement st = null;

        try {

            String sql = "";
            sql += "";
            sql += "INSERT INTO funcionarios"
                    + "(ID_Login, "
                    + "Nome, "
                    + "Email, "
                    + "Telefone, "
                    + "Genero, "
                    + "Raca, "
                    + "Dt_Nascimento, "
                    + "Nacionalidade, "
                    + "Estado_Civil, "
                    + "Status, "
                    + "Dt_Criacao, "
                    + "Dt_Atualizacao, "
                    + "Qtd_Dependentes, "
                    + "Qtd_Pensionistas)"
                    + "VALUES"
                    + "(?,  ?,  ?,  ?,  ?,  ?,  ?,  ?,  ?,  ?,  now(),  now(),  ?,  ?)";

            st = conexao.getConexao().prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            st.setInt(1, func.getIdLogin());
            st.setString(2, func.getNome());
            st.setString(3, func.getEmail());
            st.setString(4, func.getTelefone());
            st.setString(5, func.getGenero());
            st.setString(6, func.getRaca());
            st.setString(7, func.getDt_nascimento());
            st.setString(8, func.getNacionalidade());
            st.setString(9, func.getEstado_civil());
            st.setString(10, func.getStatus());
            st.setInt(11, func.getQtd_dependente());
            st.setInt(12, func.getQtd_pensionista());

            System.out.println(sql);

            int linhasAfetadas = st.executeUpdate();

            if (linhasAfetadas > 0) {
                ResultSet rs = st.getGeneratedKeys();
                if (rs.next()) {
                    int id = rs.getInt(1);
                    func.setIdFuncionario(id);
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

    public void atualizaFuncionario(Funcionario func) {
        Conexao conexao = new Conexao();

        PreparedStatement st = null;

        try {

            String sql = "";
            sql += "";
            sql += "UPDATE `funcionarios`\n"
                    + "SET\n"
                    + "`Nome` = ?,\n"
                    + "`Email` = ?,\n"
                    + "`Telefone` = ?,\n"
                    + "`Genero` = ?,\n"
                    + "`Raca` = ?,\n"
                    + "`Dt_Nascimento` = ?,\n"
                    + "`Nacionalidade` = ?,\n"
                    + "`Estado_Civil` =?,\n"
                    + "`Status` =?,\n"
                    + "`Dt_Atualizacao` = now(),\n"
                    + "`Qtd_Dependentes` = ?,\n"
                    + "`Qtd_Pensionistas` = ?\n"
                    + "WHERE `ID_Funcionario` = ?;";

            st = conexao.getConexao().prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            st.setString(1, func.getNome());
            st.setString(2, func.getEmail());
            st.setString(3, func.getTelefone());
            st.setString(4, func.getGenero());
            st.setString(5, func.getRaca());
            st.setString(6, func.getDt_nascimento());
            st.setString(7, func.getNacionalidade());
            st.setString(8, func.getEstado_civil());
            st.setString(9, func.getStatus());
            st.setInt(10, func.getQtd_dependente());
            st.setInt(11, func.getQtd_pensionista());
            st.setInt(12, func.getIdFuncionario());

            int linhasAfetadas = st.executeUpdate();

            if (linhasAfetadas > 0) {
                ResultSet rs = st.getGeneratedKeys();
                if (rs.next()) {
                    int id = rs.getInt(1);
                    func.setIdFuncionario(id);
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
