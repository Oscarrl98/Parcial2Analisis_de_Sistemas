package gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.service;

import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.dao.EmployeeDao;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.dao.IEmployeeDao;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.entity.AssistantEntity;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.entity.ProductEntity;
import java.util.*;

public class CarCleaningService implements ICarCleaningService {

    public CarCleaningService() {
    }

    @Override
    public ProductEntity cleanAndPolished(String Brand) {
        System.out.println("Verificando disponibilidad de asistentes ");
        IEmployeeDao asis = new EmployeeDao();
           AssistantEntity asis2 = asis.findAsistent("Listo");
           System.out.println("y sera " +asis2.getName()+" quien limpie y pula su vehiculo");
                return null;
    }

}