package batch49;
import java.util.Scanner;

public class StudentSearch {
    public int LinearSearch(String[] names,String key) {
        int comparisons = 0;
        
        for(int i = 0; i < names.length; i++) {
            comparisons++;
            
           if(names[i].equalsIgnoreCase(key)) {
               System.out.println("Total comparisons: "+comparisons);
               return i;
           }    
        }
        
        System.out.println("Total comparisons: "+comparisons);
        return -1;
        
}
    
public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    String[] names = new String[10];
    int[] ages = new int[10];
    
    System.out.println("Enter names and ages of 10 students");
    
    for(int i = 0; i <10; i++) {
        System.out.print("Enter names of student: "+(i+1)+" : ");
        names[i] = sc.nextLine();
        
        System.out.print("Enter age of student: "+(i+1)+" : ");
        ages[i] = sc.nextInt();
        sc.nextLine();
    }
    
    System.out.print("\nEnter name to search: ");
    String key = sc.nextLine();
    
   StudentSearch obj = new StudentSearch();
   int result = obj.LinearSearch(names, key);
    
    if (result == -1) {
        System.out.println("Student not found");
    } else {
        System.out.println("Student found");
        System.out.println("Age: "+ ages[result]);
    }
    sc.close();
  }
}
    
    
      