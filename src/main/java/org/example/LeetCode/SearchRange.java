package org.example.LeetCode;

import java.util.Arrays;

public class SearchRange {
    public static void main(String[] args) {
//        System.out.println(Arrays.toString(searchRange(new int[]{1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 5, 5, 6}, 2)));
//        System.out.println(Arrays.toString(searchRange(new int[]{1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 5, 5, 6}, 1)));
//        System.out.println(Arrays.toString(searchRange(new int[]{1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 5, 5, 6}, 3)));
//        System.out.println(Arrays.toString(searchRange(new int[]{1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 5, 5, 6}, 4)));
//        System.out.println(Arrays.toString(searchRange(new int[]{1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 5, 5, 6}, 5)));
//        System.out.println(Arrays.toString(searchRange(new int[]{1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 5, 5, 6}, 6)));
//        System.out.println(Arrays.toString(searchRange(new int[]{5,7,7,8,8,10}, 6)));
        System.out.println(Arrays.toString(searchRange(new int[]{}, 0)));
        System.out.println(Arrays.toString(searchRange(new int[]{1,2,2,2,2}, 2)));
    }

    public static int[] searchRange(int[] nums, int target){
        int N = nums.length;
        int l = 0;
        int r = N-1;
        int ansl = -1;
        int ansr = -1;
        int pos = -1;

        if(l>=0 && l<N && r>=0 && r<N){
            while(l<=r){
                int mid = (l+r)/2;
                if(nums[mid] == target){
                    pos = mid;
                    break;
                }else if(nums[mid] > target){
                    r = mid-1;
                }else{
                    l = mid+1;
                }
            }
        }


        l = 0;
        r = pos;
        if(l>=0 && l<N && r>=0 && r<N) {
            while (l <= r) {
                int mid = (l + r) / 2;
                if (nums[mid] == target) {
                    ansl = mid;
                    r = mid - 1;
                } else if (nums[mid] > target) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            }
        }

        l = pos;
        r = N-1;
        if(l>=0 && l<N && r>=0 && r<N){
            while(l<=r){
                int mid = (l+r)/2;
                if(nums[mid] == target){
                    ansr = mid;
                    l = mid+1;
                }else if(nums[mid] > target){
                    r = mid-1;
                }else{
                    l = mid+1;
                }
            }
        }

        return new int[]{ansl, ansr};
    }
}
