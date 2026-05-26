package main;
import main.Leap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Year : ");
		int year = input.nextInt();
		Leap test = new Leap();
		boolean result = test.isLeapYear(year);
		System.out.println(result);
        input.close();
		
	}
}
