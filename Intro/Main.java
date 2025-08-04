class Car {
    String color;
    void drive() {
        System.out.println("Vroom!");
        System.out.println("The car is " + color);
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();       // 👈 This is the object
        myCar.color = "Red";         // Setting its state
        myCar.drive();               // Invoking its behavior
    }
}
