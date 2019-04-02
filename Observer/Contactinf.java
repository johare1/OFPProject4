package Observer;
import Observer.ConcretePreviousNames;

public interface Contactinf {

    public void addObserver(ConcretePreviousNames observer);

    public void removeObserver(ConcretePreviousNames observer);

    public void setNewName(String name);
}
