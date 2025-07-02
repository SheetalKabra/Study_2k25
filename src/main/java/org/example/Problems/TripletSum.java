package org.example.Problems;

public class TripletSum {
    public static void main(String[] args) {
        System.out.println(countTripletPairs(new int[]{-8, -4, -3, -1, 2, 3, 5, 7, 9}, 14));
    }

    public static int countTripletPairs(int[] arr, int k){
        int N = arr.length;
        int count = 0;
        for(int i=0; i<arr.length; i++){
            count += countPairs(i+1, N-1, arr, k-arr[i]);
        }
        return count;
    }

    public static int countPairs(int l, int r, int[] arr, int k){
        int sum = 0;
        int count = 0;
        while(l<=r){
            sum = arr[l]+arr[r];
            if(sum < k){
                l++;
            }else if(sum > k){
                r--;
            }else if(sum == k){
                count++;
                l++;
                r--;
            }
        }
        return count;
    }
}
