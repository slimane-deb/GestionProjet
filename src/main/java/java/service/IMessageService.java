/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java.service;

import java.model.Message;
import java.util.List;


public interface IMessageService {
    public Message save(Message entity);

    public Message update(Message entity);

    public List<Message> selectAll();

    public List<Message> selectAll(String sortField, String sort);

    public Message getById(Long id);

    public void remove(Long id);

    public Message findOne(String paramName, Object paramValue);

    public Message findOne(String[] paramNames, Object[] paramValues);

    public int findCountBy(String paramName, String paramValue);

    
}
