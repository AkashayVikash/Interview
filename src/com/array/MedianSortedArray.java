package com.array;

public class MedianSortedArray {

    public static void main(String[] args) {

        int ar1[] = {1, 12, 15, 26, 38};
        int ar2[] = {2, 13, 17, 30, 45};

        int n1 = ar1.length;
        int n2 = ar2.length;

        System.out.println(getMedian(ar1, ar2, n1, n2));

    }

    public static  int getMedian(int arr1[], int arr2[],int n1, int n2){

        //Problem statement is two sorted array has given, I need to find the median of these two sorted aaray .

        // n1 index would be first median and n1-1 would be
        //I need to traverse till n1
        int m1=-1;
        int m2=-1;


        int i=0;
        int j=0;


        for(int count=0;count < n1; count++){

            if(i==n1){
               m1=m2;
               m2=arr2[0];
               break;

            }

            else if(j== n2){
                m1= m2;
                m2= arr1[0];
                break;
            }


            else if(arr1[i] < arr2[j]){
                m1=m2;
                m2=arr1[i];
                i++;
            }

            else if(arr1[i]> arr2[j]){

                m1=m2;
                m2=arr2[i];
                j++;

            }

        }


        return (m1+m2)/2;
    }
}
