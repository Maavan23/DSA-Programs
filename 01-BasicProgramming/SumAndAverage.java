package batch49;
import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        
        int sum = a + b;
        double avg = sum /2 ;
        
        System.out.println("Sum is = "+ sum);
        System.out.println("Average is = "+ avg);
        
        sc.close();
    }
}
