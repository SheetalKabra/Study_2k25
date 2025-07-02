package org.example.Trial;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 10, 6, 15, 2, 12, 8, 7};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }

    public static void mergeSort(int[] a, int l, int r) {
        if (l >= r) return;
        int mid = (l + r) / 2;
        mergeSort(a, l, mid);
        mergeSort(a, mid + 1, r);
        merge(a, l, mid, r);
//        System.out.println(Arrays.toString(a));
    }

    public static void merge(int[] a, int l, int y, int r) {
        int[] temp = new int[r - l + 1];
        int p1 = l;
        int p2 = y;
        int p3 = 0;
        while (p1 < y && p2 <= r) {
            if (a[p1] < a[p2]) {
                temp[p3] = a[p1];
                p1++;
                p3++;
            } else {
                temp[p3] = a[p2];
                p2++;
                p3++;
            }
        }
        while (p1 < y) {
            temp[p3] = a[p1];
            p1++;
            p3++;
        }
        while (p2 <= r) {
            temp[p3] = a[p2];
            p2++;
            p3++;
        }
        for (int i = l; i <= r; i++) {
            a[i] = temp[i - l];
        }
        System.out.println("aaa" + Arrays.toString(a));
    }
}
