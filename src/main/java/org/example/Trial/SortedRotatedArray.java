package org.example.Trial;

import java.util.ArrayList;
import java.util.Arrays;

public class SortedRotatedArray {
    public static void main(String[] args) {
//        System.out.println(getPivotIndex(new ArrayList<>(Arrays.asList(0,1,2,4,5,6,7))));
//        System.out.println(getPivotIndex(new ArrayList<>(Arrays.asList(7,0,1,2,4,5,6))));
//        System.out.println(getPivotIndex(new ArrayList<>(Arrays.asList(6,7,0,1,2,4,5))));
//        System.out.println(getPivotIndex(new ArrayList<>(Arrays.asList(5,6,7,0,1,2,4))));
//        System.out.println(getPivotIndex(new ArrayList<>(Arrays.asList(4,5,6,7,0,1,2))));
//        System.out.println(getPivotIndex(new ArrayList<>(Arrays.asList(2,4,5,6,7,0,1))));
//        System.out.println(getPivotIndex(new ArrayList<>(Arrays.asList(1,2,4,5,6,7,0))));
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(6,7,0,1,2,4,5));
        int element = 6;
        int pivotIndex = getPivotIndex(A);
        if(A.get(pivotIndex) == element){
            System.out.println("pivotIndex:"+pivotIndex);
            return;
        }
        int isFound = binarySearch(A, element, 0, pivotIndex);
        if(isFound != -1){
            System.out.println("pivotIndex:" + isFound);
            return;
        }else{
            System.out.println(binarySearch(A, element, pivotIndex+1, A.size()-1));
            return;
        }

    }

    public static int binarySearch(ArrayList<Integer> a, int element, int l, int r){
        int mid;
        while(l<=r){
            mid = (l+r)/2;
            if(a.get(mid) > element){
                r = mid-1;
            }else if(a.get(mid) < element){
                l = mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }

    public static int getPivotIndex(ArrayList<Integer> a){
        int N = a.size();
        if(a.get(0) > a.get(1)){
            return 0;
        }
        for(int i=1; i<N-1; i++){
            if(a.get(i) > a.get(i-1) && a.get(i) > a.get(i+1)){
                return i;
            }
        }
        return -1;
    }
}
