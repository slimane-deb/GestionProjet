/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java.service.impl;

import java.dao.IFormationDao;
import java.dao.impl.FormationDaoImpl;
import java.model.Formation;
import java.service.IFormationService;
import java.util.List;


public class FormationServiceImpl implements IFormationService{
  private IFormationDao dao =new FormationDaoImpl() ;

    public FormationServiceImpl(IFormationDao dao) {
        this.dao = dao;
    }
    
    @Override
    public Formation save(Formation entity) {
         return dao.save(entity);
    }

    @Override
    public Formation update(Formation entity) {
        return dao.update(entity);
    }

    @Override
    public List<Formation> selectAll() {
        return dao.selectAll();
    }

    @Override
    public List<Formation> selectAll(String sortField, String sort) {
        return dao.selectAll(sortField, sort);
    }

    @Override
    public Formation getById(Long id) {
        return dao.getById(id);
    }

    @Override
    public void remove(Long id) {
        dao.remove(id);
    }

    @Override
    public Formation findOne(String paramName, Object paramValue) {
        return dao.findOne(paramName, paramValue);
    }

    @Override
    public Formation findOne(String[] paramNames, Object[] paramValues) {
        return dao.findOne(paramNames, paramValues);
    }

    @Override
    public int findCountBy(String paramName, String paramValue) {
        return dao.findCountBy(paramName, paramValue);
    }
      
}
