//package Day08.CollectionsIntro;
public class EnumDemo {
    enum Day {
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
        //These are enum constants
        //these are bydefault public, static, final
        //y ou cant create child enums
        // type is Day

        Day() {
            System.out.println("Constructor called for " + this);
        }
    }

    public static void main(String[] args) {
        Day toDay = Day.Monday;
        System.out.println("Today is: " + toDay);

        System.out.println("\nAll days:");
        for (Day day : Day.values()) {
            System.out.println(day);
        }

        System.out.println("\nOrdinal value of Sunday:");
        System.out.println(Day.Sunday.ordinal()); // Output: 6 (index starting from 0)
    }
}