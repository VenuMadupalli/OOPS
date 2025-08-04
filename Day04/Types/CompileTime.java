//package Day04.Types;

//Method overloading example with constructors

public class CompileTime {

    public CompileTime() {
        System.out.println("default constructor of CompileTime class");
    }
    public CompileTime(int a) {
        System.out.println("Parameterized constructor of CompileTime class with value: " + a);
    }
    public CompileTime(String str) {
        System.out.println("Parameterized constructor of CompileTime class with string: " + str);
    }
    public static void main(String[] args) {
        CompileTime obj1 = new CompileTime();
        CompileTime obj2 = new CompileTime(10);
        CompileTime obj3 = new CompileTime("Hello");
        System.out.println("CompileTime class demonstration completed.");
    }
}
