/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java.service.impl;

import java.dao.IChefprojetDao;
import java.dao.impl.ChefprojetDaoImpl;
import java.model.Chefprojet;
import java.service.IChefprojetService;
import java.util.List;

public class ChefprojetServiceImpl implements IChefprojetService {
     private IChefprojetDao dao =new ChefprojetDaoImpl() ;

    public ChefprojetServiceImpl(IChefprojetDao dao) {
        this.dao = dao;
    }
    
    @Override
    public Chefprojet save(Chefprojet entity) {
         return dao.save(entity);
    }

    @Override
    public Chefprojet update(Chefprojet entity) {
        return dao.update(entity);
    }

    @Override
    public List<Chefprojet> selectAll() {
        return dao.selectAll();
    }

    @Override
    public List<Chefprojet> selectAll(String sortField, String sort) {
        return dao.selectAll(sortField, sort);
    }

    @Override
    public Chefprojet getById(Long id) {
        return dao.getById(id);
    }

    @Override
    public void remove(Long id) {
        dao.remove(id);
    }

    @Override
    public Chefprojet findOne(String paramName, Object paramValue) {
        return dao.findOne(paramName, paramValue);
    }

    @Override
    public Chefprojet findOne(String[] paramNames, Object[] paramValues) {
        return dao.findOne(paramNames, paramValues);
    }

    @Override
    public int findCountBy(String paramName, String paramValue) {
        return dao.findCountBy(paramName, paramValue);
    }
    
    
}
