package Visitor;
import Composite.Fruit;
import Composite.FruitBundle;
import Composite.FruitInf;

import java.util.List;

public class DiscountVisitor implements Visitor {
    private double discountUnitPrice;

    public void onFruitBundle(FruitBundle frbun){
        List<FruitInf> fruits = frbun.getFruits();
       for (FruitInf fruit : fruits){
           fruit.accept(this);
       }
    }

    public void onFruit(Fruit fr){
        fr.setUnitPrice(fr.getUnitPrice() * .8);
    }

}
