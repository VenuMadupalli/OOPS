//package Day08;
import java.util.ArrayList;
import java.util.function.Consumer;

public class LamdaFunctions {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i + 1);  // list = [1, 2, 3, 4, 5]
        }

        // System.out.println("Using Lambda:");
        // list.forEach((item) -> System.out.println(item * 2));

        Consumer<Integer> fun= (item)->System.out.println(item*2);
        list.forEach(fun);

        Operation sum=(a,b)-> a+b;
        Operation deff=(a,b)-> a-b;
        Operation multiply=(a,b)-> a*b;
        Operation devide=(a,b)-> a/b;
        Operation modulo=(a,b)-> a%b;

        LamdaFunctions obj= new LamdaFunctions();
        System.out.println("Addition operation: "+ obj.operate(5, 5, sum));


        System.out.println("Normal method:");
        sum(list);
    }
    private int operate(int a, int b, Operation op){
        return op.operation(a, b);
    }

    // Modified method to accept ArrayList and return nothing (void)
    private static void sum(ArrayList<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            int doubled = arr.get(i) * 2;
            System.out.println(doubled);
        }
    }
}

interface Operation{
    int operation(int a, int b);
}