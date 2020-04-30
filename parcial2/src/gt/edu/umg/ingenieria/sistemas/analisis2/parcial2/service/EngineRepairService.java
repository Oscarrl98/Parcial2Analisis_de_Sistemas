package gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.service;

import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.dao.EmployeeDao;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.dao.IEmployeeDao;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.dao.IInventoryDao;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.dao.InventoryDao;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.entity.MechanicEntity;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.entity.ProductEntity;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.entity.ServiceOrderEntity;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.entity.TechnicianEntity;
import java.util.*;

public class EngineRepairService implements IEngineRepairService {

    public EngineRepairService() {
    }

    @Override
    public void changeOil(ServiceOrderEntity order) {
        
      System.out.println("Se cambiara el aceite del motor al vehiculo con placa "+order.getVehicle().getLicenseNumber());
      IInventoryDao stockoil= new InventoryDao();
      ProductEntity stockoil2 = stockoil.getStock(order.getVehicle().getBrand());
      System.out.println("Existen en stock "+stockoil2.getStock()+ "galones de aceite");
      IEmployeeDao tecnic1 = new EmployeeDao();
        TechnicianEntity tecnic2=tecnic1.findTechnicianEntity("Disponible");
                System.out.println("en el cambio de aceite");
                
      
      
      
    }

}