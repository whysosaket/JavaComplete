public class Polymorphism {
    public static void main(String[] args) {
        /*
        * polymorphism = greek word for ploy -means many morphism -forms i.e. many forms
        *                   the ability of an object to identify as more than one type
        * In this example we cannot store all these objects in the car, bike or boat class
        * alone, because it can only store one type
        * but one thing common in all the racers is that, they all are Vehicles
        * which we extend
        * Hence, we store bike, boat and car in Vehicle data type
        */

        Car1 car= new Car1();
        Bicycle1 bike = new Bicycle1();
        Boat1 boat= new Boat1();

        Vehicle[] racers = {car, bike, boat};       //we can also use Objects in place of Vehicle here

        // we could call the go methods in this way
        car.go();
        bike.go();
        boat.go();

        System.out.println("\nUsing enhanced for loop\n");

        // but we can also use a enhanced for loop, for this work
        for(Vehicle v: racers){
            v.go();
        }


    }
}

class Vehicle{
    public void go(){

    }
}

class Car1 extends Vehicle{
    @Override
    public void go(){
        System.out.println("*The car begins moving*");
    }
}

class Bicycle1 extends Vehicle{
    @Override
    public void go(){
        System.out.println("*The bike is moving*");
    }
}

class Boat1 extends Vehicle{
    @Override
    public void go(){
        System.out.println("*The boat is moving*");
    }
}