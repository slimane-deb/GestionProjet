/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java.service;

import java.model.Notification;
import java.util.List;

public interface INotificationService {
    public Notification save(Notification entity);

    public Notification update(Notification entity);

    public List<Notification> selectAll();

    public List<Notification> selectAll(String sortField, String sort);

    public Notification getById(Long id);

    public void remove(Long id);

    public Notification findOne(String paramName, Object paramValue);

    public Notification findOne(String[] paramNames, Object[] paramValues);

    public int findCountBy(String paramName, String paramValue);

  
}
