package Day06.Access;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        vehicle.start();
        vehicle.seata();

        Car car = new Car();
        car.start();
        car.seata();

        Vehicle vehicle2 = new Vehicle();
        vehicle2.start();
        vehicle2.seata();

    }
}
