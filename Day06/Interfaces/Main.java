package Day06.Interfaces;

public class Main {
    public static void main(String[] args) {
        // Car car = new Car();
        // car.start();
        // car.accelerate();
        // car.stop();

        // Media media = new Car(); // Car implements Media
        // media.start();
        // media.stop();

        // Engine engine = new Car(); // Car implements Engine
        // engine.start();

        NiceCar niceCar = new NiceCar();
        niceCar.start();

        niceCar.startMedia();

        niceCar.upgradeEngine(new ElectricEngine());
        niceCar.start();

        // niceCar.upgradeEngine(new PowerEngine());
        // niceCar.start();

    }
}
