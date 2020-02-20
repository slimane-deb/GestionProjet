/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java.service;

import java.model.Formation;
import java.util.List;


public interface IFormationService {
 public Formation save(Formation entity);

    public Formation update(Formation entity);

    public List<Formation> selectAll();

    public List<Formation> selectAll(String sortField, String sort);

    public Formation getById(Long id);

    public void remove(Long id);

    public Formation findOne(String paramName, Object paramValue);

    public Formation findOne(String[] paramNames, Object[] paramValues);

    public int findCountBy(String paramName, String paramValue);
   
}
