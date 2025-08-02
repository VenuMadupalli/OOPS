class Animal {
    void eat() {
        System.out.println("Animal eats food.");
    }
}
class dog extends Animal {
    void bark() {
        System.out.println("Dog barks.");
    }
}
class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows.");
    }
}
public class Hierarchical {
    public static void main(String[] args) {
        dog d = new dog();
        d.eat();  // from Animal
        d.bark(); // own method

        Cat c = new Cat();
        c.eat();  // from Animal
        c.meow(); // own method
    }
}