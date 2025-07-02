package org.example.Problems;

public class ClosestMinMax {
    public static void main(String[] args) {
        System.out.println(closestMinMax(new int[] {1,2,3,1,3,4,6,4,6,3}));
        System.out.println(closestMinMax(new int[] {2,2,6,4,5,1,5,2,6,4,1}));
    }

    public static int closestMinMax(int[] arr){
        int N = arr.length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<N; i++){
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }

        int len = Integer.MAX_VALUE;
        int l=-1, r=0;
        //min->max
        for(int i=0; i<N; i++){
            if(arr[i] == min){
                l = i;
            }
            if(arr[i] == max && l!= -1){
                r = i;
                len = Math.min(len, r-l+1);
            }
        }
        //max->min
        l=-1;
        for(int i=0; i<N; i++){
            if(arr[i] == max){
                l = i;
            }
            if(arr[i] == min && l!= -1){
                r = i;
                len = Math.min(len, r-l+1);
            }
        }
        return len;
    }
}
