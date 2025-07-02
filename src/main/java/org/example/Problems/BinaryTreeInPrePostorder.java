package org.example.Problems;
public class BinaryTreeInPrePostorder {
    public static void main(String[] args) {
        TreeNode root = new TreeNode<Integer>(15);
        root.left = new TreeNode(9);
        root.left.left = new TreeNode(10);
        root.left.left.right = new TreeNode(17);

        root.right = new TreeNode(8);
        root.right.left = new TreeNode(19);
        root.right.left.left = new TreeNode(14);
        root.right.left.right = new TreeNode(25);

        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(20);

        System.out.print("Inorder: ");inorder(root);
        System.out.println("");
        System.out.print("Preorder: ");preorder(root);
        System.out.println("");
        System.out.print("Postorder: ");postorder(root);

    }

    public static void inorder(TreeNode root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+ " ");
        inorder(root.right);
    }

    public static void preorder(TreeNode root){
        if(root == null){
            return;
        }
        System.out.print(root.data+ " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void postorder(TreeNode root){
        if(root == null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+ " ");
    }



}
