package Day08.Cloning;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        
        Human venu= new Human("venu", 20);
        //Human upi= new Human(venu);

        Human venky= (Human) venu.clone();
        System.out.println(venky.name+": "+ venky.age);
    }
}
