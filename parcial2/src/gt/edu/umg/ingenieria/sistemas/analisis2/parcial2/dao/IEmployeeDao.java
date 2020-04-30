package gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.dao;

import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.entity.AssistantEntity;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.entity.MechanicEntity;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.entity.TechnicianEntity;
import java.util.*;

/**
 * 
 */
public interface IEmployeeDao {

    /**
     * @param Name 
     * @return
     */
    public AssistantEntity findAsistent(String Name);
    public MechanicEntity findMechanic(String name);
    public TechnicianEntity findTechnicianEntity(String name);

}