package paula.workInClass.farm;

public class farmManagement {
    public static void main(String[] args) {
        String a;
        Animal myCat = new Animal(); // Animal eto peremennaja
        Animal mySecondCat = new Animal("Murka");

        System.out.println("My first animal:" + myCat.name);
        System.out.println("My second animal:" + mySecondCat.name);

        myCat.sound = "Mew";
        myCat.goToSleep();
        System.out.println("My cat can say: " + myCat.makeSound());
    }
}
