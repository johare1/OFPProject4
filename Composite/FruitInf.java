package Composite;

import Visitor.Visitor;

public interface FruitInf {
    public String getName();

    public double getUnitPrice();

    public void setUnitPrice(double price);

    public void accept(Visitor visitor);
}
