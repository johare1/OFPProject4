package Composite;

import java.util.ArrayList;
import java.util.List;


public class FruitBundle implements FruitInf{

    private String Name;
    private double unitPrice;
    private List<FruitInf> fruitList = new ArrayList<FruitInf>();

    // constructor
    public FruitBundle(String name) {
        this.Name = name;
    }

    public void add(FruitInf f) {
        fruitList.add(f);
    }

    public void remove(FruitInf f) {
        fruitList.remove(f);
    }

    public List<FruitInf> getFruits(){
        return fruitList;
    }

    public String getName(){
        return this.Name;
    }

    public double getUnitPrice(){
        this.unitPrice = 0;
        for (FruitInf fr : fruitList){
            this.unitPrice = this.unitPrice + fr.getUnitPrice();
        }
        return this.unitPrice;
    }

}
