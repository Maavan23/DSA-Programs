package batch49;

import java.util.Scanner;
import java.util.Arrays;

public class NameBinarySearchExample {
    
    public static int binarySearch(String[] arr, String key) {
        int low = 0, high = arr.length - 1;
        while(low <= high) {
            int mid = (low + high)/ 2;
            int cmp = arr[mid].compareToIgnoreCase(key); //a case sensitive comparison
            if(cmp == 0) return mid;
            else if(cmp < 0) low = mid+1;
            else high = mid-1;
        }
        return -1;
     }
    
    public static void insertionSort(String[] arr) {
        for(int i = 1; i < arr.length; i++) {
           String key = arr[i];
            int j = i-1;
            while(j >= 0 && arr[j].compareToIgnoreCase(key)>0) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
         } 
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[10];
        
        System.out.println("Enter 10 names: ");
        for(int i = 0; i < names.length; i++) {
            names[i] =sc.nextLine();
        }
        
        System.out.println("Unsorted names: ");
        for(String name : names) {
            System.out.print(name+" , ");
        }
        System.out.println();
    
    
        insertionSort(names);
        
        System.out.println("Sorted names: ");
        for (String name : names) {
           System.out.print(name+" , ");    
        }
        System.out.println();
        
        System.out.println("Enter a name to serach: ");
        String key = sc.nextLine();
        int r = binarySearch(names, key);
        
        if(r == -1) {
            System.out.println("Key is not found");
        } else {
            System.out.println("Key found at index: " + r );
        }
        sc.close();
        }
}
