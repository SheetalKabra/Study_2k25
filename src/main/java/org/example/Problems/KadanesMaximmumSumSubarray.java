package org.example.Problems;

public class KadanesMaximmumSumSubarray {
    public static void main(String[] args) {
        System.out.println(maxSumSubarray(new int[] {-2,-3,4,-1,-2,1,5,-3}));
        System.out.println(maxSumSubarray(new int[] {-2,-3,4,-1,-2,-1,5,-3}));
    }

    public static int maxSumSubarray(int[] a){
        int sum = 0;
        int ans = 0;
        for(int i=0; i<a.length; i++){
            sum += a[i];
            ans = Math.max(sum, ans);
            if(sum < 0){
                sum = 0;
            }
        }
        return ans;
    }
}
