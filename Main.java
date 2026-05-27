package main;

import java.util.Scanner;
import person.Person;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // number of persons
        System.out.print("Enter number of persons: ");
        int n = input.nextInt();
        input.nextLine();

        // array of Person objects
        Person[] people = new Person[n];

        // input persons
        for (int i = 0; i < n; i++) {

            System.out.println("Enter details for person " + (i + 1));

            System.out.print("Name: ");
            String name = input.nextLine();

            System.out.print("Age: ");
            int age = input.nextInt();
            input.nextLine();

            System.out.print("City: ");
            String city = input.nextLine();

            // store object in array
            people[i] = new Person(name, age, city);
        }

        // update age
        System.out.print("Enter index to update age: ");
        int index = input.nextInt();

        if (index >= 0 && index < n) {
            System.out.print("Enter new age: ");
            int newAge = input.nextInt();

            people[index].updateAge(people[index], newAge);
        } else {
            System.out.println("Invalid index! Skipping update.");
        }

        input.nextLine();

        // create modified person
        Person modifiedPerson = null;

        System.out.print("Enter index for modified person: ");
        int idx = input.nextInt();
        input.nextLine();

        if (idx >= 0 && idx < n) {

            System.out.print("New name: ");
            String newName = input.nextLine();

            System.out.print("New age: ");
            int newAge = input.nextInt();
            input.nextLine();

            System.out.print("New city: ");
            String newCity = input.nextLine();

            modifiedPerson = people[idx].getModifiedPerson(newName, newAge, newCity);

        } else {
            System.out.println("Invalid index! No modified person created.");
        }

        // display all persons
        System.out.println("\n=== ALL PERSONS ===");
        for (Person p : people) {
            p.display();
        }

        // display modified person
        if (modifiedPerson != null) {
            System.out.println("=== MODIFIED PERSON ===");
            modifiedPerson.display();
        }

        input.close();
    }
}