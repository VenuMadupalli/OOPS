package Day06.Interfaces.Extends02;

public interface A {
    void fun();
    void initial();
    default void greet() {
        System.out.println("Hello from interface A!");
    }

    static void playMusic() {
        System.out.println("Playing music from interface A...");
    }
}
