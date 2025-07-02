package org.example.Problems;

public class FindSqRootOfPositiveIntegers {
    public static void main(String[] args) {
        System.out.println(findSqRoot(18));
        System.out.println(findSqRoot(62));
        System.out.println(findSqRoot(64));
        System.out.println(findSqRoot(1));
        System.out.println(findSqRoot(2));
        System.out.println(findSqRoot(3));
        System.out.println(findSqRoot(4));
    }

    public static int findSqRoot(int k){
        int l = 1;
        int r = k/2;
        int ans = 1;
        while(l<=r){
            int mid = (l+r)/2;
            if(mid*mid > k){
                r = mid-1;
            }else if(mid*mid < k){
                ans = mid;
                l = mid+1;
            }else if(mid*mid == k){
                return mid;
            }
        }
        return ans;
    }
}
