package Single;

public class Singleton {
    private Singleton() {
        // private constructor to prevent instantiation
    }
    private static Singleton instance;
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

}
