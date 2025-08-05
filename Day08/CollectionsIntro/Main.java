//package Day08.CollectionsIntro;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();
        List<Integer> list2= new LinkedList<>();

        System.out.println("ArrayList");
        list.add(3);
        list.add(7);
        list.add(1);
        list.add(0);
        list.add(2);
        list.add(99);
        System.out.println(list);

        System.out.println("Linked list");
        list2.add(2);
        list2.add(7);
        System.out.println(list2);

        System.out.println("vector.."); //Syncronized internal implemetation
        List<Integer> vector= new Vector<>();
        vector.add(2);
        vector.add(4);
        vector.add(6);
        vector.add(1);
        vector.add(9);
        System.out.println(vector);
    }
}
