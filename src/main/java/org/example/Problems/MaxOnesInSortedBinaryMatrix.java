package org.example.Problems;

public class MaxOnesInSortedBinaryMatrix {
    public static void main(String[] args) {
        System.out.println(countMaxOnes(new int[][] {{0,0,0,1,1}, {0,0,0,0,1}, {0,0,1,1,1}, {0,0,0,0,1}, {0,0,0,1,1}}));
        System.out.println(countMaxOnes(new int[][] {{0,0,0,1,1}, {0,0,0,0,1}, {0,1,1,1,1}, {0,0,0,0,1}, {0,0,0,1,1}}));
        System.out.println(countMaxOnes(new int[][] {{0,0,0,1,1}, {0,0,0,0,1}, {0,1,1,1,1}, {0,0,0,0,1}, {1,1,1,1,1}}));
    }

    public static int countMaxOnes(int[][] a){
        int N = a.length;
        int M = a[0].length;
        int i = 0;
        int j = M-1;
        int count = 0;
        while(i < N && j >= 0){
            if(a[i][j] == 1){
                count++;
                j--;
            }else{
                i++;
            }
        }
        return count;
    }
}
