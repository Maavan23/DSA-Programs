package batch49;


public class Factorial {

    // Recursive method to calculate factorial
    public static long factorial(int n) {
        // Base case
        if (n == 0 || n == 1) {
            return 1;
        }
        // Recursive call
        return n * factorial(n - 1);
    }

    // Method to print factorial values from 1 to limit
    public static void printFactorials(int limit) {
        System.out.println("Factorial Numbers:");
        for (int i = 0; i <= limit; i++) {
            System.out.println(i + "! = " + factorial(i));
        }
    }

    public static void main(String[] args) {
        printFactorials(10);
    }
}