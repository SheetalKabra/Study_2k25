package org.example.LeetCode;

public class SearchInRotatedSortedarray {
    public static void main(String[] args) {
        System.out.println(search(new int[]{4,5,6,7,0,1,2}, 0));
        System.out.println(search(new int[]{4,5,6,7,0,1,2}, 3));
        System.out.println(search(new int[]{1}, 0));
        System.out.println(search(new int[]{1,2,3}, 3));
        System.out.println(search(new int[]{3,1}, 0));
        System.out.println(search(new int[]{5,1,2,3,4}, 4));
    }

    public static int search(int[] nums, int target){
        int N = nums.length;
        if(N == 1){
            if(nums[0] == target){
                return 0;
            }else{
                return -1;
            }
        }
        if(N == 2){
            if(nums[0] == target){
                return 0;
            }else if(nums[1] == target){
                return 1;
            }else {
                return -1;
            }
        }
        int l = 0, r = N-1;
        int findIndexOfSortedArray = -1;
        while(l<=r){
            int mid = (l+r)/2;
            if(nums[mid] == target){
                return mid;
            }
            if(mid == N-1){
                if(nums[mid] > nums[mid-1]){
                    findIndexOfSortedArray = -1;
                }else{
                    findIndexOfSortedArray = mid;
                }

                break;
            }
            if(mid == 0){
                if(nums[mid] < nums[mid+1]){
                    findIndexOfSortedArray = -1;
                }else{
                    findIndexOfSortedArray = mid;
                }
                break;
            }
            if(nums[mid] > nums[mid-1] && nums[mid] > nums[mid+1]){
                findIndexOfSortedArray = mid;
                break;
            }else if(nums[mid] < nums[mid-1] && nums[mid] < nums[mid+1]){
                findIndexOfSortedArray = mid-1;
                break;
            }else if(nums[mid] < nums[mid+1] && nums[0] > nums[mid] ){
                r = mid-1;
            }else{
                l = mid+1;
            }
        }

        l = 0;
        r = findIndexOfSortedArray == -1 ? N-1 : findIndexOfSortedArray;

        int mid = getInteger(nums, target, l, r);
        if (mid != -1) return mid;


        if(findIndexOfSortedArray != -1){
            l = findIndexOfSortedArray+1;
            r = nums.length-1;

            int mid1 = getInteger(nums, target, l, r);
            if (mid1 != -1) return mid1;
        }


        return -1;

    }

    private static int getInteger(int[] nums, int target, int l, int r) {
        while(l <= r){
            int mid = (l + r)/2;
            if(nums[mid] < target){
                l = mid+1;
            }else if(nums[mid] > target){
                r = mid-1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
