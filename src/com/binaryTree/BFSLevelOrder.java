package com.binaryTree;

public class BFSLevelOrder {


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

    public BFSLevelOrder(){
        root=null;
    }

    public static void main(String[] args) {

        BFSLevelOrder tree = new BFSLevelOrder();
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

        int height= maxheight(root);

        for(int i=0;i< height;i++){
            traversal(root,i);
        }

    }

    public void traversal(Node node,int level){

        if(null== node){
            return;
        }

        if(level==0){
            System.out.print(node.data+" ");
        }

        traversal(node.left,level-1);
        traversal(node.right,level-1);

  }


    public  int maxheight(Node node){

        if(node==null){
            return 0;
        }

        int lheigth= maxheight(node.left);
        int rheight= maxheight(node.right);

        if(lheigth> rheight)
           return  lheigth+1;

        return rheight+1;
    }

}
