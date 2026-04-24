package batch49;

import java.util.Scanner;

public class MiLiHotel {

    // Task 2.3 - Print array values
    public static void printArray(int[] orders) {
        System.out.println("Order Numbers:");
        for (int i = 0; i < orders.length; i++) {
            System.out.println("Order[" + i + "] = " + orders[i]);
        }
    }

    // Task 2.4 - Sort using Bubble Sort (ascending)
    public static void bubbleSort(int[] orders) {
        int n = orders.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (orders[j] > orders[j + 1]) {
                    // Swap
                    int temp = orders[j];
                    orders[j] = orders[j + 1];
                    orders[j + 1] = temp;
                }
            }
        }
        System.out.println("\nSorted Order Numbers (Ascending):");
        printArray(orders);
    }

    // Task 2.5 - Search using Binary Search
    public static int binarySearch(int[] orders, int target) {
        int left = 0;
        int right = orders.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (orders[mid] == target) {
                return mid;
            } else if (orders[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; // Not found
    }

    // Task 2.1 - Main method
    public static void main(String[] args) {

        // Task 2.2 - Create and initialize array with random order numbers
        int[] orderNumbers = new int[6];
        for (int i = 0; i < orderNumbers.length; i++) {
            orderNumbers[i] = (int)(Math.random() * 900) + 100; // 3-digit numbers
        }

        // Print original array
        System.out.println("=== Original Orders ===");
        printArray(orderNumbers);

        // Sort the array
        System.out.println("\n=== After Sorting ===");
        bubbleSort(orderNumbers);

        // Search for an order number
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter Order Number to search: ");
        int target = sc.nextInt();

        int result = binarySearch(orderNumbers, target);
        if (result != -1) {
            System.out.println("Order " + target + " found at index: " + result);
        } else {
            System.out.println("Order " + target + " not found.");
        }

        sc.close();
    }
}