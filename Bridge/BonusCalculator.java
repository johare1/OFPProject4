package Bridge;

public class BonusCalculator implements Payment {
    @Override
    public void findAmount()
    {
        System.out.print(" with a bonus of 230$\n");
    }
}
