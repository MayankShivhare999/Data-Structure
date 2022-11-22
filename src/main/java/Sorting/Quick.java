package Sorting;

public class Quick {
    public static void main(String[] args) {
        int[] arr = {4,6,2,5,7,9,1,3};
        quickSort(arr,0,arr.length-1);
        for(int x:arr)
            System.out.print(x+" ");
    }

    static void quickSort(int[] arr,int low,int high) {
        if (low < high) {

            // pi is partitioning index, arr[p]
            // is now at right place
            int pi = partitioning(arr, low, high);

            // Separately sort elements before
            // partition and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    static int partitioning(int[] arr, int low,int high) {
        // pivot
        int pivot = arr[high];

        // Index of smaller element and
        // indicates the right position
        // of pivot found so far
        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {

            // If current element is smaller
            // than the pivot
            if (arr[j] < pivot) {

                // Increment index of
                // smaller element
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    static void swap(int[] a,int l, int r) {
        int temp = a[l];
        a[l] = a[r];
        a[r] = temp;
    }
}
