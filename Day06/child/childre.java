package Day06.child;

public class childre extends Day06.Access.parent {
    public static void main(String[] args) {
        // Accessing the parent class's main method
        parent.main(args);
        
        // Additional functionality can be added here
        System.out.println("Child class main method executed.");
    }
    
}
