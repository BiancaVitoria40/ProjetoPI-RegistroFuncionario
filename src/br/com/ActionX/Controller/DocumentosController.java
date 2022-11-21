/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ActionX.Controller;

import br.com.ActionX.Conexao.DadosBancariosDAO;
import br.com.ActionX.Conexao.DocumentosDAO;
import br.com.ActionX.Negocio.DadosBancarios;
import br.com.ActionX.Negocio.Documentos;
import java.sql.SQLException;

/**
 *
 * @author bianc
 */
public class DocumentosController {
    
    public boolean CriaDocumentos (Documentos doc){
        DocumentosDAO dDAO = new DocumentosDAO();
        
        dDAO.insereDocumetos(doc);
        
        return true;
    }
    
        public Documentos BuscaDocumentos(int id) throws SQLException{
        Documentos doc = new Documentos();
        DocumentosDAO docDAO = new DocumentosDAO();
        doc = docDAO.buscaDocumentoPorIDFuncionario(id);
        return doc;
    }
    
}
