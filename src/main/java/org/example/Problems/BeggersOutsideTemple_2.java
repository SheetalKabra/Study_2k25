package org.example.Problems;

import java.util.Arrays;

public class BeggersOutsideTemple_2 {
    public static void main(String[] args) {
//        System.out.println(Arrays.toString(beggersOutside(new int[]{0, 0, 0, 0, 0, 0, 0}, new int[][]{{2,4,2}})));
        System.out.println(Arrays.toString(beggersOutside(new int[]{0, 0, 0, 0, 0, 0, 0}, new int[][]{{2,4,2},{1,3,1},{0,2,3},{3,5,4}})));
    }

    public static int[] beggersOutside(int[] arr, int[][] queries){
        for(int i=0; i<queries.length; i++){
            arr[queries[i][0]] += queries[i][2];
            arr[queries[i][1]+1] -= queries[i][2];
        }
//        System.out.println(Arrays.toString(arr));
        int[] ans = new int[arr.length];
        ans[0] = arr[0];
        for(int i=1; i<arr.length; i++){
            ans[i] = ans[i-1]+arr[i];
        }
        return ans;
    }
}
