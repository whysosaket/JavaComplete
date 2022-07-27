public class printf_method {
    public static void main(String[] args) {

        /*
        * printf method takes two arguments instead of 1 in print or println
        * % [flags] [precision] [width] [conversion character]
        * CONVERSION CHARACTERS
        * %d -> integer
        * %f -> float
        * %s -> string
        * %c -> character
        * %b -> boolean
        */

        boolean b=true;
        char ch= '$';
        int in=90;
        double d= -2324322.3121212;
        String s= "dling";


        System.out.printf("This is a format string %d\n",123);
        System.out.printf("This is a format string %c\n",ch);
        System.out.printf("This is a format string %b\n",b);
        System.out.printf("This is a format string %s\n",s);
        System.out.printf("This is a format string %f\n",d);

        /*
        * [WIDTH]
        * minimum number of characters written as strings
        * including the length of characters
        * ADDING A NEGATIVE SIGN LEFT JUSTIFY the String
        */
        System.out.printf("%-10s is a boy\n", s);

        /*
         * [PRECISION]
         * sets number of digits after the decimal point in floating point numbers
         */
        System.out.printf("Number is %.2f\n", d);

        /*
         * [FLAGS]
         * adds effect to output based on flag added to format specifier
         * - : left-justify
         * + : output plus or minus
         * 0 : numeric values are zero-padded
         * , : comma grouping separator if numbers > 1000
         */
        System.out.println("FLAGS");
        System.out.printf("Number is %+f\n", d);
        System.out.printf("Number is %020f\n", d);
        System.out.printf("Number is %,f\n", d);
    }
}
