package Sorting;

public class Insertion {
    public static void main(String[] args) {
        int[] arr = {4,6,2,5,7,9,1,3};

        for(int i=1; i<arr.length; i++) {
            int temp = arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>temp) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }

        for(int x:arr) {
            System.out.print(x+" ");
        }
    }
}
