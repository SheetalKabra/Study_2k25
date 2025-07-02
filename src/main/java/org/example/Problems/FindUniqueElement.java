package org.example.Problems;

public class FindUniqueElement {
    public static void main(String[] args) {
        System.out.println(getUniqueElement(new int[] {6,9,6,10,9}));
        System.out.println(getUniqueElement(new int[] {6,9,6,10,9,1,1}));
    }

    public static int getUniqueElement(int[] arr){
        int ans = 0;
        for(int element: arr){
            ans ^= element;
        }
        return ans;
    }
}
