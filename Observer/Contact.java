package Observer;
import java.util.ArrayList;

class Contact implements Contactinf{

    String contactName;
    ArrayList<ConcretePreviousNames> observers = new ArrayList<>();

    public Contact(){}

    public void addObserver(ConcretePreviousNames observer) {
        this.observers.add(observer);
    }

    public void removeObserver(ConcretePreviousNames observer) {
        this.observers.remove(observer);
    }

    public void setNewName(String name) {
        this.contactName = name;
        for (ConcretePreviousNames observer : this.observers) {
            observer.update(this.contactName);
        }
    }

}