package org.example.Trial;

import java.util.Arrays;

public class RearrangeArray {
    public static void main(String[] args) {
        rearrange(new int[]{10, 3, 8, 15, 6, 12, 2, 18, 7, 1});
    }

    public static int[] rearrange(int[] a){
        int p1 = 1;
        int p2 = a.length-1;
        while(p1 <= p2){
            if(a[p1] <= a[0]){
                p1++;
            }else if(a[p2] > a[0]){
                p2--;
            }else{
                int temp = a[p1];
                a[p1] = a[p2];
                a[p2] = temp;
                p1++;
                p2--;
            }
        }
        //swap(arr[0], arr[p2]);
        int temp = a[0];
        a[0] = a[p2];
        a[p2] = temp;

        System.out.println("r:"+p2);
        System.out.println(Arrays.toString(a));
        return a;
    }


}
