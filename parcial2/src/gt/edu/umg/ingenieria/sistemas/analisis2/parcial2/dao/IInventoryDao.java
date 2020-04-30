package gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.dao;

import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.entity.ProductEntity;
import java.util.*;

public interface IInventoryDao { 
    public ProductEntity getStock(String name);
    public int getStockall(String name);

}