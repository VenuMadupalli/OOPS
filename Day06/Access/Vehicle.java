package Day06.Access;

public class Vehicle {
    Vehicle() {
        System.out.println("Vehicle constructor called.");
    }
    public void start() {
        System.out.println("Vehicle started.");
    }

    protected void seata(){
        System.out.println("Seat adjustment in Vehicle.");
    }
}
