package gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.dao;

import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.entity.ProductEntity;
import java.util.*;

public class InventoryDao implements IInventoryDao {

    public InventoryDao() {
    }

    
   
    @Override
    public ProductEntity getStock(String name) {
          System.out.println("Verificando la disponibilidad en stock ...");
        ProductEntity product = new ProductEntity();
        product.setName(name);
        Random random = new Random();
        int r= random.nextInt((10-1)+1)+1;
        product.setStock(r);
        return product;
    }
    
    @Override
    public int getStockall(String name) {
          System.out.println("Verificando la disponibilidad en stock ...");
        ProductEntity product = new ProductEntity();
        product.setName(name);
        Random random = new Random();
        int r= random.nextInt((10-1)+1)+1;
        product.setStock(r);
        return r;}
}