/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java.service;

import java.model.Administrateur;
import java.util.List;


public interface IAdministrateurService {
    public Administrateur save(Administrateur entity);

    public Administrateur update(Administrateur entity);

    public List<Administrateur> selectAll();

    public List<Administrateur> selectAll(String sortField, String sort);

    public Administrateur getById(Long id);

    public void remove(Long id);

    public Administrateur findOne(String paramName, Object paramValue);

    public Administrateur findOne(String[] paramNames, Object[] paramValues);

    public int findCountBy(String paramName, String paramValue);

    
}
