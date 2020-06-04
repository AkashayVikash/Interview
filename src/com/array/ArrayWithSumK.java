package com.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayWithSumK {

    static class Pair{
        int start;
        int end;

        public Pair(int start, int end){
            this.start=start;
            this.end= end;
        }

    }

    //To solve this problem, again I will use the concept of hashmap and array.
    //Map<Integer, List<Integer>> hmap= new HashMap<>();

    //Here key would be the sum galue and value would be the list of Index where we get that sum again.

    public static void main(String[] args) {

        int arr[] = {10, 2, -2, -20, 10};
        List<Pair>  alList=solution(arr,-10);
       // print(alList);
    }

    public static List<Pair> solution(int arr[],int sum){

        int currsum =0;

        Map<Integer, List<Integer>> hmap= new HashMap<>();
        List<Pair> list= new ArrayList<>();

        for(int i=0;i< arr.length; i++){

            currsum= currsum+arr[i];

            if(currsum==sum){
                list.add(new Pair(0,i));
            }

            List<Integer> al;
            int diff=currsum-sum;
            if(hmap.containsKey(diff)){

                al= hmap.get(diff);

                for(int j=0;j< al.size();j++){

                    System.out.println(al.get(j)+1+"--"+i);

                   list.add(new Pair(al.get(j)+1,i));
                }

                al.add(i);

            }
            else {
                al= new ArrayList<>();
                al.add(i);

            }

            hmap.put(diff,al);
        }

        return list;
    }

    public static void print(List<Pair> pairList){

        for(Pair pair: pairList){
            System.out.println(pair.start+"---"+ pair.end);
        }

    }

}
