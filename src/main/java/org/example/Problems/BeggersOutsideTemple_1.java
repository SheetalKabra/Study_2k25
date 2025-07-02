package org.example.Problems;

import java.util.Arrays;

public class BeggersOutsideTemple_1 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(beggersOutside(new int[]{0, 0, 0, 0, 0, 0, 0}, new int[][]{{1, 3}, {4, 2}, {2, 1}, {1, -1}, {0, 5}})));
    }

    public static int[] beggersOutside(int[] a, int[][] queries){
        for(int i=0; i<queries.length; i++){
            a[queries[i][0]] += queries[i][1];
        }
        System.out.println(Arrays.toString(a));
        int[] ans = new int[a.length];
        ans[0] = a[0];
        for(int i=1; i<a.length; i++){
            ans[i] = ans[i-1]+a[i];
        }
        return ans;
    }
}
