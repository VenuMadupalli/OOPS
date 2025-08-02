//package Day2.Static;

public class Main {
    public static void main(String[] args) {
        // Human venu= new Human("venu",20, false);
        // Human upi = new Human("upi",20, true);

        // System.out.println(Human.population + " humans created so far.");
        
        greetStatic();
        Main obj= new Main();
        obj.greet();
    }

    public void greet() {
        System.out.println("Non-static method called!");
        greetStatic();
        car();
    }

    public void car(){
        System.out.println("Car method called!");
    }

    public static void greetStatic() {
        System.out.println("Hello from static method!");
    }
}
