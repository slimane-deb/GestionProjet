/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java.service;

import java.model.Directeur;
import java.util.List;


public interface IDirecteurService {
   public Directeur save(Directeur entity);

    public Directeur update(Directeur entity);

    public List<Directeur> selectAll();

    public List<Directeur> selectAll(String sortField, String sort);

    public Directeur getById(Long id);

    public void remove(Long id);

    public Directeur findOne(String paramName, Object paramValue);

    public Directeur findOne(String[] paramNames, Object[] paramValues);

    public int findCountBy(String paramName, String paramValue);
  
}
