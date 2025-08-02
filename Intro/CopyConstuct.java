class Car {
    String color;
    int speed;

    Car(String color, int speed) {
        this.color = color;
        this.speed = speed;
    }

    // Copy constructor
    Car(Car obj) {
        this.color = obj.color;
        this.speed = obj.speed;
    }
}
public class CopyConstuct {
    public static void main(String[] args) {
        Car car1 = new Car("Green", 150); // Original object
        Car car2 = new Car(car1);          // Copy constructor creates a copy

        // Display properties of both cars
        System.out.println("Car 1 - Color: " + car1.color + ", Speed: " + car1.speed + " km/h");
        System.out.println("Car 2 - Color: " + car2.color + ", Speed: " + car2.speed + " km/h");

        Integer a= 5;
        System.out.println(a);
        //int b=5;
        Integer b= 100;
        int c=b;
        System.out.println(c);
    }

}
