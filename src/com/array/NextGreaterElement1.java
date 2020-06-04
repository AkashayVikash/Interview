package com.array;

public class NextGreaterElement1 {

    public static void main(String[] args) {
        int arr[]= {11, 13, 21, 3};
        int arr1[]={4, 5, 2, 25};
        int n = arr.length;
        printNGE(arr, n);
    }

    public static void printNGE(int arr[], int n){

        for(int i=0;i< n;i++){

            int next=-1;
            for(int j=i+1;j<n;j++){

                if(arr[j]>arr[i]){
                   next= arr[j];
                    break;
                }

            }

            System.out.println("Next greater for "+ arr[i]+" is  "+ next);
        }
    }
}
