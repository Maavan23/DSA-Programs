package batch49;

public class BinaryMethodExample {
    public static int binarySearch(int[] arr,int key) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid =(low+high)/2;
            if(arr[mid]==key)return mid;
            else if(arr[mid]<key)low = mid+1;
            else high = mid-1;
        }
        return -1;
    }
    
  public static void insertionSort(int[] arr) {
      for(int i = 1; i < arr.length; i++) {
          int key = arr[i];
          int j = i-1;
          while(j >= 0 && arr[j] > key) {
              arr[j + 1] = arr[j];
              j--;
          }
          arr[j+1] = key;
      }
  }
    
    public static void main (String[] args) {
        int arr[] = {45, 3, 5, 2, 4, 6, 7, 8,34, 6};//unsorted array
        
        System.out.print("Unsorted array: ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        } 
        
         System.out.println();
         
        insertionSort(arr);
        
        System.out.print("Sorted array: ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        
        int key = 45;
        int r = binarySearch(arr, key);
        
         System.out.println();
        
        if(r == -1) {
            System.out.println("Key is not fouind");
        } else {
            System.out.println("Key found at index: " + r );
        }
    }
}
