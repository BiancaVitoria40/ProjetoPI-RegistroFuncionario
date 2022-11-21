package br.com.ActionX.Conexao;

import br.com.ActionX.Negocio.Enderecos;
import br.com.ActionX.Negocio.Funcionario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

public class EnderecoDAO {

    public void insereEndereco(Enderecos endereco) {
        Conexao conexao = new Conexao();

        PreparedStatement st = null;

        try {

            String sql = "";
            sql += "";
            sql += "INSERT INTO enderecos"
                    + "(`ID_funcionario`,\n"
                    + "`Logradouro`,\n"
                    + "`Numero`,\n"
                    + "`Complemento`,\n"
                    + "`CEP`,\n"
                    + "`Bairro`,\n"
                    + "`Cidade`,\n"
                    + "`Estado`,\n"
                    + "`Pais`)"
                    + "VALUES"
                    + "(?, ?, ?, ?, ?, ?, ?, ?, ?)";

            st = conexao.getConexao().prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            st.setInt(1, endereco.getidFuncionario());
            st.setString(2, endereco.getLogradouro());
            st.setString(3, endereco.getNumero());
            st.setString(4, endereco.getComplemento());
            st.setString(5, endereco.getCep());
            st.setString(6, endereco.getBairro());
            st.setString(7, endereco.getCidade());
            st.setString(8, endereco.getEstado());
            st.setString(9, endereco.getPais());

            System.out.println(sql);

            int linhasAfetadas = st.executeUpdate();

            if (linhasAfetadas > 0) {
                ResultSet rs = st.getGeneratedKeys();
                if (rs.next()) {
                    int id = rs.getInt(1);
                    endereco.setId_endereco(id);
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
    
    public void atualizaEndereco(Enderecos end) {
        Conexao conexao = new Conexao();

        PreparedStatement st = null;

        try {

            String sql = "";
            sql += "";
            sql += "UPDATE Enderecos"
                    + "SET"
                    + "`ID_Funcionario` = ?,"
                    + "`Logradouro` = ?,"
                    + "`Numero` = ?,"
                    + "`Complemento` = ?,"
                    + "`CEP` = ?,"
                    + "`Bairro` = ?,"
                    + "`Cidade` = ?,"
                    + "`Estado` = ? "
                    + "`Pais` = ? "
                    + "`Status` = ? "
                    + "WHERE ID_Endereco = ?; ";

            st = conexao.getConexao().prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            st.setInt(1, end.getidFuncionario());
            st.setString(2, end.getLogradouro());
            st.setString(3, end.getNumero());
            st.setString(4, end.getComplemento());
            st.setString(5, end.getCep());
            st.setString(6, end.getBairro());
            st.setString(7, end.getCidade());
            st.setString(8, end.getEstado());
            st.setString(9, end.getPais());
            st.setString(10, end.getStatus());

            System.out.println(sql);

            int linhasAfetadas = st.executeUpdate();

            if (linhasAfetadas > 0) {
                ResultSet rs = st.getGeneratedKeys();
                if (rs.next()) {
                    int id = rs.getInt(1);
                    end.setId_endereco(id);
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
    
        public Enderecos buscaEnderecoPorIDFuncionario(int ID) throws SQLException {
        //Conecta ao banco de dados por meio da classe de conex�o
        Conexao con = new Conexao();
        con.getConexao(); //Obtendo a conex�o
        PreparedStatement stmt = null;
        ResultSet resultado = null;

        try {
            String sql = "";
            sql += "";
            sql += " select * from enderecos where id_funcionario = ? and Status = 'ativo' order by ID_Endereco desc limit 1";

            //Executa a query (comando SQL)
            stmt = con.getConexao().prepareStatement(sql);
            stmt.setInt(1, ID);
            resultado = stmt.executeQuery();
            Enderecos end = new Enderecos();
            while(resultado.next()){
            
            end.setId_endereco(resultado.getInt("ID_Endereco"));
            end.setidFuncionario(resultado.getInt("ID_funcionario"));
            end.setLogradouro(resultado.getString("Logradouro"));
            end.setNumero(resultado.getString("Numero"));
            end.setComplemento(resultado.getString("Complemento"));
            end.setCep(resultado.getString("CEP"));
            end.setBairro(resultado.getString("Bairro"));
            end.setCidade(resultado.getString("Cidade"));
            end.setEstado(resultado.getString("Estado"));
            end.setPais(resultado.getString("Pais"));
            end.setStatus(resultado.getString("Status"));

            return end;
            }
            return end;
        } catch (SQLException e) { //Caso d� alguma exce��o
            System.out.println(e.getMessage());
            return null;
        } finally {
            // Ap�s terminar, fecha a conex�o, stmt, rs
            resultado.close();
            stmt.close();
            con.getConexao().close();
        }
    }
        
        
}
