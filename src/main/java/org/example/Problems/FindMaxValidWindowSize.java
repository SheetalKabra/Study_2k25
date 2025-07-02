package org.example.Problems;

public class FindMaxValidWindowSize {
    public static void main(String[] args) {
        System.out.println(findMaxValidWindowSize(new int[] {3, 2, 5, 4, 6, 3, 7, 2}, 20));
        System.out.println(findMaxValidWindowSize(new int[] {3, 2, 5, 4, 6, 3, 7, 2}, 30));
        System.out.println(findMaxValidWindowSize(new int[] {3, 2, 5, 4, 6, 3, 7, 2}, 40));
        System.out.println(findMaxValidWindowSize(new int[] {3, 2, 5, 4, 6, 3, 7, 2}, 10));
        System.out.println(findMaxValidWindowSize(new int[] {3, 2, 5, 4, 6, 3, 7, 2}, 7));
    }

    public static int findMaxValidWindowSize(int[] arr, int B){
        int l = 1;
        int r = arr.length;
        int ans = 0;
        while(l<=r){
            int k = (l+r)/2;
            boolean result = checkSubarraySumLimit(arr, k, B);
//            System.out.println("k:"+k+", result:"+result);
            if(result){
                ans = k;
                l = k+1;
            }else{
                r = k-1;
            }
        }
        return ans;
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
