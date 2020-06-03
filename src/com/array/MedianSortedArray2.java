package com.array;

public class MedianSortedArray2 {

    public static void main(String[] args) {

        int ar1[] = { 1, 2, 3, 6 };
        int ar2[] = { 4, 6, 8, 10 };
        int n1 = ar1.length;
        int n2 = ar2.length;
        if (n1 != n2) {
            System.out.println(
                    "Doesn't work for arrays "
                            + "of unequal size");
        }
        else if (n1 == 0) {
            System.out.println("Arrays are empty.");
        }
        else if (n1 == 1) {
            System.out.println((ar1[0] + ar2[0]) / 2);
        }
        else {
            System.out.println(
                    "Median is "
                            + getMedian(
                            ar1, 0, ar1.length - 1,
                            ar2, 0, ar2.length - 1));
        }
    }

    //I have to calculate the median

    public static int median(int arr[],int start, int end){

        int n=end-start+1;


        if(n%2==0){

            return (arr[start+ n/2]+ arr[start+ n/2-1])/2;
        }
        return arr[start+n/2];
    }

    public static int getMedian(int arr1[],int startA, int endA,int arr2[],int startB, int endB){


        if(endA-startA==2){//after merging arr1 with arr2 , the first element would be Math.min(arr1[0], arr2[0], last  element would be Math.min (arr1[1],arr2[1])   )
            //third and 4th element would be other two
            int median = (Math.max(arr1[0],arr2[0])+Math.min(arr1[1],arr2[1]))/2;
        }

        int m1=median(arr1,startA,endA);

        int m2=median(arr2,startB,endB);

        if (m1 == m2) {
            return m1;
        }

        if(m1<m2){
            return getMedian(arr1,(endA + startA + 1) / 2,endA,arr2,startB,(endB + startB +1) / 2);

        }

        else{

            return getMedian(arr1,startA,(endA + startA+1) / 2,arr2,(endB + startB + 1),endB);

        }


    }



}
