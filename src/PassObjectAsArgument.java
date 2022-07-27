public class PassObjectAsArgument {
    public static void main(String[] args) {
        Garage garage = new Garage();
        Cars cars1= new Cars("BMW");
        Cars cars2= new Cars("Tesla");
        garage.park(cars1);
        garage.park(cars2);
    }
}

class Garage{
    void park(Cars car){
        System.out.println("The "+car.name+" is parked in the garage");
    }
}

class Cars{
    String name;
    Cars(String name){
        this.name= name;
    }
}