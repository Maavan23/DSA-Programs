package batch49;
import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);
         
         System.out.print("Enter Radius: ");
         double r = sc.nextDouble();
         
         double area = 3.14 * r * r;
         
         System.out.println("Area of the Circle = "+ area);
         
         sc.close();
    }
}
