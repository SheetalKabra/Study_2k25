package org.example.Problems;

public class RainWaterTrapped {
    public static void main(String[] args) {
        System.out.println(rainWaterTrapped(new int[] {5,4,1,4,3,2,7}));
    }

    public static int rainWaterTrapped(int[] arr){
        int N = arr.length;
        int[] leftMaxArray = new int[N];
        int[] rightMaxArray = new int[N];
        leftMaxArray[0] = arr[0];
        for(int i=1; i<N; i++){
            leftMaxArray[i] = Math.max(leftMaxArray[i-1], arr[i]);
        }

        rightMaxArray[N-1] = arr[N-1];
        for(int i=N-2; i>=0; i--){
            rightMaxArray[i] = Math.max(rightMaxArray[i+1], arr[i]);
        }

        int ans = 0;
        int max;
        for(int i=1; i<=N-2; i++){
            max = Math.min(leftMaxArray[i-1], rightMaxArray[i+1]);
            if(max > arr[i]){
                ans += max-arr[i];
            }
        }
        return ans;

    }
}
