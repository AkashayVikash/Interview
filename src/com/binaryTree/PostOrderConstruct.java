package com.binaryTree;

/*
  Problem:  In this problem, in order and pre order of a tree is given , I have to construct post order of tree
 */
/*
 Solution: The first element of pre order is root of the tree, end element if right most leaf
           first element of post order is left most leaf of tree, end element is root
           first element of In order is left most element , end element will be right most tree
           We find the root element in In order , all element which are on left side of tree are left sb tree
           all the element which are on the right of root are right sub tree.

           first I will print the right sub tree and then  I will print the right subtree and then root

*/


public class PostOrderConstruct {

    static int preIndex=0;

    public static void main(String args[])
    {
        int in1[] = { 4, 2, 5, 1, 3, 6 };
        int pre[] = { 1, 2, 4, 5, 3, 6 };
        int n = in1.length;
        System.out.println("Postorder traversal " );
        printPostOrder(in1, pre, 0,n-1);
    }

    //Write a program to find the root element from the in []
    public static int search(int in [], int value, int start , int end){

        for(int i=start;i<= end;i++){

            if(value == in[i]){
                return  i;
            }
        }
        return 0;
    }

    public static void printPostOrder(int in[], int pre[], int start, int end){

        if(start>end){
            return;// It means we reached at the root print it
        }

       int index= search(in,pre[preIndex++],start,end);

        //left subtree
        printPostOrder(in, pre, start, index-1);

        //right subtree
        printPostOrder(in,pre,index+1,end);


        System.out.println(in[index]);


    }

}
