package Bridge;

public abstract class Employee {
    Payment pay1;
    Payment pay2;

    protected Employee(Payment pay1, Payment pay2)
    {
        this.pay1 = pay1;
        this.pay2 = pay2;
    }

    abstract public void payUp();

}
