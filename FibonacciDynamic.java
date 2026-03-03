package batch49;
import java.util.Scanner;

public class FibonacciDynamic {
     public static void main(String[] args) {
         
         int n, a = 0, b = 1, next;
         Scanner sc = new Scanner(System.in); 
         
         System.out.print("Enter number of terms: ");
         n= sc.nextInt();
         
         System.out.print("Fibonacci Series: ");
          
         for(int i = 1; i <= n; i++) {
             System.out.print(a + " ");
              next = a + b; 
              a = b;
              b = next;
         } 
         
         System.out.println();
         
     }
}
