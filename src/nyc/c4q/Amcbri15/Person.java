package nyc.c4q.Amcbri15;

import java.util.Scanner;

/**
 * Created by c4q-anthony-mcbride on 3/26/15.
 */
public class Person {
    private String name;
    private String phoneNumber;
    private String city;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public static boolean checkSameCity(Person first, Person second) {
        // checks if the cities stored in both Person instances are equal
        return (first.getCity().equals(second.getCity()));
    }
    public static Person registerChild (Person parent) {
        // creates new Person instance with a new name and the same phones number and city as another instance
        Person child = new Person();
        child.setName("Abc");
        child.setCity(parent.getCity());
        child.setPhoneNumber(parent.getPhoneNumber());
        return child;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Person firstPerson = new Person();
        Person secondPerson = new Person();

        // prompts user for two Persons' instance info
        System.out.println("Please enter the first person's name: ");
        firstPerson.setName(in.next());
        System.out.println("Please enter the first person's phone number: ");
        firstPerson.setPhoneNumber(in.next());
        System.out.println("Please enter the first person's city: ");
        firstPerson.setCity(in.next());

        System.out.println("\nStored!\n");

        System.out.println("Please enter the second person's name: ");
        secondPerson.setName(in.next());
        System.out.println("Please enter the second person's phone number: ");
        secondPerson.setPhoneNumber(in.next());
        System.out.println("Please enter the second person's city: ");
        secondPerson.setCity(in.next());

        // compares the cities of the two Person instances created above using the checkSameCity() method.
        if (checkSameCity(firstPerson, secondPerson)) {
            System.out.println("\n" + firstPerson.getName() + " and " + secondPerson.getName() + " live in the same city!");
        }
        else {
            System.out.println("\n" +firstPerson.getName() + " and " + secondPerson.getName() + " are not in the same city.");
        }



        System.out.println("\nHey, " + firstPerson.getName() + " had a baby named " + registerChild(firstPerson).getName() + "!");
        System.out.println(registerChild(firstPerson).getName() + "'s number is " + registerChild(firstPerson).getPhoneNumber() +
                           " and (s)he lives in " + registerChild(firstPerson).getCity() + ". Just like " + firstPerson.getName() +
                           "!");
    }
}
