package org.example.Problems;

public class CountAllPairsWithSubtractK {
    public static void main(String[] args) {
        System.out.println(countallPairs(new int[] {-3, 0, 1, 3, 6, 8, 11, 14, 18, 25}, 5));
    }

    public static int countallPairs(int[] arr, int k){
        int N = arr.length;
        int count = 0;
        int l = N-2;
        int r = N-1;
        while(l >= 0){
            if(arr[r] - arr[l] > k){
                r--;
            }else if(arr[r] -arr[l] < k){
                l--;
            }else if(arr[r] -arr[l] == k){
                count++;
                l--;
                r--;
            }
        }
        return count;
    }
}
