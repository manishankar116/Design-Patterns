//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Singleton obj1 =  Singleton.getInstance();
        Singleton obj2 =  Singleton.getInstance();

        System.out.println(obj1); //Singleton@1b28cdfa
        System.out.println(obj2); //Singleton@1b28cdfa

        System.out.println(obj1 == obj2); //true

        //Constructor called only once
        //Both references point to same object
    }
}

class Singleton{
    private static Singleton instance;

    private Singleton() {
        System.out.println("Singleton obj is created");
    }

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}