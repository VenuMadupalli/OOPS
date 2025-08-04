//package Day3Inheritance;
class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("Dog barks");
    }
}


public class Sigle {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
        dog.bark();
    }
}

