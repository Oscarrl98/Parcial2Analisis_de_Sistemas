package gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.dao;

import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.entity.AssistantEntity;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.entity.MechanicEntity;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.entity.TechnicianEntity;
import java.util.*;

public class EmployeeDao implements IEmployeeDao {

    public EmployeeDao() {
    }

    @Override
    public AssistantEntity findAsistent(String name) {
        AssistantEntity asi= new AssistantEntity();
        asi.setName("Alfredo");
        System.out.println("El asistente "+asi.getName()+" Esta disponible y");
        
        return asi;
    }

    @Override
    public MechanicEntity findMechanic(String name) {
        MechanicEntity meca=new MechanicEntity();
        meca.setName("Oblack");
        System.out.println("El mecanico "+meca.getName()+" Sera el encargado");
        return meca;
    }

    @Override
    public TechnicianEntity findTechnicianEntity(String name) {
        TechnicianEntity tecnic= new TechnicianEntity();
        tecnic.setName("Messi");
        System.out.println("El tecnico "+tecnic.getName()+" Se encargara");
        return tecnic;
    }
    
    
}