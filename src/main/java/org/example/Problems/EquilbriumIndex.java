package org.example.Problems;

import org.example.Util.GetPrefixSum;

public class EquilbriumIndex {
    public static void main(String[] args) {
        System.out.println(countEqIndex(new int[] {-3,2,4,-1}));
        System.out.println(countEqIndex(new int[] {-7,1,5,2,-4,3,0}));
    }

    public static int countEqIndex(int[] arr){
        int N = arr.length;
        int[] prefixSum = GetPrefixSum.find(arr);
        int count = 0;
        int l = 0;
        int r = 0;
        for(int i=0;i<N;i++){
            l = (i==0) ? 0 : prefixSum[i-1];
            r = prefixSum[N-1] - prefixSum[i];
            count = (l==r) ? count+1 : count;
        }

        return count;
    }
}
