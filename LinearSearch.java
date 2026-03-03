package batch49;

public class LinearSearch {
    public static int LinearSearch(int[] arr, int key) {
      for(int i = 0; i < arr.length; i++) {
          if (arr[i] == key) return i;  
      }
      return -1;
    } 
    
    public static void main(String [] args) {
        int[] arr = {5, 11, 12, 13, 6}; //array of elements
        int key = 6; // value to search
        int result = LinearSearch(arr, key);
        
        if(result == -1) {
            System.out.println("Key not found");
        } else {
            System.out.println("Key found at:"+result);
        }
    }
}
