package org.example.LeetCode;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        System.out.println(threesum(new int[] {-1,0,1,2,-1,-4}));
        System.out.println(threesum(new int[] {0,1,1}));
        System.out.println(threesum(new int[] {0,0,0}));
    }

    private static List<List<Integer>> threesum(int[] nums){
        Arrays.sort(nums);
        int N = nums.length;
        Set<List<Integer>> ans = new HashSet<>();
        int k, l, r, sum;
        for(int i=0; i<N; i++){
            k = -nums[i];
            l = i+1;
            r = N-1;
//            System.out.println("i:"+i);
//            System.out.println("k:"+k);
            while(l<r){
                sum = nums[l]+nums[r];
//                System.out.println("l:"+l+", r:"+r+", sum:"+sum);
                if(sum == k){
                    ans.add(new ArrayList<>(Arrays.asList(nums[i], nums[l], nums[r])));
                    l++;
                    r--;
                }else if(sum < k){
                    l++;
                }else{
                    r--;
                }
            }
        }
        return new ArrayList<>(ans);
    }
}
