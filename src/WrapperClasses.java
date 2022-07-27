public class WrapperClasses {
    public static void main(String[] args) {
         /*
         Wrapper classes are slower than the primitive data type
         but they may have some very useful methods that why we use them
         unlike primitive data Types, they start with a capital letter

        //primitive         //wrapper

         boolean            Boolean
         char               Character
         int                Integer
         double             Double

        //autoboxing = the automatic conversion that Java Compiler makes between primitive data type
         and their corresponding wrapper class

         unboxing = exactly the opposite of autoboxing
         */

        Boolean a= true;
        Character b= '@';
        Integer c= 123;
        Double d= 3.14;
        String e= "Saket";

       /*
       these have access for some very useful methods
       we can still treat them as a primitive data type, thru what we call unboxing
       but it is a lots of steps and hence slow
       */

        if(a) System.out.println("The statement is true");
    }
}
