public class StaticKeyword {
    public static void main(String[] args) {
        Friend friend1= new Friend("Dling");
        Friend friend2= new Friend("Aditya");
        Friend friend3= new Friend("Shakib");

        //System.out.println(Friend.numberOfFriends);
        Friend.displayFriends();
    }
}

class Friend{
    static int numberOfFriends;
    String name;
    Friend(String name){
        this.name=name;
        numberOfFriends++;
    }

    static void displayFriends(){
        System.out.println("You have this number of friends: "+numberOfFriends);
    }
}