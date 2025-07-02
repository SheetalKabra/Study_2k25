package org.example.Problems;

public class CheckSubarraySumLimit {
    public static void main(String[] args) {
        System.out.println(checkSubarraySumLimit(new int[]{3, 2, 5, 4, 6, 3, 7, 2}, 4, 20));
        System.out.println(checkSubarraySumLimit(new int[]{3, 2, 5, 4, 6, 3, 7, 2}, 4, 14));
    }

    public static boolean checkSubarraySumLimit(int[] arr, int k, int B){
        int sum = 0;
        for(int i=0; i<k; i++){
            sum += arr[i];
        }
        if(sum > B){
            return false;
        }
        for(int i=k; i<arr.length; i++){
            sum -= arr[i-k];
            sum += arr[i];
            if(sum > B){
                return false;
            }
        }
        return true;
    }
}
