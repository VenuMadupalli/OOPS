package Compare;

public class Main  {
    public static void main(String[] args) {
        Student venu= new Student(16, 99);
        Student ram= new Student(1, 100);

        if(ram.compareTo(venu)>0){
            System.out.println("Ram got more marks than venu");
        } 
        else if(ram.compareTo(venu)==0){
            System.out.println("Both got equal marks..");
        } 
        else{
            System.out.println("venu got more marks..");
        }
    }
}
