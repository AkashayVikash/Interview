package com.binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class BFSQueue {

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

    public BFSQueue(){
        root=null;
    }

    public static void main(String[] args) {

        BFSQueue tree = new BFSQueue();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        tree.levelOrderTravesal();

    }

    public void levelOrderTravesal(){

        Queue<Node> queue= new LinkedList<>();

        queue.add(root);

        while(!queue.isEmpty()){

            Node node= queue.poll();
            System.out.print(node.data+" ");

            if(null!=node.left){
              queue.add(node.left);
            }

            if(null != node.right)
                queue.add(node.right);


        }
    }
}
