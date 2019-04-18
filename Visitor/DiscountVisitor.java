package Visitor;
import Composite.FruitBundle;

public class DiscountVisitor implements Visitor {
    private double discountUnitPrice;


    public void visit(FruitBundle fruitBundle){

        //discountUnitPrice = (fruitBundle.getUnitPrice() * .2);

    }


    public double getDiscountPrice(){

        return discountUnitPrice;
    }
}
