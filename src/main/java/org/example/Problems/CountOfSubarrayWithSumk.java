package org.example.Problems;

public class CountOfSubarrayWithSumk {
    public static void main(String[] args) {
        System.out.println(countSubarray(new int[] {15, 2, 5, 1, 8, 6, 5, 10}, 15));
    }

    public static int countSubarray(int[] arr, int k){
        int N = arr.length;
        int count = 0;
        int l = 0;
        int r = 0;
        int sum = arr[l];
        while(r<N){
            if(l>r){
                r=l;
                sum = arr[l];
            }
            if(sum == k){
                count++;
                sum -= arr[l];
                l++;
                r++;
                if(r >= N){
                    break;
                }
                sum += arr[r];
            }else if(sum < k){
                r++;
                if(r >= N){
                    break;
                }
                sum += arr[r];
            }else if(sum > k){
                sum -= arr[l];
                l++;
            }

//            System.out.println("l:"+l+", r:"+r+", sum:"+sum);
        }
        return count;
    }
}
