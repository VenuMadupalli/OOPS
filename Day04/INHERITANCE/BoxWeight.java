package Day04.INHERITANCE;

public class BoxWeight extends Box {
    double weight;
    
    BoxWeight(){
        this.weight=10;
    }

    BoxWeight(double weight) {
        this.weight = 10;
    }

    public BoxWeight(double length, double width, double height, double weight) {
        super(length, width, height);
        this.weight = 10;
    }

    void method() {
        System.out.println("This is a method in BoxWeight class");
    }   

    
    
    
}
