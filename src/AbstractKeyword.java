public class AbstractKeyword {
    public static void main(String[] args) {

         /*abstract = abstract classes cannot be instantiated, but they can have a subclass
                      abstract methods are declared without an implementation

                      this can be used for the objects that is too vague, and we don't want anyone
                      to create an object an instantiation of this class
                      or in other words this adds an extra layer of security to our program

                      we cannot write body to our abstract methods
                      but this forces us to write that method in any of its child class
        */

        //Gaadi gaadi = new Gaadi();                we cannot create instantiation of this abstract class
        BMW bmw = new BMW();


    }
}

abstract class Gaadi{

    abstract void go();                 // we can not write body to this mehtod
                                        //but this forces us to instantiate this mehtod in any of the child class
}

class BMW extends Gaadi{
    @Override
    void go(){
        System.out.println("The driver is driving the BMW");
    }
}