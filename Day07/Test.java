//package Day07;

import java.util.ArrayList;
import java.util.Arrays;

public class Test<T> {

    private Object[] data;
    private static int DEFAULT_SIZE=10;
    private int size=0;

    public Test(){
        this.data= new Object[DEFAULT_SIZE];
    }

    public void add(T num){
        if(isFull()){
            reSize();
        }
        data[size]= num;
        size++;
    }
    public boolean isFull(){
        return size == data.length;
    }

    public void reSize(){
        Object temp[]= new Object[data.length *2];
        for(int i=0;i<data.length;i++){
            temp[i] =(data[i]);
        }
        data= temp;
    }

    public int size(){
        return size;
    }

    
    public T get(int index){
        return (T)data[index];
    }
    @Override
    public String toString() {
        return "CustomArray{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }
    
    @SuppressWarnings("unchecked")// to avoid warnings
    public T remove(){
        T removed=(T)data[--size];
        return removed;
    }

    public void set(int index, Object value){
        data[index]= value;
    }
    public static void main(String[] args) {
        ArrayList arr= new ArrayList<>();
        System.out.println(arr.size());
        arr.add("venu");
        arr.add(45);
        arr.add(23);
        System.out.println(arr.size());
        System.out.println(arr.get(0));

        System.out.println(arr.toString());

        Test<Integer> list= new Test<>();
        for(int i=0;i<15;i++){
            list.add(2*i);
        }
        System.out.println(list);



    }
    
}