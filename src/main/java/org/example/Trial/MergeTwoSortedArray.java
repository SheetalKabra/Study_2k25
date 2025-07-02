package org.example.Trial;

import java.util.Arrays;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(merge(new int[]{2, 5, 7, 12, 20, 24, 29}, new int[]{6, 9, 10, 14, 15, 19})));
    }

    public static int[] merge(int[] a, int[] b){
        int N = a.length;
        int M = b.length;
        int l1 = 0;
        int l2 = 0;
        int[] newArr = new int[N+M];
        int len = Math.min(N, M);
        int maxlen = Math.max(N, M);
        int ind = 0;
        while(l1<len && l2<len){
            if(a[l1] < b[l2]){
                newArr[ind] = a[l1];
                l1++;
            }else{
                newArr[ind] = b[l2];
                l2++;
            }
            ind++;
        }

        if(N>M){
            for(int i=l1; i<N; i++){
                newArr[ind] = a[i];
                ind++;
            }
        }else{
            for(int i=l2; i<M; i++){
                newArr[ind] = b[i];
                ind++;
            }
        }
        System.out.println(Arrays.toString(newArr));
        return newArr;
    }
}
