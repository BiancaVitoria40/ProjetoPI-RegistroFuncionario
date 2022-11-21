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
        
        public DadosBancarios buscaDadosBancariosPorIDFuncionario(int ID) throws SQLException {
        //Conecta ao banco de dados por meio da classe de conexão
        Conexao con = new Conexao();
        con.getConexao(); //Obtendo a conexão
        PreparedStatement stmt = null;
        ResultSet resultado = null;

        try {
            String sql = "";
            sql += "";
            sql += " select * from dadosbancarios where id_funcionario = ? order by ID_DadosBancarios desc limit 1";

            //Executa a query (comando SQL)
            stmt = con.getConexao().prepareStatement(sql);
            stmt.setInt(1, ID);
            resultado = stmt.executeQuery();
            DadosBancarios banco = new DadosBancarios();
            while(resultado.next()){
            
            banco.setId_dadosBancarios(resultado.getInt("ID_DadosBancarios"));
            banco.setIdFuncionario(resultado.getInt("ID_funcionario"));
            banco.setCod_banco(resultado.getString("Cod_Banco"));
            banco.setAgencia(resultado.getString("Agencia"));
            banco.setTipo_conta(resultado.getString("Tipo_Conta"));
            banco.setConta(resultado.getString("Conta"));
            banco.setDigito(resultado.getString("Digito"));
            banco.setStatus(resultado.getString("Status"));
      

            return banco;
            }
            return banco;
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
