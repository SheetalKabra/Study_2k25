package org.example.Problems;

public class FindFreqOfElementInSortedArray {
    public static void main(String[] args) {
        System.out.println(findFreqOfElement(new int[]{-5, -5, -3, 0, 0, 1, 1, 5, 5, 5, 5, 5, 5, 5, 8, 10, 10, 15, 15}, 5));
        System.out.println(findFreqOfElement(new int[]{-5, -5, -3, 0, 0, 1, 1, 5, 5, 5, 5, 5, 5, 5, 8, 10, 10, 15, 15}, -5));
        System.out.println(findFreqOfElement(new int[]{-5, -5, -3, 0, 0, 1, 1, 5, 5, 5, 5, 5, 5, 5, 8, 10, 10, 15, 15}, 0));
        System.out.println(findFreqOfElement(new int[]{-5, -5, -3, 0, 0, 1, 1, 5, 5, 5, 5, 5, 5, 5, 8, 10, 10, 15, 15}, 1));
        System.out.println(findFreqOfElement(new int[]{-5, -5, -3, 0, 0, 1, 1, 5, 5, 5, 5, 5, 5, 5, 8, 10, 10, 15, 15}, 10));
        System.out.println(findFreqOfElement(new int[]{-5, -5, -3, 0, 0, 1, 1, 5, 5, 5, 5, 5, 5, 5, 8, 10, 10, 15, 15}, 15));
        System.out.println(findFreqOfElement(new int[]{-5, -5, -3, 0, 0, 1, 1, 5, 5, 5, 5, 5, 5, 5, 8, 10, 10, 15, 15}, -3));
    }

    public static int findFreqOfElement(int[] arr, int k){
        int l = 0;
        int r = arr.length-1;
        int leftIndex = -1;
        int rightIndex = -1;
        while(l<=r){
            int mid = (l+r)/2;
            if(arr[mid] > k){
                r = mid-1;
            }else if(arr[mid] < k){
                l = mid+1;
            }else{
                leftIndex=mid;
                r = mid-1;
            }
        }

        l = 0;
        r = arr.length-1;
        while(l<=r){
            int mid = (l+r)/2;
            if(arr[mid] > k){
                r = mid-1;
            }else if(arr[mid] < k){
                l = mid+1;
            }else{
                rightIndex=mid;
                l = mid+1;
            }
        }
//        System.out.println("leftIndex:"+leftIndex);
//        System.out.println("rightIndex:"+rightIndex);
        return rightIndex-leftIndex+1;
    }
}
