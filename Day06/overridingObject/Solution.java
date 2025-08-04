//package Day06.overridingObject;

public class Solution extends Object{
    public String toString(){
        return super.toString() + " - Overridden toString method in Solution class";
    }

    public int hashCode() {
        return super.hashCode() + 1000; // Example of modifying the hash code
    }

    public boolean equals(Object obj) {
        return super.equals(obj); // Using the default equals method from Object
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.toString()); // Calls the overridden toString method
        System.out.println("Hash Code: " + solution.hashCode()); // Calls the overridden hashCode method

        Object obj = new Object();
        System.out.println(obj.toString()); // Calls the default toString method of Object
        System.out.println("Hash Code: " + obj.hashCode()); // Calls the default hashCode method of Object

        System.out.println("Are solution and obj equal? " + solution.equals(obj)); // Calls the overridden equals method
        System.out.println("Are solution and solution equal? " + solution.equals(solution)); // Calls
    }
}
