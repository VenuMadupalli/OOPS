//package Day05.Encapsulation;

class Student {
    // Private data member
    private String name;
    private int age;

    // Public getter
    public String getName() {
        return name;
    }

    // Public setter
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        // Validation
        if (age > 0)
            this.age = age;
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Venu");
        s.setAge(21);
        System.out.println("Name: " + s.getName()); // Output: Venu
        System.out.println("Age: " + s.getAge());   // Output: 21
    }
}
