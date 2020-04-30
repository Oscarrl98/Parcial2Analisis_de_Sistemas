package gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.service;

import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.dao.IInventoryDao;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.dao.IServiceDao;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.dao.InventoryDao;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.dao.ServiceDao;
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
        System.out.println("Se ha encontrado alarmas para" + stocke.getName()+"con disponibilidad de " + stocke.getStock() );
        return stocke;
    }

}