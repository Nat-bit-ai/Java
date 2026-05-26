package main;
import person.Person;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.print("Enter the number of persons: ");
		int n = scanner.nextInt();
		Person persons[]=new Person[n];
		for(int i=0;i<n;i++) {
			System.out.println("Person: "+ (i+1));
			System.out.print("Name: ");
			String name=scanner.nextLine();
			
			System.out.print("Age: ");
			int age=scanner.nextInt();
			while(age<1 ||age>120) {
				System.out.println("Invalied Input!");
				System.out.print("Age: ");
				age=scanner.nextInt();
			}
			System.out.println("city: ");
			String city=scanner.nextLine();
			
			persons[i]=Person.getModifiedPerson(name , age , city);
		}
		
		for(int i=0;i<n;i++) {
			System.out.println("Index: "+i+1);
			persons[i].display();
		}
		
		System.out.print("Enter the index of the person you want to modify there age?");
		int c=scanner.nextInt();
		while(c<1||c>n) {
			System.out.println("Invalied Input!");
			c=scanner.nextInt();
		}
		c--;
		
		persons[c].display();
		System.out.print("New Age: ");
		int newAge=scanner.nextInt();
		while(newAge<1 ||newAge>120) {
			System.out.println("Invalied Input!");
			System.out.print("New Age: ");
			newAge=scanner.nextInt();
		}
		
		Person.updateAge(persons[c], newAge);
		persons[c].display();
		
	}

}
