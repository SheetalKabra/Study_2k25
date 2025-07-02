package org.example.Problems;

public class FindPairWithSum {
    public static void main(String[] args) {
        System.out.println(isPairExists(new int[] {3, -2, 1, 4, 3, 6, 9, 8}, 17));
        System.out.println(isPairExists(new int[] {3, -2, 1, 4, 3, 6, 9, 8}, 30));
    }

    public static boolean isPairExists(int[] arr, int k){
        int N = arr.length;
        for(int i=0; i<N; i++){
            for(int j=i+1; j<N; j++){
                if(arr[i] + arr[j] == k){
                    return true;
                }
            }
        }
        return false;
    }
}
