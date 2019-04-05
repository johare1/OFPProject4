package Observer;

import Bridge.*;

class main{
    public static void main(String [] args){
        ConcretePreviousNames observer = new ConcretePreviousNames();
        Contact subject = new Contact();

        subject.addObserver(observer);
        subject.setNewName("Jack");
        System.out.println(observer.nameList);
        System.out.println();

        subject.removeObserver(observer);
        subject.setNewName("Quinn");
        System.out.println(observer.nameList);
        System.out.println();

        subject.addObserver(observer);
        subject.setNewName("Owen");
        System.out.println(observer.nameList);
        System.out.println();

        Employee emp1 = new Hourly(new PaymentCalculator(), new BonusCalculator());
        emp1.payUp();

        Employee emp2 = new Salaried(new PaymentCalculator(), new BonusCalculator());
        emp2.payUp();

    }
}