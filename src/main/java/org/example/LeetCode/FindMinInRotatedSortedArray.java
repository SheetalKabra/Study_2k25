package org.example.LeetCode;

public class FindMinInRotatedSortedArray {
    public static void main(String[] args) {
        System.out.println(findMin(new int[]{4,5,6,7,0,1,2}));
        System.out.println(findMin(new int[]{3,4,5,1,2}));
        System.out.println(findMin(new int[]{11,13,15,17}));
//        System.out.println(findMin(new int[]{9,10,11}));
//        System.out.println(findMin(new int[]{11,9,10}));
//        System.out.println(findMin(new int[]{10,11,9}));
//        System.out.println(findMin(new int[]{10,11}));
//        System.out.println(findMin(new int[]{11,10}));
        System.out.println(findMin(new int[]{11}));



    }

    public static int findMin(int[] nums){
        int N = nums.length;
        int l = 0;
        int r = N-1;
        int ans = Integer.MAX_VALUE;
        int count=0;
        while(l<=r){
            int mid = (l+r)/2;
            if(nums[l] <= nums[mid]){ //left half is sorted
                ans = Math.min(ans, nums[l]);
                l = mid+1;
            }else if(nums[l] > nums[mid]){
                ans = Math.min(ans, nums[mid]);
                r = mid-1;
            }

            count++;
            if(count == 4){
                break;
            }
        }

        return ans;
    }
}
