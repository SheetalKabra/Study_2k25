package org.example.Problems;

import java.util.ArrayList;
import java.util.Arrays;

public class SortArrBasedOnNoOfFactors {
    public static void main(String[] args) {
        System.out.println(sortBasedOnFactors(new ArrayList<>(Arrays.asList(9,3,4,8,16,37,6))));
    }

    public static ArrayList<Integer> sortBasedOnFactors(ArrayList<Integer> arrayList){
        arrayList.sort(SortArrBasedOnNoOfFactors::compare);
        return arrayList;
    }

    public static int compare(int a, int b){
        int factorsA = noOfFactors(a);
        int factorsB = noOfFactors(b);
        if(factorsA > factorsB){
            return 1;
        }else if(factorsA == factorsB){
            if(a == b){
                return 0;
            }
            if(a > b){
                return 1;
            }else{
                return -1;
            }
        }else {
            return -1;
        }
    }

    public static int noOfFactors(int n){
        int count = 0;
        for(int i=1; i<=n; i++){
            if(n%i == 0){
                count++;
            }
        }
        return count;
    }
}
