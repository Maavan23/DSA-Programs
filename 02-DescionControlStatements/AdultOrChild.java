package batch49;
import java.util.Scanner;

public class AdultOrChild {
     public static void main(String[] args) {
         
                 Scanner sc = new Scanner(System.in);

                 System.out.print("Enter age: ");
                 int age = sc.nextInt();
                 
                 if(age >= 21) {
                     System.out.println("Adult");
                 } else {
                     System.out.println("Child");
                 }
                     
                sc.close();
     }
}
