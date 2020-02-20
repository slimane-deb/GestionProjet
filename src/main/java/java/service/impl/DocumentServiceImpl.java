/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java.service.impl;

import java.dao.IDocumentDao;
import java.dao.impl.DocumentDaoImpl;
import java.model.Document;
import java.service.IDocumentService;
import java.util.List;


public class DocumentServiceImpl implements IDocumentService{
      private IDocumentDao dao =new DocumentDaoImpl() ;

    public DocumentServiceImpl(IDocumentDao dao) {
        this.dao = dao;
    }
    
     
    @Override
    public Document save(Document entity) {
         return dao.save(entity);
    }

    @Override
    public Document update(Document entity) {
        return dao.update(entity);
    }

    @Override
    public List<Document> selectAll() {
        return dao.selectAll();
    }

    @Override
    public List<Document> selectAll(String sortField, String sort) {
        return dao.selectAll(sortField, sort);
    }

    @Override
    public Document getById(Long id) {
        return dao.getById(id);
    }

    @Override
    public void remove(Long id) {
        dao.remove(id);
    }

    @Override
    public Document findOne(String paramName, Object paramValue) {
        return dao.findOne(paramName, paramValue);
    }

    @Override
    public Document findOne(String[] paramNames, Object[] paramValues) {
        return dao.findOne(paramNames, paramValues);
    }

    @Override
    public int findCountBy(String paramName, String paramValue) {
        return dao.findCountBy(paramName, paramValue);
    }
    
}
