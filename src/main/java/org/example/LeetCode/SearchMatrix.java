package org.example.LeetCode;

public class SearchMatrix {
    public static void main(String[] args) {
        System.out.println(searchMatrix(new int[][]{{1,3,5,7}, {10,11,16,20}, {23,30,34,60}}, 13));
        System.out.println(searchMatrix(new int[][]{{1,3,5,7}, {10,11,16,20}, {23,30,34,60}}, 3));
        System.out.println(searchMatrix(new int[][]{{1,3,5,7}, {10,11,16,20}, {23,30,34,60}}, 23));
        System.out.println(searchMatrix(new int[][]{{1,3,5,7}, {10,11,16,20}, {23,30,34,60}}, 10));
        System.out.println(searchMatrix(new int[][]{{1,3,5,7}, {10,11,16,20}, {23,30,34,60}}, 30));
        System.out.println(searchMatrix(new int[][]{{1,3,5,7}, {10,11,16,20}, {23,30,34,60}}, 16));
        System.out.println(searchMatrix(new int[][]{{1,3,5,7}, {10,11,16,20}, {23,30,34,60}}, 1));
    }

    public static boolean searchMatrix(int[][] matrix, int target){
        int N = matrix.length;
        int M = matrix[0].length;
        int row = 0;
        int col = M-1;
        while(row>=0 && row<N && col>=0 && col<M){
            if(matrix[row][col] == target){
                return true;
            }else if(matrix[row][col] < target){
                row++;
            }else{
                col--;
            }
        }
        return false;
    }
}
