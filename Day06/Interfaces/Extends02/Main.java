package Day06.Interfaces.Extends02;

public class Main implements A, B {

    @Override
    public void game() {
        System.out.println("Game started!");
    }

    @Override
    public void initial() {
        System.out.println("Initial setup done.");
    }

    @Override
    public void fun() {
        System.out.println("Fun method executed.");
    }

    public static void main(String[] args) {
        Main obj = new Main();

        obj.game();         // ✅ Game started!
        obj.fun();          // ✅ Fun method executed.
        A.playMusic();  
        
        obj.greet();// ✅ Playing music from interface A...
    }
}
