public class GCDemo {
    // finalize() is called before object is garbage collected
    protected void finalize() {
        System.out.println("Object is garbage collected");
    }

    public static void main(String[] args) {
        GCDemo obj1 = new GCDemo();
        GCDemo obj2 = new GCDemo();

        // Make both objects eligible for garbage collection
        obj1 = null;
        obj2 = null;

        // Suggest JVM to run garbage collector
        System.gc();
    }
}
