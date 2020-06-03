import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class pair{

    int first;
    int last;

    public pair(int first, int last){
        this.first=first;
        this.last=last;
    }
}

public class SumWithZeroArray {

    //To solve this problem I have to use the concept of hashpmap and
    //I need a pair of index to show the start index and end index.

    // I will start iterating from o index and will last till end of the array, if I find any value in hashmap it means
    // that , there is a zero from the map value index to the current index.


    public static void main(String[] args) {
     int arr[]= {6, 3, -1, -3, 4, -2, 2,
                4, 6, -12, -7};

        Map<Integer, List<Integer>> hmap= new HashMap<>();


        //Create a list of pair to store the start and end index.
        List<pair> pairList = new ArrayList<>();

        List<Integer> sumList= new ArrayList<>();

        int sum=0;
        for(int i=0;i< arr.length;i++){

            sum=+arr[i];

            //here I will the pair of start of the array to the point where I get the sum as 0.
            if(sum==0){

                pairList.add(new pair(0,i));
            }


            if(hmap.containsKey(arr[i])){
                sumList=hmap.get(i);

                for( i=0;i< sumList.size();i++){



                }


                //It mean we found a zero value, now the time to craete the pair
            }
            else{
                sumList.add(i);
                hmap.put(sum,sumList);//I want to store all the index point where I get a specific sum
            }
     }



    }





}
