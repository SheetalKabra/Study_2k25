package org.example.Util;

public class GetPrefixSum {
    public static int[] find(int[] arr){
        int N = arr.length;
        int[] prefixSum = new int[N];
        prefixSum[0] = arr[0];
        for(int i=1; i<N; i++){
            prefixSum[i] = prefixSum[i-1] + arr[i];
        }
        return prefixSum;
    }
}
