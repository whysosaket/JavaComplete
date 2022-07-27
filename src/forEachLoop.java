import java.util.ArrayList;

public class forEachLoop {
    public static void main(String[] args) {
        //for each loop is used to iterate through the elements of array
        // it has less steps and it is more readable but is less flexible
        ArrayList<String> name= new ArrayList<>();

        name.add("Saket");
        name.add("Dling");
        name.add("Anmol");
        name.add("Milind");

        String [] animal={"Dog", "Cat", "rat", "bird"};

        System.out.println("Names");
        //Printing name
        for(String s: name){
            System.out.println(s);
        }

        System.out.println("Animals");
        //printing animals
        for(String s: animal){
            System.out.println(s);
        }
    }
}
