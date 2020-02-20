/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java.service.impl;

import java.dao.IMessageDao;
import java.dao.impl.MessageDaoImpl;
import java.model.Message;
import java.service.IMessageService;
import java.util.List;


public class MessageServiceImpl implements IMessageService {
    private IMessageDao dao =new MessageDaoImpl() ;

    public MessageServiceImpl(IMessageDao dao) {
        this.dao = dao;
    }
    
    @Override
    public Message save(Message entity) {
         return dao.save(entity);
    }

    @Override
    public Message update(Message entity) {
        return dao.update(entity);
    }

    @Override
    public List<Message> selectAll() {
        return dao.selectAll();
    }

    @Override
    public List<Message> selectAll(String sortField, String sort) {
        return dao.selectAll(sortField, sort);
    }

    @Override
    public Message getById(Long id) {
        return dao.getById(id);
    }

    @Override
    public void remove(Long id) {
        dao.remove(id);
    }

    @Override
    public Message findOne(String paramName, Object paramValue) {
        return dao.findOne(paramName, paramValue);
    }

    @Override
    public Message findOne(String[] paramNames, Object[] paramValues) {
        return dao.findOne(paramNames, paramValues);
    }

    @Override
    public int findCountBy(String paramName, String paramValue) {
        return dao.findCountBy(paramName, paramValue);
    }
    
    
}
