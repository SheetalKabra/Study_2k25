package org.example.Problems;

public class LeadersInArray {
    public static void main(String[] args) {
        System.out.println(countLeaders(new int[] {15,-1,7,2,5,4,2,3}));
        System.out.println(countLeaders(new int[] {10,7,9,3,2,4}));
        System.out.println(countLeaders(new int[] {8,-2,4,7,6,5,1}));
    }

    public static int countLeaders(int[] arr){
        int N = arr.length;
        int ans = 1;
        int max = arr[N-1];
        for(int i=N-2; i>=0; i--){
            if(arr[i] > max){
                max = arr[i];
                ans++;
            }
        }
        return ans;
    }
}
