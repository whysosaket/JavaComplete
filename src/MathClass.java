public class MathClass {
    public static void main(String[] args) {
        double x= 10;
        double y=3.22;
        double z=-2.2;

        double d1=Math.max(x,y);              //Returns max of two Integers
        double d2=Math.min(x,y);              //Returns min of two Integers
        double d3=Math.sqrt(x);               //does square root
        double d4=Math.abs(z);                 //returns absolute value like (no negative sign)
        double d5=Math.round(y);                //rounds off a number
        double d6=Math.ceil(y);                 //returns upper value like 4 for 3.21
        double d7=Math.floor(y);                //returns lower value like 3 for 3.88
    }
}
