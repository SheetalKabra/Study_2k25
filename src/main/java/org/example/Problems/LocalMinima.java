package org.example.Problems;

public class LocalMinima {
    public static void main(String[] args) {
        System.out.println(localMinima(new int[]{9, 8, 7, 6, 5, 4, 1, 5} ));
    }

    public static int localMinima(int[] arr){
        int l = 1;
        int r = arr.length-2;
        while(l<=r){
            int mid = (l+r)/2;
            if(arr[mid] < arr[mid-1] && arr[mid] < arr[mid+1]){
                return arr[mid];
            }else if(arr[mid] > arr[mid-1]){
                r = mid-1;
            }else if(arr[mid] > arr[mid+1]){
                l = mid+1;
            }else if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]){
                r = mid-1;
            }
        }
        return -1;
    }
}
