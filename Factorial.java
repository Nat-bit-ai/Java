package main;

public class Factorial {
	int recursiveFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * recursiveFactorial(n - 1);
    }
	int nonRecursiveFactorial(int n) {
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        return fact;
    }
}
