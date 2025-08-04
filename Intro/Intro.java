public class Intro {
    // This is a simple Java class named Intro
    public static void main(String[] args) {
        //Student s1 = new Student();
        // s1.rollNo = 101;
        // s1.name = "Alice"; 
        Student s1 = new Student(78, "Bob", 85.5f);
        System.out.println(s1.rollNo);
        System.out.println(s1.name);
        System.out.println(s1.marks);
        //s1.changeName("Alice");
        s1.greet();    

        final int x = 10; // final variable, cannot be changed
        System.out.println(x);
        
        
        System.out.println();
        Student s2 = new Student(50, "venu", 95.5f);
        System.out.println(s2.rollNo);
        System.out.println(s2.name);
        System.out.println(s2.marks);
        //s1.changeName("Alice");
        s2.greet();   

        System.out.println();
        Student s3 = new Student(s1); // Copy constructor
        System.out.println(s3.name);
    }
}
class Student{
    int rollNo;
    String name;
    float marks;

    void greet() {
        System.out.println("Hello, " + this.name); // this keyword refers to the current instance
    }

    void changeName(String newName) {
        this.name = newName; // this keyword is used to refer to the instance variable
    }

    Student (Student other){
        this.rollNo = other.rollNo;
        this.name = other.name;
        this.marks = other.marks;
    }

    // Constructor overloading    // Default constructor
    // This constructor initializes the object with default values
    Student(){
        this.rollNo = 99;
        this.name = "John Doe";
        this.marks = 0.0f;
    }

    Student(int rollNo, String name, float marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }
}