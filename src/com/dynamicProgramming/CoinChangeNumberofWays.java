package com.dynamicProgramming;

public class CoinChangeNumberofWays {



    public static void main(String[] args) {

        int N=4;

        int arr[]={1,2,3};

        int length=arr.length;

        solutuon(arr,arr.length+1,N+1);

    }

    public static void print(int dp[][]){

        for(int i=0;i<dp.length;i++){
           for(int j=0;j< dp[0].length;j++){
               System.out.print(dp[i][j]+"  ");
           }
            System.out.println();
        }
    }


    public static void solutuon(int arr[], int rowLength, int colLength){

        int dp[][]= new int[rowLength][colLength];


        dp[0][0]=1;
        for(int p=0;p<rowLength;p++){
            for (int q=0;q< colLength;q++){

               if(p==0 && q!=0){
                   dp[p][q]=0;
               }

               else if(p>q){
                 //  System.out.print(p+"  "+q);
                   dp[p][q]= dp[p-1][q];
               }

               else if(p<=q && p!=0 && q!=0 ){

                   dp[p][q]= dp[p-1][q]+(dp[p][q-p]);
               }


                System.out.print(dp[p][q]+"   ");
            }
            System.out.println();
        }



       //  print(dp);
    }
}
