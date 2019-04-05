package Bridge;

public class Salaried extends Employee {
    public Salaried(Payment pay1, Payment pay2)
    {
        super(pay1,pay2);
    }

    @Override
    public void payUp()
    {
        System.out.print("Salaried Employee gets paid: ");
        pay1.findAmount();
        pay2.findAmount();
    }
}
