package gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.entity;

import java.util.*;

/**
 * 
 */
public class ProductEntity {

    /**
     * Default constructor
     */
    public ProductEntity() {
    }
    private int stock;
    private String name;
    private String type;

    public void setStock(int stock) {
        this.stock=stock;
    }

    public int getStock() {
        
        return stock;
    }

    public void setName(String name) {
        this.name=name;
    }

    /**
     * @return
     */
    public String getName() {
        
        return name;
    }

}