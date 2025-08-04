package Day06.Access;

import Day06.Access2.parent;

public class child extends parent {
    String name;
    
    public child(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Display method in child class: "+ name);
    }

    public static void main(String[] args) {
        child c = new child("Child Instance");
        c.display();

        parent p = new parent();
        p.start();

        System.out.println("Child class main method executed.");
    }
}
