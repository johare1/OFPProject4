package Bridge;

public class Hourly extends Employee {
    public Hourly(Payment pay1, Payment pay2)
    {
        super(pay1,pay2);
    }

    @Override
    public void payUp()
    {
        System.out.print("Hourly Employee gets paid: ");
        pay1.findAmount();
        pay2.findAmount();
    }
}
