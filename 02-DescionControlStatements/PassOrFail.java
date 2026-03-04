package batch49;
import java.util.Scanner;

public class PassOrFail {
     public static void main(String[] args) {
         
                 Scanner sc = new Scanner(System.in);

                 System.out.print("Enter marks: ");
                 int marks = sc.nextInt();
                 
                 if (marks > 50) {
                     System.out.println("PASS");
                 } else {
                     System.out.println("FAIL");
                 }
                 
                 sc.close();
         
     }
}
