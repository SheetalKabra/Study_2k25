package org.example.Problems;

public class FindElementInSortedArray {
    public static void main(String[] args) {
        System.out.println(findElement(new int[]{3, 6, 9, 12, 14, 19, 20, 23, 25, 27}, 20));
        System.out.println(findElement(new int[]{3, 6, 9, 12, 14, 19, 20, 23, 25, 27}, 21));
        System.out.println(findElement(new int[]{3, 6, 9, 12, 14, 19, 20, 23, 25, 27}, 3));
        System.out.println(findElement(new int[]{3, 6, 9, 12, 14, 19, 20, 23, 25, 27}, 27));
    }

    public static int findElement(int[] arr, int k){
        int l = 0;
        int r = arr.length-1;
        while(l<=r){
            int mid = (l+r)/2;
            if(arr[mid] > k)
                r = mid-1;
            else if(arr[mid] < k)
                l = mid+1;
            else if(arr[mid] == k)
                return l;
        }
        return -1;
    }
}
