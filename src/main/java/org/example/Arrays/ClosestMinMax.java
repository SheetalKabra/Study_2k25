package org.example.Arrays;

public class ClosestMinMax {
    public static void main(String[] args) {
        System.out.println(closestMinMax(new int[] {1,2,3,1,3,4,6,4,6,3}));
        System.out.println(closestMinMax(new int[] {2,2,6,4,5,1,5,2,6,4,1}));
    }

    public static int closestMinMax(int arr[]){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int min_index = -1;
        int max_index = -1;
        int ans = Integer.MAX_VALUE;
        int N = arr.length;
        for(int i=0; i<N; i++){
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
        }
        //min->max
        for(int i=0; i<N; i++){
            if(arr[i] == min){
                min_index = i;
            }
            if(arr[i] == max && min_index != -1){
                ans = Math.min(ans, i-min_index);
            }
        }

        //max->min
        for(int i=0; i<N; i++){
            if(arr[i] == max){
                max_index = i;
            }
            if(arr[i] == min && max_index != -1){
                ans = Math.min(ans, i-max_index);
            }
        }

        return ans+1;
    }
}
