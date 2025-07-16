package org.example.LeetCode;

public class FindPeakElement {
    public static void main(String[] args) {
        System.out.println(findPeakElement(new int[]{1,2,3,1}));
        System.out.println(findPeakElement(new int[]{1,2,1,3,5,6,4}));
        System.out.println(findPeakElement(new int[]{1,2,3}));
        System.out.println(findPeakElement(new int[]{6,5,4,3,2,3,2}));
        System.out.println(findPeakElement(new int[]{3,4,3,2,1}));
    }

    public static int findPeakElement(int[] nums){
        int N = nums.length;
        int l = 0;
        int r = nums.length - 1;
        while(l<=r){
            int mid = (l+r)/2;
            if(mid == 0 && nums[mid] > nums[mid+1]){
                return mid;
            }
            if(mid == nums.length -1 && nums[mid] > nums[mid-1]){
                return mid;
            }
            if(mid-1>= 0 && mid+1 <N &&nums[mid] > nums[mid-1] && nums[mid] > nums[mid+1]){
                return mid;
            }else if(nums[mid] < nums[mid+1]){
                l = mid+1;
            }else if(nums[mid] < nums[mid-1]){
                r = mid-1;
            }else{
                r = mid-1;
            }
        }
        return -1;
    }
}
