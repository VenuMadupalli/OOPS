package Day06.Interfaces;

public class NiceCar {
    private Engine engine;
    private Media media= new CDPlayer();

    public NiceCar() {
        this.engine = new PowerEngine();
    }

    public NiceCar(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        engine.start();
    }
    public void stop() {
        engine.stop();
    }
    public void accelerate() {
        engine.accelerate();
    }

    public void startMedia() {
        media.start();
    }
    public void stopMedia() {
        media.stop();
    }

    public void upgradeEngine(Engine newEngine) {
        this.engine = newEngine;
    }
    
}
