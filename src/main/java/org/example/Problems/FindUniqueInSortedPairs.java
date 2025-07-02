package org.example.Problems;

public class FindUniqueInSortedPairs {
    public static void main(String[] args) {
        System.out.println(findUnique(new int[]{3, 3, 1, 1, 8, 8, 10, 10, 9, 6, 6, 2, 2, 4, 4}));
        System.out.println(findUnique(new int[]{3, 3, 1, 1, 8, 8, 10, 10, 9, 9, 6, 6, 2, 2, 4, 4}));
        System.out.println(findUnique(new int[]{3, 3, 1, 1, 8, 8, 10, 10, 9, 9, 6, 6, 2, 2, 4}));
        System.out.println(findUnique(new int[]{3, 1, 1, 8, 8, 10, 10, 9, 9, 6, 6, 2, 2, 4, 4}));
    }

    public static int findUnique(int[] arr){
        int l = 1;
        int r = arr.length-2;
        if(arr[l] != arr[l-1]){
            return arr[l-1];
        }
        if(arr[r] != arr[r+1]){
            return arr[r+1];
        }
        while(l<=r){
            int mid = (l+r)/2;
            if(arr[mid] != arr[mid-1] && arr[mid] != arr[mid+1]){
                return arr[mid];
            }else if((mid%2==1 && arr[mid-1] == arr[mid]) || (mid%2==0 && arr[mid] == arr[mid+1])){
                l = mid+1;
            } else if((mid%2==1 && arr[mid] == arr[mid+1]) || (mid%2==0 && arr[mid-1] == arr[mid])){
                r = mid - 1;
            }
        }
        return -1;
    }
}
