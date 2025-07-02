package org.example.Problems;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
    public static void main(String[] args) {
        TreeNode<Integer> root = new TreeNode<>(15);
        root.left = new TreeNode(9);
        root.left.left = new TreeNode(10);
        root.left.left.right = new TreeNode(17);

        root.right = new TreeNode(8);
        root.right.left = new TreeNode(19);
        root.right.left.left = new TreeNode(14);
        root.right.left.right = new TreeNode(25);

        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(20);
        System.out.println(levelOrderTraversal(root));
    }

    public static ArrayList<Integer> levelOrderTraversal(TreeNode<Integer> root){
        ArrayList<Integer> levelOrderList = new ArrayList<>();
        Queue<TreeNode<Integer>> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode<Integer> node = queue.poll();
            levelOrderList.add(node.data);
            if(node.left != null){
                queue.add(node.left);
            }
            if(node.right != null){
                queue.add(node.right);
            }
        }
        return levelOrderList;
    }
}
