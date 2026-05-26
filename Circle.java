package main;

import java.util.Scanner;

public class Circle {
	double radius;
	final static double PI = 3.14;
	
	void area(double radius) {
		 System.out.println("Area = " + PI*radius*radius);
	}
	void cir(double radius) {
		 System.out.println("Circumfrance = " + PI*2*radius);
	}
	public static void main(String[] args) {
		Circle c1 = new Circle();
		Scanner input = new Scanner(System.in);
		System.out.println("Insert Radius : ");
		c1.radius = input.nextInt();
		input.nextLine();
		
		c1.area(c1.radius);
		c1.cir(c1.radius);
	}
}
