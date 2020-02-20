/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java.service.impl;
import java.dao.IReunionDao;
import java.dao.impl.ReunionDaoImpl;
import java.service.IReunionService;
import java.model.Reunion;
import java.util.List;


public class ReunionServiceImpl implements IReunionService {
  private IReunionDao dao =new ReunionDaoImpl() ;

    public ReunionServiceImpl(IReunionDao dao) {
        this.dao = dao;
    }
    
    @Override
    public Reunion save(Reunion entity) {
         return dao.save(entity);
    }

    @Override
    public Reunion update(Reunion entity) {
        return dao.update(entity);
    }

    @Override
    public List<Reunion> selectAll() {
        return dao.selectAll();
    }

    @Override
    public List<Reunion> selectAll(String sortField, String sort) {
        return dao.selectAll(sortField, sort);
    }

    @Override
    public Reunion getById(Long id) {
        return dao.getById(id);
    }

    @Override
    public void remove(Long id) {
        dao.remove(id);
    }

    @Override
    public Reunion findOne(String paramName, Object paramValue) {
        return dao.findOne(paramName, paramValue);
    }

    @Override
    public Reunion findOne(String[] paramNames, Object[] paramValues) {
        return dao.findOne(paramNames, paramValues);
    }

    @Override
    public int findCountBy(String paramName, String paramValue) {
        return dao.findCountBy(paramName, paramValue);
    }
       
}
