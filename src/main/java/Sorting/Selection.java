package Sorting;

public class Selection {

    /**
     * Selection Sort to sort the values of Array
     * Time Complexity - O(n-sqaure)
     * Space Complexity - O(1)
     *
     * @param arr
     */
    public static void selectionSort(int[] arr) {
        if(arr == null && arr.length<1) {
            return;
        }
        for(int i=0; i<arr.length-1; i++) {
            int j = i+1;
            int min = i;
            while(j<arr.length) {
                if(arr[j]<arr[min]) {
                    min = j;
                }
                j++;
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {4,6,2,5,7,9,1,3};

        selectionSort(arr);
        for(int x: arr) {
            System.out.println(x);
        }
    }
}
