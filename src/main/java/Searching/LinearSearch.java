package Searching;

public class LinearSearch {

    /**
     * Linear Search Algorithm
     * Time Complexity - O(n)
     * Space Complexity - O(1)
     *
     * @param arr
     * @param target
     * @return index value where target is found otherwise -1
     */
    public static int linearSearch(int[] arr, int target) {
        for(int i=0; i<arr.length; i++) {
            if(arr[i]==target)
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {4,2,5,3,6,5,6,11,53,63,7};
        int target = 12;
        int ans = linearSearch(arr, target);
        System.out.println(ans);
    }
}
