public class GarbageDemo {

    // finalize() method is called by the garbage collector before object is destroyed

    // finalize() runs before the object is destroyed
    protected void finalize() {
        System.out.println("Object is being deleted (finalize called)");
    }

    public static void main(String[] args) {
        GarbageDemo t1 = new GarbageDemo();  // create object
        t1 = null;             // make it eligible for garbage collection

        System.gc();           // request JVM to run garbage collector

        System.out.println("Main method finished");
    }
}

