package Day08;
public class ExceptionHanding {
    public static void main(String[] args) {
        int a=7;
        int b=0;
        try{
            // int c= a/b;
            // System.out.println(c);
            String name = "venu";
            if(name.equals("venu")){
            throw new MyException("Name is venu");
            }
        }
        catch(MyException e){
            System.out.println(e.getMessage());
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            //System.out.println(e.getMessage());
            System.out.println("normal exception..");
        }
        finally{
            System.out.println("This will always execute..");
        }
        devide(5, 0);
    }
    public static double devide(int a, int b){
        if(b==0){
            throw new ArithmeticException("Can't devide by zero");
        }
        return a/b;
    }
}
