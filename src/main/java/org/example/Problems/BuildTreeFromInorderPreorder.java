package org.example.Problems;

import java.util.List;

public class BuildTreeFromInorderPreorder {
    public static void main(String[] args) {
        TreeNode root = buildTree(List.of('D', 'B', 'E', 'A', 'F', 'C'), List.of('A', 'B', 'D', 'E', 'C', 'F'));
        inorder(root);
    }

    public static void inorder(TreeNode root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static TreeNode buildTree(List<Character> inOrder, List<Character> preOrder){
        if(inOrder.isEmpty() && preOrder.isEmpty()){
            return null;
        }
        TreeNode<Character> root = new TreeNode<>(preOrder.get(0));
        int rootIndex = findRootInOrder(inOrder, preOrder.get(0));
        root.left = buildTree(inOrder.subList(0, rootIndex), preOrder.subList(1, rootIndex+1));
        root.right = buildTree(inOrder.subList(rootIndex+1, inOrder.size()), preOrder.subList(rootIndex+1, inOrder.size()));
        return root;
    }

    public static int findRootInOrder(List<Character> inOrder, char c){
        for(int i=0; i<inOrder.size(); i++){
            if(inOrder.get(i) == c){
                return i;
            }
        }
        return -1;
    }
}
