package Composite;

import Visitor.Visitor;
import Visitor.Element;

import java.util.ArrayList;
import java.util.List;

public class Fruit implements FruitInf, Element {
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

    public void setUnitPrice(double price) {
        this.unitPrice = price;
    }

    public void accept(Visitor visitor){
        visitor.onFruit(this);
    }

}