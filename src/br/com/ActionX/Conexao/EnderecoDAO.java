package br.com.ActionX.Conexao;

import br.com.ActionX.Negocio.Enderecos;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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

}
