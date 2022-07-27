public class toStringMethod {
    public static void main(String[] args) {
        /*
        * toString() = special method that all the objects inherits
        * return a string that textually represent a object
        * can be used both implicitly and explicitly
        * IMPLICIT -> when we call "car" in print statement, then it implicitly calls .toString() method
        * EXPLICIT -> we can also use .toString explicitly, it will have the same effect
        */

        Car car= new Car();

        //display location of car object in the memory, unless we override .toString
        //System.out.println(car);
        //System.out.println(car.toString());

        //so in order to display all of the attributes we usually override the method toSting()
        System.out.println(car);                    //using .toString implicitly
        System.out.println(car.toString());         //using .toString explicitly
    }
}

class Car{
    String company= "Tata";
    String model= "Harrier";
    String color= "Black";
    int year = 2021;


    // when we make this method me override the methods toString()
    public String toString(){
        String myString= company+"\n"+model+"\n"+color+"\n"+year;
        return myString;
    }

}