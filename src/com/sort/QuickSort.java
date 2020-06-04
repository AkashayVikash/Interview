package com.sort;

public class QuickSort {

    public void printArray(int arr[]){
        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public void sort(int arr[], int low, int high){

        //To solve the quick sort we need to divide the array in to two array
        //one sorted array and other one as unsorted array.
        // for this I need to take one pivoted point.

        int i,j;

        i=low;
        j=high;
        int pivot= (i+j)/2;

        while(arr[i]<arr[pivot]){
            i++;
        }

        while(arr[j]>arr[pivot]){
            j++;
        }

        if(i<j){
            if(arr[i]<arr[j]){
                swap(arr[i],arr[j]);
            }

        }

        if(i<pivot){
            sort(arr,i,pivot);
        }
        else if(j>pivot){
            sort(arr,pivot,j);

        }

    }

    public void swap(int a, int b){
        int temp=a;
        a=b;
        b=temp;
    }


    public static void main(String args[])
    {
        int arr[] = {10, 7, 8, 9, 1, 5};
        int n = arr.length;

        QuickSort ob = new QuickSort();
        ob.sort(arr, 0, n-1);

        System.out.println("sorted array");
      //  printArray(arr);
    }
}
