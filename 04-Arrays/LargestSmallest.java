package batch49;

public class LargestSmallest {
    public static void main(String[] args) {
        int[] arr = {10, 5, 50, 2, 20, 45};
        
        int largest = arr[0];
        int smallest = arr[0];
   
        
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > largest) {
                largest = arr[i];
            } 
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        
        System.out.println("Smallset number is: "+ smallest);
        System.out.println("Largest number is: "+ largest);
        
        }
    
    }
    
