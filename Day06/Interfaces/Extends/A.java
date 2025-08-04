package Day06.Interfaces.Extends;

public interface A {
    public void car();

    default void fun(){
        System.out.println("Iam in A");
    }
}
