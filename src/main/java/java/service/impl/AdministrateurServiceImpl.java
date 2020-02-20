/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java.service.impl;

import java.dao.IAdministrateurDao;
import java.dao.impl.AdministrateurDaoImpl;
import java.model.Administrateur;
import java.service.IAdministrateurService;
import java.util.List;


public class AdministrateurServiceImpl implements IAdministrateurService{
     private IAdministrateurDao dao =new AdministrateurDaoImpl() ;

    public AdministrateurServiceImpl(IAdministrateurDao dao) {
        this.dao = dao;
    }
    
    @Override
    public Administrateur save(Administrateur entity) {
         return dao.save(entity);
    }

    @Override
    public Administrateur update(Administrateur entity) {
        return dao.update(entity);
    }

    @Override
    public List<Administrateur> selectAll() {
        return dao.selectAll();
    }

    @Override
    public List<Administrateur> selectAll(String sortField, String sort) {
        return dao.selectAll(sortField, sort);
    }

    @Override
    public Administrateur getById(Long id) {
        return dao.getById(id);
    }

    @Override
    public void remove(Long id) {
        dao.remove(id);
    }

    @Override
    public Administrateur findOne(String paramName, Object paramValue) {
        return dao.findOne(paramName, paramValue);
    }

    @Override
    public Administrateur findOne(String[] paramNames, Object[] paramValues) {
        return dao.findOne(paramNames, paramValues);
    }

    @Override
    public int findCountBy(String paramName, String paramValue) {
        return dao.findCountBy(paramName, paramValue);
    }
    
    
    
}
