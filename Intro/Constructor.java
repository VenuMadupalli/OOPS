// class Car {
//     String color;
//     int speed;
//     // Default constructor (added automatically if not defined)
//     Car() {
//         color = "Black";
//         speed = 0;
//     }
//     Car(String color, int speed) {
//         this.color = color;
//         this.speed = speed;
//     }
//     void display() {
//         System.out.println("Color: " + color + ", Speed: " + speed + " km/h");
//     }
// }

// public class Constructor {
//     public static void main(String[] args) {
//         Car car1 = new Car();  // Calls default constructor
//         car1.color = "white"; // Setting color
//         car1.display();        // Output: Color: Black, Speed: 0 km/h

//         Car car2 = new Car("Red", 120); // Calls parameterized constructor
//         car2.display();        // Output: Color: Red, Speed: 120 km/h
//     }
// }




class Car {
    String color;
    int speed;

    // Parameterized constructor
    Car(String color, int speed) {
        this.color = color;      // "this" refers to the current object
        this.speed = speed;
    }

    void display() {
        System.out.println("Color: " + color + ", Speed: " + speed + " km/h");
    }
}

public class Constructor {
    public static void main(String[] args) {
        Car car1 = new Car("Red", 120);
        Car car2 = new Car("Blue", 100);

        car1.display();  // Output: Color: Red, Speed: 120 km/h
        car2.display();  // Output: Color: Blue, Speed: 100 km/h
    }
}
