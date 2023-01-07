package Sorting;

public class Bubble {

    public static void bubbleSort(int[] arr) {
        for(int i=0; i< arr.length-1; i++) {
            for(int j=0; j<arr.length-1-i; j++ ) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    public static void main(String[] args) {
        int[] arr = {4,6,2,5,7,9,1,3};

        bubbleSort(arr);

        /*for(int i=0; i<arr.length-1; i++) {
            boolean flag = true;
            for(int j=0; j< arr.length-i-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    flag = false;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            if(flag)
                break;
        }
        for(int x:arr) {
            System.out.print(x+" ");
        }*/
    }
}
