//package Day06.Interfaces.Nested;

public class A {

    // Nested Interface inside class A
    public interface NestedInterface {
        boolean isEven(int num);
    }

    // Class B implements the nested interface
    static class B implements A.NestedInterface {
        @Override
        public boolean isEven(int num) {
            return num % 2 == 0;
        }
    }
    // Main method to test
    public static void main(String[] args) {
        B obj = new B();
        System.out.println("Is 7 even? " + obj.isEven(7)); // false
        System.out.println("Is 10 even? " + obj.isEven(10)); // true
    }
}

