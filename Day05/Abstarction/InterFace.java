//package Day05.Abstarction;

interface Animal {
    void sound();  // Interface method
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class InterFace {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.sound();  // Output: Dog barks
    }
}

