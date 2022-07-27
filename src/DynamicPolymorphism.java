import java.util.InputMismatchException;
import java.util.Scanner;

public class DynamicPolymorphism {
    public static void main(String[] args) {
        // Dynamic -> many shapes and forms
        // Polymorphism -> after Compilation (during runtime)

        // eg. a corvette is a: Corvette, and a car, and a vehicle, and an object

        Scanner sc= new Scanner(System.in);
        Animal animal;

        System.out.println("What animal do you want?");
        System.out.print("1=(dog) or 2=(cat): ");
        while(true) {
            try {
                int choice = sc.nextInt();
                if (choice == 1) {
                    animal = new Dog();
                    animal.speak();
                } else if (choice == 2) {
                    animal = new Cat();
                    animal.speak();
                } else {
                    animal = new Animal();
                    System.out.println("That animal was not found");
                    animal.speak();
                }
                break;
            } catch (InputMismatchException e) {
                System.out.print("Please Enter a Integer: ");
            }
            sc.nextLine();             // this is used to clear the buffer memory
        }

    }
}

class Animal{
    void speak(){
        System.out.println("Animal goes *brr*");
    }
}

class Dog extends Animal{
    @Override
    void speak(){
        System.out.println("Dog goes *Bark*");
    }
}

class Cat extends Animal{
    @Override
    void speak(){
        System.out.println("cat goes *meow*");
    }
}