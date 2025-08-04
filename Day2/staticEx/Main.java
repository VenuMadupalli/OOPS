package Day2.staticEx;

public class Main {
    public static void main(String[] args) {
        Human venu = new Human("venu",20, "yes"); // Creating an object of Human class
        Human upi = new Human("upi",20, "yes"); 
        System.out.println(venu.name + " is " + venu.age + " years old");
    }
}