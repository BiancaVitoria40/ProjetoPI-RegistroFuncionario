package br.com.ActionX.Conexao;

import br.com.ActionX.Negocio.Documentos;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DocumentosDAO {
    
      public void insereDocumetos(Documentos doc) {
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
            st.setString(5, doc.getTitulo_eleitor());
            st.setString(6, doc.getCtps());
            st.setString(7, doc.getSerie());
            st.setString(8, doc.getUf());
            st.setString(9, doc.getCertidao_nascimento());
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
      
      public void atualizaDocumentos(Documentos doc) {
        Conexao conexao = new Conexao();

        PreparedStatement st = null;

        try {

            String sql = "";
            sql += "";
            sql += "UPDATE Documentos"
                    + "SET"
                    + "`ID_Funcionario` = ?,"
                    + "`RG` = ?,"
                    + "`CPF` = ?,"
                    + "`Titulo_Eleitor` = ?,"
                    + "`CTPS` = ?,"
                    + "`Serie` = ?,"
                    + "`UF` = ?,"
                    + "`Certidao_Nascimento` = ? "
                    + "`Certidao_Civil` = ? "
                    + "`Reservista` = ? "
                    + "`PIS` = ? "
                    + "WHERE ID_Documento = ?; ";

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
            st.setString(10, doc.getPis());

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
