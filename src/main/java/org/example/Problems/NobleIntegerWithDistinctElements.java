package org.example.Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NobleIntegerWithDistinctElements {
    public static void main(String[] args) {
        System.out.println(countNobleInteger(new ArrayList<>(Arrays.asList(1,-5,3,5,-10,4))));
        System.out.println(countNobleInteger(new ArrayList<>(Arrays.asList(1,-5,1,2,3,5,-10,4))));
    }

    public static int countNobleInteger(ArrayList<Integer> arrayList){
        Collections.sort(arrayList);
        int count = 0;
        for(int i=0; i<arrayList.size(); i++){
            count = arrayList.get(i) == i ? count+1 : count;
        }
        return count;
    }
}
