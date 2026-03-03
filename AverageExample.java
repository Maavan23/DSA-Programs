package batch49;
import java.util.Scanner;

public class AverageExample {
     public static void main(String[] args) {
         
     Scanner sc = new Scanner(System.in);
     
     System.out.print("Enter fist number: ");
     int a = sc.nextInt();
     
     System.out.print("Enter second number: ");
     int b = sc.nextInt();
     
     double avg =  (a+b)/2.0;
     
     System.out.println("Average = "+avg);
     
     sc.close();
         
     }
}
