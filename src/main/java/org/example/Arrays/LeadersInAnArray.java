package org.example.Arrays;

public class LeadersInAnArray {
    public static void main(String[] args) {
        System.out.println(leaderInAnArray(new int[] {15, -1, 7, 2, 5, 4, 2, 3}));
        System.out.println(leaderInAnArray(new int[] {10, 7, 9, 3, 2, 4}));
        System.out.println(leaderInAnArray(new int[] {8, -2, 4, 7, 6, 5, 1 }));
        System.out.println(leaderInAnArray(new int[] {1, 2, 3, 4, 5}));
        System.out.println(leaderInAnArray(new int[] {5, 4, 3, 2, 1}));
    }

    public static int leaderInAnArray(int[] arr){
        int N = arr.length;
        int max = arr[N-1];
        int leadersCount = 1;
        for(int i=N-2; i>=0; i--){
            if(arr[i] > max){
                leadersCount++;
                max = arr[i];
            }
        }
        return leadersCount;
    }
}
