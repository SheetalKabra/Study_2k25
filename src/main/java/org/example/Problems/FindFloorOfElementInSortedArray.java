package org.example.Problems;

public class FindFloorOfElementInSortedArray {
    public static void main(String[] args) {
        System.out.println(findFloorOfElement(new int[] {-5, 2, 3, 6, 9 ,10, 11, 14, 18}, 5));
        System.out.println(findFloorOfElement(new int[] {-5, 2, 3, 6, 9 ,10, 11, 14, 18}, 4));
        System.out.println(findFloorOfElement(new int[] {-5, 2, 3, 6, 9 ,10, 11, 14, 18}, 100));
        System.out.println(findFloorOfElement(new int[] {-5, 2, 3, 6, 9 ,10, 11, 14, 18}, -10));
    }

    public static int findFloorOfElement(int[] arr, int k){
        int l = 0;
        int r = arr.length-1;
        int ans = 0;
        while(l<=r){
            int mid = (l+r)/2;
            if(arr[mid] > k){
                r = mid-1;
            }else if(arr[mid] < k){
                ans = arr[mid];
                l = mid+1;
            }else if(arr[mid] == k){
                return arr[mid];
            }
        }
        return ans;
    }
}
