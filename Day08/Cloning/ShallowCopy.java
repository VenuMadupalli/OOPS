//package Day08.Cloning;
// import java.util.*;
// public class ShallowCopy implements Cloneable {
//     int age;
//     String name;
//     int arr[];

//     public ShallowCopy(String name, int age){
//         this.age= age;
//         this.name= name;
//         this.arr= new int[] {6,3,52,1,9,2};
//     }

//     // public Human(Human other){
//     //     this.name= other.name;
//     //     this.age= other.age;
//     // }
//     public Object clone() throws CloneNotSupportedException {
        
//         return super.clone();
//     }


//     public static void main(String[] args) throws CloneNotSupportedException {
//         Human venu= new Human("venu", 20);
//         Human venky=(Human) venu.clone();
//         System.out.println(venky.name+": "+ venky.age);
//         System.out.println(Arrays.toString(venky.arr));
//         venky.arr[0]= 23;
//         //shallow copy
//         System.out.println(Arrays.toString(venu.arr));
//     }
// }


import java.util.Arrays;

public class ShallowCopy implements Cloneable {
    int age;
    String name;
    int[] arr;

    public ShallowCopy(String name, int age) {
        this.age = age;
        this.name = name;
        this.arr = new int[]{6, 3, 52, 1, 9, 2};
    }

    // Shallow copy using clone
    public Object clone() throws CloneNotSupportedException {
        return super.clone(); // default shallow copy
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        ShallowCopy venu = new ShallowCopy("venu", 20);
        ShallowCopy venky = (ShallowCopy) venu.clone(); // shallow copy

        System.out.println(venky.name + ": " + venky.age);
        System.out.println("Venky arr: " + Arrays.toString(venky.arr));

        // Modifying venky's array
        venky.arr[0] = 23;

        // This proves it's a shallow copy - changes reflect in original
        System.out.println("Venu arr after modifying venky: " + Arrays.toString(venu.arr));
    }
}



//package Day08.Cloning;

// import java.util.Arrays;

// public class DeepCopy {
//     String name;
//     int age;
//     int arr[];
//     DeepCopy(String name, int age){
//         this.name= name;
//         this.age= age;
//         this.arr= new int[]{46,3,1,5,89,6};

//     }
//     DeepCopy(DeepCopy other){
//         this.age= other.age;
//         this.name= other.name;
//         this.arr= other.arr;
//     }
//     @Override
//     public String toString(){
//         return "Name: "+ name + " age: "+ age + Arrays.toString(arr);
//     }
//     public static void main(String[] args) {
//         DeepCopy venu= new DeepCopy("venu", 20);
//         DeepCopy upi= new DeepCopy(venu);

//         System.out.println("venu details");
//         System.out.println(venu);

//         upi.name="upi";
//         upi.arr[0]=100;
//         System.out.println(venu);

//     }
// }
