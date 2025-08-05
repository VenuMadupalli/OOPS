// //package Day08.Cloning;

import java.util.Arrays;

public class DeepCopy {
    String name;
    int age;
    int arr[];
    DeepCopy(String name, int age){
        this.name= name;
        this.age= age;
        this.arr= new int[]{46,3,1,5,89,6};

    }
    DeepCopy(DeepCopy other){
        this.age= other.age;
        this.name= other.name;
        //this.arr= other.arr; shallow copy
        this.arr = Arrays.copyOf(other.arr, other.arr.length);

    }
    @Override
    public String toString(){
        return "Name: "+ name + " age: "+ age + Arrays.toString(arr);
    }
    public static void main(String[] args) {
        DeepCopy venu= new DeepCopy("venu", 20);
        DeepCopy upi= new DeepCopy(venu);

        System.out.println("venu details");
        System.out.println(venu);

        upi.name="upi";
        upi.arr[0]=100;
        System.out.println(venu);
        System.out.println("upi details"); 
        System.out.println(upi);

    }
}



// import java.util.Arrays;

// public class DeepCopy implements Cloneable {
//     int age;
//     String name;
//     int[] arr;

//     public DeepCopy(String name, int age) {
//         this.age = age;
//         this.name = name;
//         this.arr = new int[]{6, 3, 52, 1, 9, 2};
//     }

//     @Override
//     public Object clone() throws CloneNotSupportedException {
//         // Step 1: Shallow copy
//         DeepCopy cloned = (DeepCopy) super.clone();

//         // Step 2: Deep copy of the array
//         cloned.arr = this.arr.clone(); // creates a new copy of the array

//         return cloned;
//     }

//     public static void main(String[] args) throws CloneNotSupportedException {
//         DeepCopy venu = new DeepCopy("venu", 20);

//         // Deep cloning
//         DeepCopy upi = (DeepCopy) venu.clone();
//         // Modify cloned object's array
//         upi.name = "upi";
//         upi.arr[0] = 100;
//         System.out.println("Original:");
//         System.out.println("Name: " + venu.name + ", Age: " + venu.age + ", arr: " + Arrays.toString(venu.arr));
//         System.out.println("Cloned:");
//         System.out.println("Name: " + upi.name + ", Age: " + upi.age + ", arr: " + Arrays.toString(upi.arr));
//     }
// }
