package org.example.Problems;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        System.out.println(findMaxConsecutiveOnes(new int[] {0,1,1,1,0,1,1,0,1,1,0,0,1,0}));
        System.out.println(findMaxConsecutiveOnes(new int[] {1,1,1,0,1,1,0,1,1,1,1,0,0,1,1,0,1,1}));
    }

    public static int findMaxConsecutiveOnes(int[] arr){
        int N = arr.length;
        //get prefix sum of ones from left
        int[] pl = new int[N];
        //get prefix sum of ones from right
        int[] pr = new int[N];
        pl[0] = arr[0] == 0 ? 0 : 1;
        pr[N-1] = arr[N-1] == 0 ? 0 : 1;
        for(int i=1; i<N; i++){
           if(arr[i] == 0){
               pl[i] = 0;
           }else{
               pl[i] = pl[i-1] + arr[i];
           }
        }

        for(int i=N-2; i>=0; i--){
            if(arr[i] == 0){
                pr[i] = 0;
            }else{
                pr[i] = pr[i+1] + arr[i];
            }
        }

        int ans = Integer.MIN_VALUE;
        int consOnesLen = 0;
        for(int i=0; i<N; i++){
            if(i == 0){
                consOnesLen = pr[i+1];
            }else if(i == N-1){
                consOnesLen = pl[i-1];
            }else{
                consOnesLen = pl[i-1] + pr[i+1] ;
            }

            ans = Math.max(ans, consOnesLen);
        }
        return ans+1;
    }
}
