package ExceptionHandling;

public class Launch2 {
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 2;
        int result = 0;
        int values[] = {4,7,2,9};
        String name = null;

        try{
            result = num1 / num2;
//            result = num1 / name.length();
            System.out.println(values[5]);
        }

        catch (ArithmeticException e){
            System.out.println("cannot divide by zero" + e);
        }

        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("stay in your limits..");
        }

        catch (Exception e){
            System.out.println("Something went wrong");
        }
    }
}
