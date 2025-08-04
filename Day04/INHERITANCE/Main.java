package Day04.INHERITANCE;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box(5);
        Box box3 = new Box(2, 3, 4);
        Box box4 = new Box(box2);

        System.out.println("Volume of box1: " + box1.volume());
        System.out.println("Volume of box2: " + box2.volume());
        System.out.println("Volume of box3: " + box3.volume());
        System.out.println("Volume of box4: " + box4.volume());

        BoxWeight boxWeight1 = new BoxWeight();
        System.out.println("Weight of boxWeight1: " + boxWeight1.weight);
        System.out.println("length of boxWeight1: " + boxWeight1.length);

        Box obj= new BoxWeight(2, 3, 4, 5);
        System.out.println("Volume of obj: " + obj.volume()+ "and weight you cant access " );

        // BoxWeight obj2= new Box(6,7,9); // This will cause a compile-time error 
        //because Box is not a subclass of BoxWeight



    }
}
