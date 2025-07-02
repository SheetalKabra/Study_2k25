package org.example.Problems;

public class SearchInSortedMatrix {
    public static void main(String[] args) {
        System.out.println(searchElement(new int[][] {{5,10,15,20}, {6,12,18,24}, {7,14,21,28}, {8,16,24,32}}, 14));
        System.out.println(searchElement(new int[][] {{5,10,15,20}, {6,12,18,24}, {7,14,21,28}, {8,16,24,32}}, 9));

    }

    public static boolean searchElement(int[][] a, int k){
        int N = a.length;
        int M = a[0].length;
        int i = 0;
        int j = M-1;
        while(i<N && j>=0){
            if(a[i][j] > k){
                j--;
            }else if(a[i][j] < k){
                i++;
            }else if(a[i][j] == k){
                return true;
            }
        }
        return false;
    }
}
