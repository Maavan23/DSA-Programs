package batch49;

public class BubbleSortMarks {
     static void bubbleSort(int[] arr) {
        int n = arr.length;
        int swapCount = 0; 
        
        for(int i = 0; i < n - 1; i++) {
            for(int j= 0; j < n - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    //swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapCount++;
                }
            }
        }
       System.out.println("Number of swaps = " + swapCount);
    }
     
     public static void main(String[] args) {
          int[] data = {45, 65, 76, 23, 34, 56, 67, 46};
          
           bubbleSort(data);

        System.out.print("Sorted Array: ");
        for (int i : data) {
            System.out.print(i + " ");
        }   
    }
}
