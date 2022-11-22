package Sorting;

public class Insertion {

    /**
     * insertion sort algorithm to sort the array value
     * Time Complexity - O(n-square)
     * Space Complexity - O(1)
     *
     * @param arr
     */
    public static void insertionSort(int[] arr) {
        for(int i=1; i<arr.length; i++) {
            int temp = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>temp) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {4,6,2,5,7,9,1,3};
        insertionSort(arr);
        for(int x:arr) {
            System.out.println(x);
        }
    }
}
