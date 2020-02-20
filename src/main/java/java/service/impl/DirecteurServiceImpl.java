/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java.service.impl;

import java.dao.IDirecteurDao;
import java.dao.impl.DirecteurDaoImpl;
import java.model.Directeur;
import java.service.IDirecteurService;
import java.util.List;


public class DirecteurServiceImpl implements IDirecteurService {
   private IDirecteurDao dao =new DirecteurDaoImpl() ;

    public DirecteurServiceImpl(IDirecteurDao dao) {
        this.dao = dao;
    }
    
     
    @Override
    public Directeur save(Directeur entity) {
         return dao.save(entity);
    }

    @Override
    public Directeur update(Directeur entity) {
        return dao.update(entity);
    }

    @Override
    public List<Directeur> selectAll() {
        return dao.selectAll();
    }

    @Override
    public List<Directeur> selectAll(String sortField, String sort) {
        return dao.selectAll(sortField, sort);
    }

    @Override
    public Directeur getById(Long id) {
        return dao.getById(id);
    }

    @Override
    public void remove(Long id) {
        dao.remove(id);
    }

    @Override
    public Directeur findOne(String paramName, Object paramValue) {
        return dao.findOne(paramName, paramValue);
    }

    @Override
    public Directeur findOne(String[] paramNames, Object[] paramValues) {
        return dao.findOne(paramNames, paramValues);
    }

    @Override
    public int findCountBy(String paramName, String paramValue) {
        return dao.findCountBy(paramName, paramValue);
    } 
}
