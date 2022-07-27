public class methods {
    public static void main(String[] args) {
        // method = block of code which is executed when it is called upon
        methods m= new methods();

        String name ="Saket";

        m.print(name);              //here passing name means passing argument
    }
        //we cannot make static reference for non static methods or objects
    public void print(String parameter){        //here we pass in parameter
        System.out.println("Hello "+parameter);
    }

}
