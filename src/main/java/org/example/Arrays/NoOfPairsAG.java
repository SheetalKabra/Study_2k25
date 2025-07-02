package org.example.Arrays;

public class NoOfPairsAG {
    public static void main(String[] args) {
        System.out.println(countPairs(new char[] {'b', 'a', 'a', 'g', 'd', 'c', 'a', 'g'}));
        System.out.println(countPairs(new char[] {'b', 'q', 'q', 'g', 'd', 'c', 'a', 'g'}));
        System.out.println(countPairs(new char[] {'b', 'q', 'q', 'g', 'd', 'c', 'q', 'g'}));
        System.out.println(countPairs(new char[] {'b', 'a', 'a', 'a', 'd', 'c', 'q', 'a'}));
        System.out.println(countPairs(new char[] {'g', 'g', 'a', 'a', 'd', 'c', 'q', 'a'}));
        System.out.println(countPairs(new char[] {'c', 'k', 'a', 'l', 'e', 'g', 'a', 'a','a', 'm'}));
    }

    public static int countPairs(char[] arr){
        int countG = 0;
        int ans =0;
        for(int i=0; i< arr.length; i++){
            if(arr[i] == 'g' || arr[i] == 'G'){
                countG++;
            }
        }
        for(int i=0; i< arr.length; i++){
            if(arr[i] == 'a' || arr[i] == 'A'){
                ans += countG;
            }
            if(arr[i] == 'g' || arr[i] == 'G'){
                countG--;
            }
        }
        return ans;
    }
}
