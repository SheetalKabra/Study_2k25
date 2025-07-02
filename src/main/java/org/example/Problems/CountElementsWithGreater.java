package org.example.Problems;

public class CountElementsWithGreater {
    public static void main(String[] args) {
        System.out.println(countElements(new int[] {-3, -2, 6, 8, 4, 8, 5}));
        System.out.println(countElements(new int[] {8,8,8,8,8,8}));
        System.out.println(countElements(new int[] {1,1,1,1,1,8}));
    }

    public static int countElements(int[] arr){
        int N = arr.length;
        int max = Integer.MIN_VALUE;
        int countMax = 0;
        for(int i=0; i<N; i++){
            max = Math.max(arr[i], max);
        }

        for (int j : arr) {
            if(j == max){
                countMax++;
            }
        }

        return N - countMax;
    }
}
