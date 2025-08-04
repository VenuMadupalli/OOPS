package Day06.Interfaces;

public class CDPlayer implements Media {
    @Override
    public void start() {
        System.out.println("CD Player started");
    }

    @Override
    public void stop() {
        System.out.println("CD Player stopped");
    }

    // Additional methods specific to CDPlayer can be added here
    
}
