package org.example.Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class PairSum {
    public static void main(String[] args) {
        System.out.println(checkPairSum(new ArrayList<>(Arrays.asList(8,9,1,-2,4,5,11,-6,7,5)), 11));
        System.out.println(checkPairSum(new ArrayList<>(Arrays.asList(8,9,1,-2,4,5,11,-6,7,5)), 6));
        System.out.println(checkPairSum(new ArrayList<>(Arrays.asList(8,9,1,-2,4,5,11,-6,7,5)), 22));
    }

    public static boolean checkPairSum(ArrayList<Integer> arrayList, int k){
        int N = arrayList.size();
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<N; i++){
            if(set.contains(k- arrayList.get(i))){
                return true;
            }else{
                set.add(arrayList.get(i));
            }
        }
        return false;
    }
}
