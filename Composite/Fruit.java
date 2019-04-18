package Composite;

import java.util.ArrayList;
import java.util.List;

public class Fruit implements FruitInf{
    private String Name;
    private double unitPrice;

    // constructor
    public Fruit(String name,int unitPrice) {
        this.Name = name;
        this.unitPrice = unitPrice;
    }

    public String getName(){
        return this.Name;
    }

    public double getUnitPrice(){
        return this.unitPrice;
    }

}