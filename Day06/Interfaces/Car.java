package Day06.Interfaces;

public class Car implements Engine, Media, Break {
    @Override
    public void start() {
        System.out.println("Car engine started");
    }

    @Override
    public void stop() {
        System.out.println("Car engine stopped");
    }


    @Override
    public void accelerate() {
        System.out.println("Car accelerating");
    }
    
    

    public static void main(String[] args) {
        
    }
}