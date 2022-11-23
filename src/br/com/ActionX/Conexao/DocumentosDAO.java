package br.com.ActionX.Conexao;

import br.com.ActionX.Negocio.Documentos;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DocumentosDAO {
    
      public int insereDocumetos(Documentos doc) {
        Conexao conexao = new Conexao();

        PreparedStatement st = null;

        try {

            String sql = "";
            sql += "";
            sql += "INSERT INTO registrofuncionario.documentos" +
                    "(ID_Funcionario," 
                    + "`RG`,\n"
                    + "`CPF`,\n"
                    + "`Titulo_Eleitor`,\n"
                    + "`CTPS`,\n"
                    + "`Serie`,\n"
                    + "`UF`,\n"
                    + "`Certidao_Nascimento`,\n"
                    + "`Certidao_Civil`,\n"
                    + "`Reservista`,\n" 
                    + "`PIS`)"
                    + "VALUES" 
                    + "(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                    

            st = conexao.getConexao().prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            st.setInt(1, doc.getIdFuncionario());
            st.setString(2, doc.getRg());
            st.setString(3, doc.getCpf());
            st.setString(4, doc.getTitulo_eleitor());
            st.setString(5, doc.getCtps());
            st.setString(6, doc.getSerie());
            st.setString(7, doc.getUf());
            st.setString(8, doc.getCertidao_nascimento());
            st.setString(9, doc.getCertidao_civil());
            st.setString(10, doc.getReservista());
            st.setString(11, doc.getPis());

            System.out.println(sql);

            int linhasAfetadas = st.executeUpdate();

            if (linhasAfetadas > 0) {
                ResultSet rs = st.getGeneratedKeys();
                if (rs.next()) {
                    int id = rs.getInt(1);
                    doc.setId_documento(id);
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
      
      public void atualizaDocumentos(Documentos doc) {
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

      public Documentos buscaDocumentoPorIDFuncionario(int ID) throws SQLException {
        //Conecta ao banco de dados por meio da classe de conexão
        Conexao con = new Conexao();
        con.getConexao(); //Obtendo a conexão
        PreparedStatement stmt = null;
        ResultSet resultado = null;

        try {
            String sql = "";
            sql += "";
            sql += " select * from documentos where id_funcionario = ? order by ID_Documento desc limit 1";

            //Executa a query (comando SQL)
            stmt = con.getConexao().prepareStatement(sql);
            stmt.setInt(1, ID);
            resultado = stmt.executeQuery();
            Documentos doc = new Documentos();
            while(resultado.next()){
            
            doc.setId_documento(resultado.getInt("ID_Documento"));
            doc.setIdFuncionario(resultado.getInt("ID_funcionario"));
            doc.setRg(resultado.getString("Rg"));
            doc.setCpf(resultado.getString("Cpf"));
            doc.setTitulo_eleitor(resultado.getString("Titulo_Eleitor"));
            doc.setCtps(resultado.getString("CTPS"));
            doc.setSerie(resultado.getString("Serie"));
            doc.setUf(resultado.getString("UF"));
            doc.setCertidao_nascimento(resultado.getString("Certidao_Nascimento"));
            doc.setCertidao_civil(resultado.getString("Certidao_Civil"));
            doc.setReservista(resultado.getString("Reservista"));
            doc.setPis(resultado.getString("Pis"));

            return doc;
            }
            return doc;
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
