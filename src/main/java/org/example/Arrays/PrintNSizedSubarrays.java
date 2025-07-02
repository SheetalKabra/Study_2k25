package org.example.Arrays;

public class PrintNSizedSubarrays {
    public static void main(String[] args) {
        printAllSubarrays(new int[] {4,1,0,3});
    }

    public static void printAllSubarrays(int[] arr){
        int N = arr.length;
        for(int s=0; s<N; s++){
            for(int e=s; e<N; e++){
                for(int k=s; k<=e; k++){
                    System.out.print(arr[k] + ", ");
                }
                System.out.println();
            }
        }
    }
}
