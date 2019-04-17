package Composite;

import java.util.ArrayList;
import java.util.List;

public class Fruit {
    private String fruitType;
    private int unitPrice;
    private List<Fruit> fruitList;

    // constructor
    public Fruit(String fruitType,int unitPrice) {
        this.fruitType = fruitType;
        this.unitPrice = unitPrice;
        fruitList = new ArrayList<Fruit>();
    }

    public void add(Fruit f) {
        fruitList.add(f);
    }

    public void remove(Fruit f) {
        fruitList.remove(f);
    }

    public List<Fruit> getFruit(){
        return fruitList;
    }

}