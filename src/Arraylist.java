import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> food = new ArrayList<String>();        //arraylist can only be used for reference data type
        // we can actually change the length of arraylists during runtime
        //this is the advantage of this during the run time

        food.add("Pizza");
        food.add("Veg-Roll");                   //adds a element to a new index
        food.add("Ham");

        food.set(0, "Momos");                   //add element to a specific index
        food.remove(2);               //removes element from a specific index
        //food.clear();                       //clears the array list

        for (String s : food) {
            System.out.println(s);      // we can use enhanced for just like arrays
        }

        for (int i = 0; i < food.size(); i++) {         //we use .size instead of .length
            System.out.println(food.get(i));        //we use get function to get a element
        }
    }
}