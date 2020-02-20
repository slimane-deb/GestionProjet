/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java.service.impl;

import java.dao.INotificationDao;
import java.dao.impl.NotificationDaoImpl;
import java.model.Notification;
import java.service.INotificationService;
import java.util.List;


public class NotificationServiceImpl implements INotificationService{
    private INotificationDao dao =new NotificationDaoImpl() ;

    public NotificationServiceImpl(INotificationDao dao) {
        this.dao = dao;
    }
    
    @Override
    public Notification save(Notification entity) {
         return dao.save(entity);
    }

    @Override
    public Notification update(Notification entity) {
        return dao.update(entity);
    }

    @Override
    public List<Notification> selectAll() {
        return dao.selectAll();
    }

    @Override
    public List<Notification> selectAll(String sortField, String sort) {
        return dao.selectAll(sortField, sort);
    }

    @Override
    public Notification getById(Long id) {
        return dao.getById(id);
    }

    @Override
    public void remove(Long id) {
        dao.remove(id);
    }

    @Override
    public Notification findOne(String paramName, Object paramValue) {
        return dao.findOne(paramName, paramValue);
    }

    @Override
    public Notification findOne(String[] paramNames, Object[] paramValues) {
        return dao.findOne(paramNames, paramValues);
    }

    @Override
    public int findCountBy(String paramName, String paramValue) {
        return dao.findCountBy(paramName, paramValue);
    }
    
    
}
