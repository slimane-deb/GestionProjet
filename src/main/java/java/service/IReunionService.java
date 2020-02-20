/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java.service;
import java.model.Reunion;
import java.util.List;
        

public interface IReunionService {
   public Reunion save(Reunion entity);

    public Reunion update(Reunion entity);

    public List<Reunion> selectAll();

    public List<Reunion> selectAll(String sortField, String sort);

    public Reunion getById(Long id);

    public void remove(Long id);

    public Reunion findOne(String paramName, Object paramValue);

    public Reunion findOne(String[] paramNames, Object[] paramValues);

    public int findCountBy(String paramName, String paramValue);  
}
