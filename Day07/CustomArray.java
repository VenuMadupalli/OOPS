//package Day07;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArray {

    private int[] data;
    private static int DEFAULT_SIZE=10;
    private int size=0;

    public CustomArray(){
        this.data= new int[DEFAULT_SIZE];
    }

    public void add(int num){
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
        int temp[]= new int[data.length *2];
        for(int i=0;i<data.length;i++){
            temp[i] = data[i];
        }
        data= temp;
    }

    public int size(){
        return size;
    }

    
    public int get(int index){
        return data[index];
    }
    @Override
    public String toString() {
        return "CustomArray{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }
    public static void main(String[] args) {
        ArrayList arr= new ArrayList<>();

        System.out.println(arr.size());
        arr.add(56);
        arr.add(45);
        arr.add(23);
        System.out.println(arr.size());
        System.out.println(arr.get(0));

        System.out.println(arr.toString());

    }
    
}