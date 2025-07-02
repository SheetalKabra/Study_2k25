package org.example.Trial;

import java.util.*;

public class Altimetrik {
    public static void main(String[] args) {
        System.out.println(checkTriplets(new int[] {-1, 0, 1, 2, -1, -4}));
    }

    public static ArrayList<ArrayList<Integer>> checkTriplets(int[] arr){

        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(-1, 0, 1, 2, -1, -4));
        Collections.sort(A, Collections.reverseOrder());
        int N = arr.length;
        if(arr.length <= 2){
            return new ArrayList<>();
        }
        HashSet<Integer> checkDuplicates = new HashSet<>();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        //[-1, 0, 1, 2, -1, -4]
        for(int i=0; i<N; i++){
            int k = -arr[i];
            HashSet<Integer> set = new HashSet<>();
            for(int j=i+1; j<N; j++){
                if(set.contains(k-arr[j])){
                    if(!checkDuplicates.contains(arr[i]^arr[j]^k-arr[j])){
                        ans.add(new ArrayList<>(Arrays.asList(arr[i], arr[j], k-arr[j])));
                        checkDuplicates.add(arr[i]^arr[j]^k-arr[j]);
                    }
                }else{
                    set.add(arr[j]);
                }
            }
        }
        return ans;
    }


}
