package gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.service;

import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.dao.EmployeeDao;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.dao.IEmployeeDao;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.dao.IInventoryDao;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.dao.IServiceDao;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.dao.InventoryDao;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.dao.ServiceDao;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.entity.AssistantEntity;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.entity.MechanicEntity;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.entity.ProductEntity;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.entity.VehicleEntity;
import java.util.*;

public class CustomsService implements ICustomsService {

    public CustomsService() {
    }
    @Override
    public ProductEntity installAlarm(String brand) {
        System.out.println("Instalar alarma para carro marca "+ brand); 
        IInventoryDao acces= new InventoryDao();
        ProductEntity stocke = acces.getStock(brand);
        System.out.println("Se ha encontrado alarmas para vehiculos" + stocke.getName()+" con disponibilidad de " + stocke.getStock()+" existencias" );
        IEmployeeDao asi= new EmployeeDao();
        AssistantEntity asi2 = asi.findAsistent("Disponible");
        System.out.println("y ejecutara la instalacion de su alarma");
        return stocke;
    }

    @Override
    public ProductEntity polarizedWindow(String color) {
        IEmployeeDao meca1=new EmployeeDao();
        System.out.println("Polarizar vidrios al vehiculo color "+color);
        IInventoryDao acces = new InventoryDao();
        ProductEntity stockv=acces.getStock(color);
        System.out.println("Se han encontrado poliester "+stockv.getName()+ "con disponibilidad de " + stockv.getStock() );
        MechanicEntity meca2=meca1.findMechanic("Disponible");
                System.out.println("y polarizara sus vidrios");
        return stockv;
        
    }
    
    

}