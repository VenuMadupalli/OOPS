package Day04;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        Square square = new Square();

        Shape obj= new Circle(); // Upcasting: Circle is a Shape
        obj.area();

        shape.area();     // Calculating area in Shape class
        triangle.area(); //  Calculating area in Triangle class
        circle.area();   //  Calculating area in Circle class
        square.area();   //  Calculating area in Square class
    }
}
