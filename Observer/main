package Observer;

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
    }
}