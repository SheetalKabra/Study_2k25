package org.example.Problems;

import javax.net.ssl.HandshakeCompletedEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class LeftViewOfBinaryTree {
    public static void main(String[] args) {
//        TreeNode<Integer> root = new TreeNode<>(1);
//        root.left = new TreeNode(2);
//        root.left.left = new TreeNode(4);
//        root.left.right = new TreeNode(5);
//        root.left.right.left = new TreeNode(8);
//
//        root.right = new TreeNode(3);
//        root.right.left = new TreeNode(6);
//        root.right.right = new TreeNode(7);


        TreeNode<Integer> root = new TreeNode<>(1);
        root.left = new TreeNode(2);

        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);

        System.out.println(leftView(root));
    }

    public static ArrayList<Integer> leftView(TreeNode root){
        Queue<TreeNode<Integer>> queue = new LinkedList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int N = queue.size();
            for(int i=0; i<N; i++){
                TreeNode<Integer> node = queue.poll();
                if(i == 0){
                    ans.add(node.data);
                }
                if(node.left != null){
                    queue.add(node.left);
                }

                if(node.right != null){
                    queue.add(node.right);
                }
            }
        }
        return ans;
    }
}
