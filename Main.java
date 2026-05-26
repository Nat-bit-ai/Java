package main;
import main.Vehicle;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Vehicle motor = new Vehicle(2,2);
		Vehicle car = new Vehicle(4,4);
		System.out.println("motor has " + motor.no_of_seats + " num of seats and " + motor.no_of_wheels + " num of wheels" );
		System.out.println("car has " + car.no_of_seats + " num of seats and " + car.no_of_wheels + " num of wheels" );

	}

}
