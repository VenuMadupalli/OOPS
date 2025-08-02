public class wrapper {
    public static void main(String[] args) {
        // Primitive to Wrapper (Autoboxing)
        Boolean boolObj = true;
        Byte byteObj = 10;
        Short shortObj = 100;
        Character charObj = 'A';
        Integer intObj = 500;
        Long longObj = 10000L;
        Float floatObj = 12.34f;
        Double doubleObj = 123.456;

        // Wrapper to Primitive (Unboxing)
        boolean boolVal = boolObj;
        byte byteVal = byteObj;
        short shortVal = shortObj;
        char charVal = charObj;
        int intVal = intObj;
        long longVal = longObj;
        float floatVal = floatObj;
        double doubleVal = doubleObj;

        // Printing all values
        System.out.println("Boolean: " + boolVal);
        System.out.println("Byte: " + byteVal);
        System.out.println("Short: " + shortVal);
        System.out.println("Char: " + charVal);
        System.out.println("Integer: " + intVal);
        System.out.println("Long: " + longVal);
        System.out.println("Float: " + floatVal);
        System.out.println("Double: " + doubleVal);
    }
}
