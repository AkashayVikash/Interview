package com.binaryTree;

public class DFSTraversal {

    static class Node{
        int data;
        Node left;
        Node right;

        public  Node(int data){
            this.data= data;
            this.left=null;
            this.right=null;

        }
    }

    Node root;

    public DFSTraversal(){
        root=null;
    }

    public void inOrder(Node node){

        if(null == node)
            return;

        inOrder(node.left);
        System.out.print(node.data+"  ");
        inOrder(node.right);

    }

    public void preOrder(Node node){

        //firts root

        if(node==null){
            return;
        }
         System.out.print(node.data+"  ");
        preOrder(node.left);
        preOrder(node.right);

    }

    public void postOrder(Node node){

        if(node==null){
            return;
        }
        //left right root
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data+"  ");


    }


    public static void main(String[] args) {


        DFSTraversal tree = new DFSTraversal();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.right = new Node(6);

        System.out.print ("InOrder traversal of a tree :");
        tree.inOrder(tree.root);
        System.out.println();
        System.out.print("PreOrder traversal of a tree :");
        tree.preOrder(tree.root);
        System.out.println();
        System.out.print("PostOrder traversal of a tree :");
        tree.postOrder(tree.root);


    }
}
