package main;
import main.Factorial;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("what is ur name : ");
		String Message = String.format("Welcome, %s, to Java Programming!", name);
		JOptionPane.showMessageDialog(null, Message);
	}
}
