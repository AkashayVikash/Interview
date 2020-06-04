package com.dynamicProgramming;

public class MinimumCoinRequired {

//minimu no of coins require to get the sum

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int K=11;

        int row=arr.length;
        int col=K+1;
        solution(arr,row,col);
    }

    public static void solution(int arr[],int row, int col){

        int dp [][]= new int [row][col];


        for(int i=0;i<row;i++){
            for (int j=0;j<col;j++){

                if(j==0){
                    dp[i][j]=0;
                }

                else if(i>=j){
                  dp[i][j]=dp[i-1][j];
                }
                else{
                    dp[i][j]= dp[i][j-arr[i]]+1;
                }
                System.out.print(dp[i][j]+"   ");
            }
            System.out.println();
        }

    }

}
