package org.example.Problems;

public class CountPairs {
    public static void main(String[] args) {
        System.out.println(countPairsAG(new char[] {'b','a', 'a', 'g', 'd', 'c', 'a', 'g'}));
        System.out.println(countPairsAG(new char[] {'b','a', 'a', 'a', 'd', 'c', 'a', 'a'}));
    }

    public static int countPairsAG(char[] arr){
        int N = arr.length;
        int noOfG = 0;
        int ans = 0;
        for(int i=0; i<N; i++){
            if(arr[i] == 'g' || arr[i] == 'G'){
               noOfG++;
            }
        }
        for(int i=0; i<N; i++){
            if(arr[i] == 'a' || arr[i] == 'A'){
                ans = ans + noOfG;
            }
            if(arr[i] == 'g' || arr[i] == 'G'){
                noOfG--;
            }
        }
        return ans;
    }
}
