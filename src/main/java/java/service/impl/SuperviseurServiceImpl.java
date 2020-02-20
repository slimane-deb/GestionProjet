/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java.service.impl;

import java.dao.ISuperviseurDao;
import java.dao.impl.SuperviseurDaoImpl;
import java.model.Superviseur;
import java.service.ISuperviseurService;
import java.util.List;


public class SuperviseurServiceImpl implements ISuperviseurService{
 private ISuperviseurDao dao =new SuperviseurDaoImpl() ;

    public SuperviseurServiceImpl(ISuperviseurDao dao) {
        this.dao = dao;
    }
    
    @Override
    public Superviseur save(Superviseur entity) {
         return dao.save(entity);
    }

    @Override
    public Superviseur update(Superviseur entity) {
        return dao.update(entity);
    }

    @Override
    public List<Superviseur> selectAll() {
        return dao.selectAll();
    }

    @Override
    public List<Superviseur> selectAll(String sortField, String sort) {
        return dao.selectAll(sortField, sort);
    }

    @Override
    public Superviseur getById(Long id) {
        return dao.getById(id);
    }

    @Override
    public void remove(Long id) {
        dao.remove(id);
    }

    @Override
    public Superviseur findOne(String paramName, Object paramValue) {
        return dao.findOne(paramName, paramValue);
    }

    @Override
    public Superviseur findOne(String[] paramNames, Object[] paramValues) {
        return dao.findOne(paramNames, paramValues);
    }

    @Override
    public int findCountBy(String paramName, String paramValue) {
        return dao.findCountBy(paramName, paramValue);
    }   
}
