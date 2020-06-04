package com.string;

public class LongestCommonSubsequence {



    public static void main(String[] args) {

        //LongestCommonSubsequence lcs = new LongestCommonSubsequence();
        String s1 = "AGGTAB";
        String s2 = "GXTXAYB";

        System.out.println(solution(s1,s2));

    }
    //ans is “GTAB” of length 4.


    public static  int solution(String str1, String str2){

        if(str1.length()==0 || str2.length()==0)
            return 0;


        int length1= str1.length();
        int length2= str2.length();

        int dp[][]= new int [length1+1][length2+1];

        for(int i=0;i<=length1;i++) {
            for (int j = 0; j <= length2; j++) {

                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                }

                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                }

                dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);

            }

        }


        return dp[length1][length2];
    }

}
