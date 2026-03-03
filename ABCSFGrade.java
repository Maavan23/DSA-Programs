package batch49;
import java.util.Scanner;

public class ABCSFGrade {
    public static void main(String[] args) {
        
          Scanner sc = new Scanner(System.in);
          
          System.out.print("Enter marks: ");
          int marks = sc.nextInt();
          
          if(marks >= 80 && marks < 100) { 
              System.out.println("Your Grade is: A");
          } else {
              if(marks >=60 && marks <79) {
                System.out.println("Your Grade is: B");  
              } else {
                  if(marks >= 40 && marks <59) {
                      System.out.println("Your Grade is: C");
                  } else {
                      if(marks >= 30 && marks <39) {
                          System.out.println("Your Grade is: S");
                      } else {
                          System.out.println("Your Grade is: F");
                      }
                  }
              }
          }
          
          sc.close();       
          
    }
}
