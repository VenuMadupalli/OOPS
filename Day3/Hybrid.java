interface A {
    void showA();
}

interface B {
    void showB();
}

interface C extends A, B {
    void showC();
}

class D implements C {
    public void showA() {
        System.out.println("Showing A");
    }

    public void showB() {
        System.out.println("Showing B");
    }

    public void showC() {
        System.out.println("Showing C");
    }
}

public class Hybrid {
    public static void main(String[] args) {
        D obj = new D();
        
        obj.showA();
        obj.showB();
        obj.showC();
    }
}

