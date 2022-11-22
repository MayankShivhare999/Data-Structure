package Sorting;

public class Selection {
    public static void main(String[] args) {
        int[] arr = {4,6,2,5,7,9,1,3};

        for(int i=0; i<arr.length-1; i++) {
            int min = i;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[j]<arr[min]) {
                    min = j;
                }
            }
            swap(arr, i, min);
        }
        for(int x:arr) {
            System.out.print(x+" ");
        }
    }

    static void swap(int[] arr, int l, int r) {
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }
}
