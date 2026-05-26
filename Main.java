package main;
import main.Factorial;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
        int num = input.nextInt();

        Factorial obj = new Factorial();

        System.out.println("Recursive Factorial: "
                + obj.recursiveFactorial(num));

        System.out.println("Non-Recursive Factorial: "
                + obj.nonRecursiveFactorial(num));

        input.close();
	}
}
