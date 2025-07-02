package org.example.Problems;

public class CountAllPairsWithSumK {
    public static void main(String[] args) {
        System.out.println(countAllPairs(new int[]{-3, 0, 1, 3, 6, 8, 11, 14, 18, 25}, 17));
        System.out.println(countAllPairs(new int[]{-3, 0, 1, 3, 6, 8, 11, 14, 18, 25}, 20));
        System.out.println(countAllPairs(new int[]{-3, 0, 1, 3, 6, 8, 11, 14, 18, 25}, 30));
    }

    public static int countAllPairs(int[] arr, int k){
        int l = 0;
        int r = arr.length-1;
        int sum = 0;
        int count =0;
        while (l<=r){
            sum = arr[l] + arr[r];
            if(sum > k){
                r--;
            }else if(sum < k){
                l++;
            }else if(sum  == k){
                count++;
                l++;
                r--;
            }
        }
        return count;
    }
}
