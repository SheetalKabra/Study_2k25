package org.example.Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MinCostToRemoveAllElements {
    public static void main(String[] args) {
        System.out.println(minCostToRemoveAllElements(new ArrayList<>(Arrays.asList(4,2,6,1,5))));
        System.out.println(minCostToRemoveAllElements(new ArrayList<>(Arrays.asList(2,1,4))));
    }

    public static int minCostToRemoveAllElements(ArrayList<Integer> arrayList){
        Collections.sort(arrayList, Collections.reverseOrder());
        //or
//        arrayList.sort(Collections.reverseOrder());
        int cost = 0;
        for(int i=0; i<arrayList.size(); i++){
            cost += (i+1)*arrayList.get(i);
        }
        return cost;

    }
}
