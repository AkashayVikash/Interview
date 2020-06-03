package com.array;

public class PermutaionOfString {

    //To solve the problem of permutation , we need two string one string on which we will perform the operation
    //and the other string on which I will do


    public static void permtate(String word, String str){
        //We need to write the base condition
        if(str.isEmpty()){
            System.out.println(word);
        }

        for(int i=0; i< str.length();i++){
            permtate(word+str.charAt(i),str.substring(0,i)+str.substring(i+1, str.length()));
        }


    }

    public static void main(String[] args) {
         permtate("","ABC");

    }
}
//"ABC"

//"ABC" ,"ACB" ,"BAC" , "BCA","CAB" , "CBA"