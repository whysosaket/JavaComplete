import java.util.InputMismatchException;
import java.util.Scanner;

public class exception {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        try {
            System.out.print("Enter a while number to device: ");
            int x = sc.nextInt();
            System.out.print("Enter a while number to divide by: ");
            int y = sc.nextInt();
            int z = x / y;
            System.out.println("Result: " + z);
        }
        catch (ArithmeticException e){
            System.out.println("You Can't Divide by Zero!!!");
        }
        catch (InputMismatchException e){
            System.out.println("Please Enter a Number!!!");
        }
        catch (Exception e){
            System.out.println("Something went Wrong!!!");
        }
        finally {
            System.out.println("This will always print");
            sc.close();
        }
    }
}
