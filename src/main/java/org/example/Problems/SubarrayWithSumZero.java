package org.example.Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SubarrayWithSumZero {
    public static void main(String[] args) {
        System.out.println(subarrayWithSumZeroExists(new ArrayList<>(Arrays.asList(5,4,-6,1,-2,3,7,10,5))));
        System.out.println(subarrayWithSumZeroExists(new ArrayList<>(Arrays.asList(1,2,3,4,5))));
    }

    public static boolean subarrayWithSumZeroExists(ArrayList<Integer> arrayList){
        int N = arrayList.size();
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> prefixSum = new ArrayList<>();
        prefixSum.add(0, arrayList.get(0));
        map.put(prefixSum.get(0), 1);
        for(int i=1; i<N; i++){
            prefixSum.add(i, prefixSum.get(i-1)+arrayList.get(i));
            if(map.containsKey(prefixSum.get(i))){
                map.put(prefixSum.get(i), map.get(prefixSum.get(i))+1);
            }else{
                map.put(prefixSum.get(i), 1);
            }
        }
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue() > 1){
                return true;
            }
        }
        return false;

    }
}
