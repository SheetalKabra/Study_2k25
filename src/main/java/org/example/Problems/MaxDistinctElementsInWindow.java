package org.example.Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;


public class MaxDistinctElementsInWindow {
    public static void main(String[] args) {
        System.out.println(findMaxDistictElementsInWindow(new ArrayList<>(Arrays.asList(2,2,3,8,3,9,4,9,4,10)), 4));
    }

    public static int findMaxDistictElementsInWindow(ArrayList<Integer> arrayList, int k){
        int N = arrayList.size();
        int ans = Integer.MIN_VALUE;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<k; i++){
            if(map.containsKey(arrayList.get(i))){
                map.put(arrayList.get(i), map.get(arrayList.get(i))+1);
            }else{
                map.put(arrayList.get(i), 1);
            }
        }
        ans = Math.max(ans, map.size());
        //assume k = 4
        //use sliding window, move one window ahead which is from  1 to 4
        // remove first element from map, and insert next element of window in map.
        for(int i=1; i<=N-k; i++){

            //1. remove elements from hashmap
            if(map.get(arrayList.get(i-1)) > 1){
                map.put(arrayList.get(i-1), map.get(arrayList.get(i-1))-1);
            }else{
                map.remove(arrayList.get(i-1));
            }

            //2. add next element of window in map
            if(map.containsKey(arrayList.get(i+k-1))){
                map.put(arrayList.get(i+k-1), map.get(arrayList.get(i+k-1))+1);
            }else{
                map.put(arrayList.get(i+k-1), 1);
            }
            ans = Math.max(ans, map.size());
        }
        return ans;
    }
}
