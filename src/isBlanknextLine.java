import java.util.Scanner;

public class isBlanknextLine {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        //using nextLine instead of next can also help in taking a blank input
        // next line takes input till \n, which is basically pressing enter key
        String name= sc.nextLine();
        //instead of making if statements we can use isblank
        while (name.isBlank()){
            System.out.print("Enter Name Again: ");
            name= sc.nextLine();
        }
        System.out.println("Your name is "+name);
        /*
         * when we take an input of an integer Using sc.nextInt();
         * we take the integer as an input and when we press enter the Scanner takes
         * only the numbers into account and ignores the enter key that we pressed and
         * the \n is kept in the memory, hence if we use sc.nextLine after that sc.nextInt
         * then since sc.nextLine reads till \n, it will read the \n left from the previous input and
         * not take new input, hence we add extra sc.nextLine(); in order to clear \n from the memory
         */
        System.out.print("Enter a number: ");
        int a= sc.nextInt();
        //sc.nextLine();                        //this line is to counter this problem
        System.out.print("Enter your name: ");
        String s = sc.nextLine();               //this will go unnoticed
        System.out.println("Your name and number are "+a+" "+s); //to counter this we added extra sc.nextLine in the above code
    }
}
