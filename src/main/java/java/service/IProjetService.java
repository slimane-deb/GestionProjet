/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java.service;


import java.model.Projet;
import java.util.List;

/**
 *
 * @author selma
 */
public interface IProjetService {

    public Projet save(Projet entity);

    public Projet update(Projet entity);

    public List<Projet> selectAll();

    public List<Projet> selectAll(String sortField, String sort);

    public Projet getById(Long id);

    public void remove(Long id);

    public Projet findOne(String paramName, Object paramValue);

    public Projet findOne(String[] paramNames, Object[] paramValues);

    public int findCountBy(String paramName, String paramValue);

}
