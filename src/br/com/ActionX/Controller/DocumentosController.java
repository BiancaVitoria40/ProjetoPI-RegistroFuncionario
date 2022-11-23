package br.com.ActionX.Controller;

import br.com.ActionX.Conexao.DocumentosDAO;
import br.com.ActionX.Negocio.Documentos;
import java.sql.SQLException;

/**
 *
 * @author bianc
 */
public class DocumentosController {
    
    public int CriaDocumentos (Documentos doc){
        DocumentosDAO dDAO = new DocumentosDAO();
        
        return dDAO.insereDocumetos(doc);
    }
    
        public Documentos BuscaDocumentos(int id) throws SQLException{
        Documentos doc = new Documentos();
        DocumentosDAO docDAO = new DocumentosDAO();
        doc = docDAO.buscaDocumentoPorIDFuncionario(id);
        return doc;
    }
        
    public void AtualizaDocumentos (Documentos doc){
        DocumentosDAO dDAO = new DocumentosDAO();
        dDAO.atualizaDocumentos(doc);
    }
    
}
