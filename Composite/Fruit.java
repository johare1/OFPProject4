package Composite;

import java.util.ArrayList;
import java.util.List;

public class Fruit implements FruitInf{
    private String Name;
    private int unitPrice;

    // constructor
    public Fruit(String name,int unitPrice) {
        this.Name = name;
        this.unitPrice = unitPrice;
    }

    public String getName(){
        return this.Name;
    }

    public int getUnitPrice(){
        return this.unitPrice;
    }

}