package org.example.Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LongestZeroSumSubarray {
    public static void main(String[] args) {
        System.out.println(findLenghtOfLongestZeroSumSubarray(new ArrayList<>(Arrays.asList(5,4,-6,1,-2,3,7,-10,5))));
        System.out.println(findLenghtOfLongestZeroSumSubarray(new ArrayList<>(Arrays.asList(5,4,-6,1,-2,3,7,3,-10,5))));
    }

    public static int findLenghtOfLongestZeroSumSubarray(ArrayList<Integer> arrayList){
        int N = arrayList.size();
        Map<Integer, ArrayList<Integer>> map = new HashMap<>();
        ArrayList<Integer> prefixSum = new ArrayList<>();
        prefixSum.add(0, arrayList.get(0));
        map.put(prefixSum.get(0), new ArrayList<>(Arrays.asList(0)));

        //creating a prefix sum
        //Also, inserting values in map

        for(int i=1; i<N; i++){
            prefixSum.add(i, prefixSum.get(i-1)+arrayList.get(i));
            if(map.containsKey(prefixSum.get(i))){
                ArrayList<Integer> arr = map.get(prefixSum.get(i));
                arr.add(i);
                map.put(prefixSum.get(i), arr);
            }else{
                map.put(prefixSum.get(i), new ArrayList<>(Arrays.asList(i)));
            }
        }
        //now find the longest substring
        int ans = Integer.MIN_VALUE;
        for(Map.Entry<Integer, ArrayList<Integer>> entry: map.entrySet()){
            if(entry.getValue().size() >= 2){
                int sizeOfArrayList = entry.getValue().size();
                ans = Math.max(ans, entry.getValue().get(sizeOfArrayList-1)- entry.getValue().get(0));
            }
        }
        return ans+1;
    }
}
