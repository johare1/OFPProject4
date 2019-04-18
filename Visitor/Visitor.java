package Visitor;
import Composite.Fruit;
import Composite.FruitBundle;

public interface Visitor {

    public void onFruitBundle(FruitBundle frbun);

    public void onFruit(Fruit fr);

}
