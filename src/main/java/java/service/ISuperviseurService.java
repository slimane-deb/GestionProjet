/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java.service;

import java.model.Superviseur;
import java.util.List;


public interface ISuperviseurService {
 public Superviseur save(Superviseur entity);

    public Superviseur update(Superviseur entity);

    public List<Superviseur> selectAll();

    public List<Superviseur> selectAll(String sortField, String sort);

    public Superviseur getById(Long id);

    public void remove(Long id);

    public Superviseur findOne(String paramName, Object paramValue);

    public Superviseur findOne(String[] paramNames, Object[] paramValues);

    public int findCountBy(String paramName, String paramValue);    
}
