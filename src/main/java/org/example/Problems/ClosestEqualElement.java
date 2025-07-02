package org.example.Problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ClosestEqualElement {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findClosestEqualElement(new int[] {1, 2, 3, 6, 1, 2, 3, 2, 1})));
    }

    public static int[] findClosestEqualElement(int[] arr){
        Map<Integer, Integer> map = new HashMap<>();
        int dist = Integer.MAX_VALUE;
        int ansi = -1;
        int ansj = -1;
        for(int i=0; i<arr.length; i++){
            if(map.containsKey(arr[i])){
                if(dist > i-map.get(arr[i])){
                    dist = i-map.get(arr[i]);
                    ansi = map.get(arr[i]);
                    ansj = i;
                }
                dist = Math.min(dist, i-map.get(arr[i]));
            }
            map.put(arr[i], i);
        }
        return new int[]{ansi, ansj};
    }
}
