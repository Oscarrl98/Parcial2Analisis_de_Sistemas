package gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.entity;

import java.util.*;

/**
 * 
 */
public abstract class AbstractPerson {

    /**
     * Default constructor
     */
    public AbstractPerson() {
    }

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}