package org.example.Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class NoOfUniqueElements {
    public static void main(String[] args) {
        System.out.println(noOfUniqueElements(new ArrayList<>(Arrays.asList(6,3,7,3,8,6,9))));
    }

    public static int noOfUniqueElements(ArrayList<Integer> arrayList){
        HashSet<Integer> set = new HashSet<>();
        int N = arrayList.size();
        for(int i=0; i<N; i++){
            set.add(arrayList.get(i));
        }
        return set.size();
    }
}
