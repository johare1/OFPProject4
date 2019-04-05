package Observer;
import java.util.ArrayList;

public class ConcretePreviousNames implements PreviousNames{

    ArrayList<String> nameList = new ArrayList<String>();

    public ConcretePreviousNames(){ }

    public void update(String name){
        nameList.add(name);
    }


}
