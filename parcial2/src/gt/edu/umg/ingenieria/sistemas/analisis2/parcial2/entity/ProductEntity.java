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
    private String color;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}