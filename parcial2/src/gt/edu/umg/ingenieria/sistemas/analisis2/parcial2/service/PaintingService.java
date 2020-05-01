package gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.service;

import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.dao.EmployeeDao;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.dao.IEmployeeDao;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.dao.IInventoryDao;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.dao.IVehicleDao;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.dao.InventoryDao;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.dao.VehicleDao;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.entity.AssistantEntity;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.entity.MechanicEntity;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.entity.ProductEntity;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.entity.SparePartEntity;
import java.util.*;

public class PaintingService implements IPaintingService {

    public PaintingService() {
    }

    @Override
    public SparePartEntity setPaint(String colors) {
        System.out.println("Se realizara un retoque de pintura color "+colors);
        IEmployeeDao mts= new EmployeeDao();
        AssistantEntity mts2 = mts.findAsistent("Disponible");
        System.out.println("Sera el encargado de pintar su vehiculo");
        MechanicEntity mts1 = mts.findMechanic("Dispuesto");
        System.out.println(" de enderezar la abolladura");
       return null;
    }

}