public class SuperKeyword {
    public static void main(String[] args) {

        // super = refers to the superclass also known as the parent class
        //              this is very similar to "this" keyword
        // used as super(argument)

        Hero hero1= new Hero("Batman",42,"$$$");
        Hero hero2= new Hero("Ironman",48,"Suit");

        System.out.println(hero1);
        System.out.println(hero2);


    }
}

class Person{
    String name;
    int age;

    Person(String name, int age){
        this.name= name;
        this.age= age;
    }

    @Override
    public String toString() {
        return "Name: "+name+" Age: "+age;
    }
}

class Hero extends Person{
    String power;

    Hero(String name, int age, String power){
        //this.name= name;            // though this is correct but this is not a good practice
        //this.age= age;
        super(name, age);
        this.power= power;
    }

    @Override
    public String toString(){
        return super.toString()+" Power: "+this.power;
    }
}