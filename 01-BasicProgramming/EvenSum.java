package batch49;

public class EvenSum {
      public static void main(String[] args) {
          int sum = 0;
          
          for (int i = 0; i <= 100; i = i +2) {
              
              sum = sum + i;
              
          }
          
           System.out.println("Sum of Even Number from 1 to 100 is: "+ sum);
           
      }    
}
