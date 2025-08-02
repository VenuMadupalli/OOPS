package Day05.Abstarction;

abstract class Vehicle {
    // Abstract method (no implementation)
    abstract void start();
    abstract void area();


    // Concrete method
    void fuel() {
        System.out.println("Filling fuel...");
    }
}

class Car extends Vehicle {
    // Providing implementation for abstract method
    void start() {
        System.out.println("Car is starting with key...");
    }

    private int r;
        public void setRadious(int r) {
            this.r = r;
        }   

    void area() {
        
        System.out.println("area: "+ 3.14*r*r);
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle myCar = new Car();  // Upcasting
        myCar.start();              // Output: Car is starting with key...
        myCar.fuel();               // Output: Filling fuel...

        Car car = new Car();
        car.setRadious(5);
        car.area();                 // Output: area: 78.5
    }
}
