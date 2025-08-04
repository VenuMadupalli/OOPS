// multiple inheritance using interfaces

interface A {
    void show();
}

interface B {
    void display();
}

class C implements A, B {
    public void show() {
        System.out.println("Showing A");
    }

    public void display() {
        System.out.println("Displaying B");
    }
}

public class Multiple {
    public static void main(String[] args) {
        C obj = new C();
        obj.show();
        obj.display();
    }
}

