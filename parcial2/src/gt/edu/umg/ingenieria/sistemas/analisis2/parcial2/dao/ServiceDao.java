package gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.dao;

import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.entity.ProductEntity;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.entity.ServiceOrderEntity;
import java.util.*;

public class ServiceDao implements IServiceDao {

    public ServiceDao() {
    }
    
    /**
     *
     * @param order
     */
    @Override
    public void guardarOrden(ServiceOrderEntity order) {
        System.out.println("Guardando la orden " + order.getDate() + " para el vehiculo " + order.getVehicle().getLicenseNumber());
    }

}