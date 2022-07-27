import java.util.Random;

public class RandomClass {
    public static void main(String[] args) {
        // This random class basically gives a psudo-Random number and not completely random
        Random rn = new Random();
        /*
        * This is basically for older JDKs
        * Here we need to generate a value specific between two numbers then,
        * we add a bound, say 6, (for a dice)
        * then this will generate a number less than 6,
        * but the counting starts from 0, so hence to get values form 1 to 6 we need to,
        * add 1 to set lower bound limit to 1
        * and then we increase the upper bound to 7,
        * so the number displayed are less than 7 and start from 1
        * i.e. 1 2 3 4 5 6
        */
        int x= rn.nextInt(7)+1;
        double d = rn.nextDouble();         //this gives a random values between 0 and 1
        boolean b= rn.nextBoolean();        //returns a boolean value (either true or false)

        System.out.println(x);
    }
}
