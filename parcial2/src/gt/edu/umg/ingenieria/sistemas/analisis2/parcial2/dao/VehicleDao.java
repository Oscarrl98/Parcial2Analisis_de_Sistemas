package gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.dao;

import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.entity.VehicleEntity;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.entity.VehicleOwnerEntity;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.entity.VehicleServiceHistoryEntryEntity;
import java.util.*;

public class VehicleDao implements IVehicleDao {

    public VehicleDao() {
    }

    @Override
    public VehicleEntity findVehicleByLicenseNumber(String licenseNumber) {
        System.out.println("Se ha encontrado el vehiculo " + licenseNumber);
        
        VehicleOwnerEntity owner = new VehicleOwnerEntity();
        owner.setFullName("Oscar Raul");
        owner.setDpi("4557898789878");
        System.out.println("A nombre de " + owner.getFullName());
        Set<VehicleServiceHistoryEntryEntity> serviceHistory = new HashSet<>();
                
        VehicleEntity veh = new VehicleEntity();
        veh.setBrand("Nisan");
        veh.setModel(2011);
        veh.setColor("Black");
        veh.setLicenseNumber(licenseNumber);
        
        veh.setOwner(owner);
        veh.setServiceHistory(serviceHistory);
        
        return veh;        
    }

}