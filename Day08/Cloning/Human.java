//package Day08.Cloning;

import java.util.Arrays;

public class Human implements Cloneable {
    int age;
    String name;
    int arr[];

    public Human(String name, int age){
        this.age= age;
        this.name= name;
        this.arr= new int[] {6,3,52,1,9,2};
    }

    // public Human(Human other){
    //     this.name= other.name;
    //     this.age= other.age;
    // }
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


    public static void main(String[] args) throws CloneNotSupportedException {
        Human venu= new Human("venu", 20);
        Human venky=(Human) venu.clone();
        System.out.println(venky.name+": "+ venky.age);
        System.out.println(Arrays.toString(venky.arr));
    }
}
