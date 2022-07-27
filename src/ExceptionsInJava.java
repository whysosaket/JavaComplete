import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionsInJava {
    public static void main(String[] args) {
        /*
        * exception = anything that disrupts the normal flow of the program
        * we can handle all kinds of exceptions with Exception e, but it is considered to
        * be good practice to use different special exceptions
        *
        * "finally" block just executes in all the cases
        * it is usually used to close any files or scanner that are open
        */


        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter a whole number to divide: ");
            int x = sc.nextInt();

            System.out.print("Enter a whole number to divide by: ");
            int y = sc.nextInt();

            int z = x / y;

            System.out.println("Result: " + z);
        }
        catch (ArithmeticException e){
            System.out.println("You cannot divide by zero!!!!");
        }
        catch (InputMismatchException e){
            System.out.println("Please Enter a number OMFG!!!!");
        }
        catch (Exception e){
            System.out.println("Something went wrong");
        }
        finally {
            System.out.println("This will always print!!!!");
            sc.close();
        }
    }
}
