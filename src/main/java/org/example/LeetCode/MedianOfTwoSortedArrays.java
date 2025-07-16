package org.example.LeetCode;

import java.util.Arrays;

public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        System.out.println(findMedianSortedArrays(new int[]{1,2}, new int[]{3,4}));
        System.out.println(findMedianSortedArrays(new int[]{1,2}, new int[]{3}));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2){
        int N = nums1.length;
        int M = nums2.length;
        int[] nums3 = new int[N+M];
        int p1= 0;
        int p2= 0;
        int p3 = 0;
        while(p1<N && p2<M){
            if(nums1[p1] < nums2[p2]){
                nums3[p3] = nums1[p1];
                p1++;
                p3++;
            }else{
                nums3[p3] = nums2[p2];
                p2++;
                p3++;
            }
        }
        while(p1<N){
            nums3[p3] = nums1[p1];
            p1++;
            p3++;
        }

        while(p2<M){
            nums3[p3] = nums2[p2];
            p2++;
            p3++;
        }

        System.out.println(Arrays.toString(nums3));
        int medianIndex = (N+M)/2;
        return (N+M)%2 == 0 ? (double) (nums3[medianIndex] + nums3[medianIndex - 1]) /2: nums3[medianIndex];
    }
}
