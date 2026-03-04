package batch49;

public class AlphabeticalInsertionSort {
       public static void InsertionSort(String[] arr) {
        for(int i = 1; i < arr.length; i++) {
            String key = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j].compareTo(key) > 0) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
       
    public static void main(String[] args) {
        String[] fruits = {"Aplle","orange","banana","mango","pineapple"};
        InsertionSort(fruits);
        for(String j : fruits) {
            System.out.print(j + " , ");
        }
    }       
}
