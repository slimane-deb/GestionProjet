/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java.service.impl;

import java.dao.IProjetDao;
import java.dao.impl.ProjetDaoImpl;
import java.model.Projet;
import java.service.IProjetService;
import java.util.List;

/**
 *
 * @author selma
 */
public class ProjetServiceImpl implements IProjetService{

    private IProjetDao dao =new ProjetDaoImpl() ;

    public ProjetServiceImpl(IProjetDao dao) {
        this.dao = dao;
    }
    
    @Override
    public Projet save(Projet entity) {
         return dao.save(entity);
    }

    @Override
    public Projet update(Projet entity) {
        return dao.update(entity);
    }

    @Override
    public List<Projet> selectAll() {
        return dao.selectAll();
    }

    @Override
    public List<Projet> selectAll(String sortField, String sort) {
        return dao.selectAll(sortField, sort);
    }

    @Override
    public Projet getById(Long id) {
        return dao.getById(id);
    }

    @Override
    public void remove(Long id) {
        dao.remove(id);
    }

    @Override
    public Projet findOne(String paramName, Object paramValue) {
        return dao.findOne(paramName, paramValue);
    }

    @Override
    public Projet findOne(String[] paramNames, Object[] paramValues) {
        return dao.findOne(paramNames, paramValues);
    }

    @Override
    public int findCountBy(String paramName, String paramValue) {
        return dao.findCountBy(paramName, paramValue);
    }
    
}
