package com.array;

public class SubString {

    public static void main(String[] args) {

        String str="abcdefbd";

        String word="bd";

        int minLength= 10;

        String ans="";

        for(int i=0; i< str.length();i++){

           for(int j=i+1;j<=str.length();j++){

               String subtr=str.substring(i,j);

               if(subtr.length()>=word.length()){

                   int p=0, q=0;

                   while(p<subtr.length() && q< word.length()){

                       if(subtr.charAt(p)==word.charAt(q)){
                           p++;
                           q++;
                       }
                       else{
                           p++;
                       }
                   }
                   if(q==word.length() && minLength>subtr.length()){

                       minLength= subtr.length();
                       ans=subtr;

                       System.out.println("Ans: "+ans+" Length :"+ minLength);

                   }

               }



           }

        }


    }
}
