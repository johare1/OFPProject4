package Composite;

import Visitor.*;

public class main {
    public static void main(String[] args){
        Fruit apple = new Fruit("apple",2);
        Fruit banana = new Fruit("banana",3);
        Fruit pineapple = new Fruit("pineapple",6);
        Fruit orange = new Fruit("orange",2);
        Fruit kiwi = new Fruit("kiwi",5);

        FruitBundle bun1 = new FruitBundle("bundle1");
        bun1.add(apple);
        bun1.add(banana);
        bun1.add(pineapple);

        FruitBundle bun2 = new FruitBundle("bundle2");
        bun2.add(bun1);
        bun2.add(orange);
        bun2.add(kiwi);

        System.out.println("This should be 11: " + bun1.getName() + "'s price: " + bun1.getUnitPrice());
        System.out.println("This should be 18: " + bun2.getName() + "'s price: " + bun2.getUnitPrice());
        System.out.println();

        DiscountVisitor discount = new DiscountVisitor();
        bun2.accept(discount);
        System.out.println("Discount of 20% applied!");
        System.out.println();

        System.out.println("After discount bundle2's price is: " + bun2.getUnitPrice() + " it should be 14.4");
    }
}
