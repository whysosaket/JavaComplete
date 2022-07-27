import java.util.ArrayList;
public class arraylist2D {
    public static void main(String[] args) {
        //we can make a 2d Arraylist and then we can add many list to that final list

        ArrayList<ArrayList<String>> shoppingList= new ArrayList<>();

        ArrayList<String> bakeryList= new ArrayList();

        bakeryList.add("pasta");
        bakeryList.add("bread");
        bakeryList.add("pizza dough");

        ArrayList<String> musicList= new ArrayList<>();

        musicList.add("Mic");
        musicList.add("Tabla");
        musicList.add("Guitar");
        musicList.add("Banjo");
        musicList.add("Casio");
        musicList.add("Piano");

        ArrayList<String> drinkList= new ArrayList<>();

        drinkList.add("Amul Kool");
        drinkList.add("Doodh");
        drinkList.add("Coca Cola");
        drinkList.add("Thumbs UP");

        shoppingList.add(bakeryList);
        shoppingList.add(musicList);
        shoppingList.add(drinkList);

        System.out.println(shoppingList);           //we can show all this using only one List and print statement
        System.out.println(shoppingList.get(1));    //only getting one separate list
        System.out.println(shoppingList.get(0).get(0));    //only getting specific element from one separate list

        //System.out.println(bakeryList);
        //System.out.println(musicList);
        //System.out.println(drinkList);

    }
}
