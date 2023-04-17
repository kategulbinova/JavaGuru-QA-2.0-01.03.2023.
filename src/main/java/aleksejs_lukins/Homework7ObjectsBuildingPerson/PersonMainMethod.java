package aleksejs_lukins.Homework7ObjectsBuildingPerson;

public class PersonMainMethod {


    public static void main(String[] args) {

//        String names[] = {"Alexander", "Max", "Irina", "Olga", "Olaf", "Kamila", "Kirill", "Dmitry", "Daniil", "German"};
//        int birthYears[] = {1990, 0, 1978, 1999, 0, 1991, 1500, 1480, 0, 1801};
//        Person[] people = new Person[10];

        Person victor = new Person("Victor");
        Person alex = new Person("Alex", 32);

        victor.setSurname("Maksimov");
        alex.setSurname("Lukins");

        if (victor.age > 18) {
            victor.hire();
        }
        else {
            victor.fire();
        }
        if (alex.age > 18) {
            alex.hire();
        }
        else {
            alex.fire();
        }

        victor.makeOlder();
        alex.makeOlder();

        System.out.println("Our 1st person's name is: " + victor.name);
        System.out.println("Our 1st person's surname is: " + victor.getSurname());
        System.out.println(victor.name + " is " + victor.age + " years old.");
        System.out.println("Our 1st person's employment status is: " + victor.isHired);

        System.out.println();

        System.out.println("Our 2nd person's name is: " + alex.name);
        System.out.println("Our 2nd person's surname is: " + alex.getSurname());
        System.out.println(alex.name + " is " + alex.age + " years old.");
        System.out.println("Our 2nd person's employment status is: " + alex.isHired);
    }
}
