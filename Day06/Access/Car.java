package Day06.Access;

public class Car extends Vehicle{
        // Creating an instance of the parent class
        public Car() {
        }
        public void start() {
            // Vehicle vehicle = new Vehicle();
            // vehicle.start();
            System.out.println("Car started.");
        }

        public void seata() {
            super.seata();
            System.out.println("Seat adjustment in Car.");
        }
        
}
