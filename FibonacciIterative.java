package batch49;

public class FibonacciIterative {
     public static void main(String[] args) {
         
         int a = 0, b = 1;
         int next;
         
         System.out.print("Fibonacci numbers from 0 to 50: ");
          
         System.out.print(a + " " + b + " ");
         
         next = a + b;

         while(next <= 50) {
             System.out.print(next + " ");
             a = b;
             b = next;
             next = a + b; 
         }       
             
          System.out.println();
         
     }
}
