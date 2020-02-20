/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java.service;

import java.model.Document;
import java.util.List;

public interface IDocumentService {


    public Document save(Document entity);

    public Document update(Document entity);

    public List<Document> selectAll();

    public List<Document> selectAll(String sortField, String sort);

    public Document getById(Long id);

    public void remove(Long id);

    public Document findOne(String paramName, Object paramValue);

    public Document findOne(String[] paramNames, Object[] paramValues);

    public int findCountBy(String paramName, String paramValue);

}   

