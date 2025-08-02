package Day2.Static;

public class Human {
    String name;
    int age;
    boolean isMarried;
    static int population = 0;
    Human(String name, int age, boolean isMarried) {
        this.name = name;
        this.age = age;
        this.isMarried = isMarried;
        Human.population += 1;
    }
    
}
