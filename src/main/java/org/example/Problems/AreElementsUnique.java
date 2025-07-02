package org.example.Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class AreElementsUnique {
    public static void main(String[] args) {
        System.out.println(areAllElementsUnique(new ArrayList<>(Arrays.asList(1,2,3,4,5))));
        System.out.println(areAllElementsUnique(new ArrayList<>(Arrays.asList(1,2,3,4,5,5))));
    }

    public static boolean areAllElementsUnique(ArrayList<Integer> arrayList){
        HashSet<Integer> set = new HashSet<>();
        set.addAll(arrayList);
        return set.size() == arrayList.size();
    }
}
