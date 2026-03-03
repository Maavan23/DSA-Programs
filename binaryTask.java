
import java.util.Arrays;
import java.util.Scanner;

public class binaryTask {
    public static void main(String[] args) {
        String[] fruits = new String[3];

        int n = fruits.length;

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Enter fruit " + (i + 1) + " : ");
            fruits[i] = sc.nextLine();
        }

        //unsorted array
        System.out.print("Unsorted Array: ");
        for (String x : fruits) {
            System.out.print(x + " ");
        }

        System.out.println();

        //sorted array
        System.out.print("Sorted Array: ");

        Arrays.sort(fruits);
        for (String x : fruits) {
            System.out.print(x + " ");
        }

        System.out.println();

        System.out.println("Enter name to Search:");
        String key = sc.nextLine();
        int index = Arrays.binarySearch(fruits, key);

        if (index != -1){
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found!");
        }
    }
}
