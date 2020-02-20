/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java.service;

import java.model.Chefprojet;
import java.util.List;

public interface IChefprojetService {
    public Chefprojet save(Chefprojet entity);

    public Chefprojet update(Chefprojet entity);

    public List<Chefprojet> selectAll();

    public List<Chefprojet> selectAll(String sortField, String sort);

    public Chefprojet getById(Long id);

    public void remove(Long id);

    public Chefprojet findOne(String paramName, Object paramValue);

    public Chefprojet findOne(String[] paramNames, Object[] paramValues);

    public int findCountBy(String paramName, String paramValue);

    
}
