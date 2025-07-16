package org.example.LeetCode;

public class SearchInsertPosition {
    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1,3,5,6}, 5));
        System.out.println(searchInsert(new int[]{1,3,5,6}, 2));
        System.out.println(searchInsert(new int[]{1,3,5,6}, 7));
        System.out.println(searchInsert(new int[]{1,3,5,6}, 0));
    }

    public static int searchInsert(int[] nums, int target){
        int ans = -1;
        int l = 0, r = nums.length-1;
        while (l<=r) {
            int mid = (l+r)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                ans = mid;
                l = mid+1;
            }else if(nums[mid] > target){
                r=mid-1;
            }
        }
        return ans+1;
    }
}
