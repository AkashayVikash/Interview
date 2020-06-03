package com.array;

public class MedianArray2 {


    public static void main(String[] args) {

        int arr1[] = { 1, 2, 3, 6 };
        int arr2[] = { 4, 6, 8, 10 };

        int n1=arr1.length;

        int n2= arr2.length;

        if(n1!=n2){

            System.out.println("We can not find the median");

        }
        else{
            if(n1==0){}

            else if(n1==1){

                System.out.println((arr1[0]+arr2[0])/2);
            }
            else{

                System.out.println(getMedian(arr1,0,n1-1,arr2,0,n2-1));
            }

        }


    }

    static int getMedian(int arr1[], int startA, int endA , int arr2[], int startB, int endB){

        int n= endA- startA+1;

        if(n==2){

            return (Math.max(arr1[startA],arr2[startB])+ Math.min(arr1[endA], arr2[endB]))/2;

        }

        int m1= median(arr1,startA, endA);

        int m2= median(arr2, startB, endB);

         if(m1==m2){
            return m1;
        }

        else if(m1< m2){

            if(n%2==0)
                return getMedian(arr1,n/2,endA , arr2,startB,n/2-1);
            return getMedian(arr1,n/2+1, endA ,arr2,startB, n/2);

        }

        else{

            if(n%2==0)
                return getMedian(arr2,n/2,endB , arr1,startA,n/2-1);

            return getMedian(arr2,n/2+1, endB ,arr1,startA, n/2);
        }

    }

    static  int median(int arr[], int start, int end){

        int n=end-start+1;

        if(n%2==0){

            return (arr[start+n/2]+arr[start+n/2-1])/2;
        }
        return  arr[start+n/2];

    }

}
