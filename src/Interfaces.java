public class Interfaces {
    public static void main(String[] args) {

        /*
        * Interface = a template that can be applied to a class
        *             it is similar to inheritance but specifies what a class must do
        *             classes can apply more than one interface, inheritance is limited to 1 superclass
        */

        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();
        Fish fish = new Fish();

        rabbit.flee();
        hawk.hunt();

        fish.flee();
        fish.hunt();


    }
}
class Rabbit implements Pray{
    @Override
    public void flee(){
        System.out.println("The rabbit is fleeing");
    }
}

class Hawk implements Predator{
    @Override
    public void hunt(){
        System.out.println("The hawk is hunting");
    }
}

class Fish implements Pray, Predator{

    @Override
    public void flee() {
        System.out.println("This fish is fleeing from a larger fish");
    }

    @Override
    public void hunt() {
        System.out.println("This fish is hunting smaller fish");
    }
}

