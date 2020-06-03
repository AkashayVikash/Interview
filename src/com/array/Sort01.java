package com.array;

public class Sort01 {

    public static void main(String[] args) {
        int arr[]={0,1,1,0,1,0};

        int i=0;
        int j=arr.length-1;

        while(i<j){

            while(arr[i]==0 && i<j){

                i++;
            }

            while(arr[j]==1 && i<j){

                j--;
            }

           if(i<j){

               arr[i]=0;
               arr[j]=1;
               i++;
               j--;
           }

        }

        for( i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
