package gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.service;

import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.dao.IInventoryDao;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.dao.InventoryDao;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.entity.ProductEntity;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.entity.SparePartEntity;
import java.util.*;

public class AutoDeliveryService implements IAutoDeliveryService {

    public AutoDeliveryService() {
    }

    @Override
    public SparePartEntity buyRudder(String names) {
        SparePartEntity pice = new SparePartEntity();
       System.out.println("Un cliente con vehiculo marca "+names+" Solicita volantes");
       IInventoryDao stockvol = new InventoryDao();
       System.out.println("Se han encontrado "+stockvol.getStockall(names)+"volantes en bodega ");
       System.out.println("El cliente ha verificado su compra");
      
       return null;
    }
    
}