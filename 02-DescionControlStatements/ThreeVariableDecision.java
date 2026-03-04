package batch49;
import java.util.Scanner;

public class ThreeVariableDecision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter A: ");
        int A = sc.nextInt();
        
        System.out.print("Enter B: ");
        int B = sc.nextInt();
        
        System.out.print("Enter C: ");
        int C = sc.nextInt();
        
        if(A > B) {
            if(B > C) {
                System.out.println("Largest number is: "+A);
            } else {
                System.out.println("Largest number is: "+C);
            }
        } else {
            if(A > C) {
                System.out.println("Largest number is: "+B);
            } else {
                System.out.println("Largest number is: "+C);
            }
        }
        
        sc.close();
    }
}
