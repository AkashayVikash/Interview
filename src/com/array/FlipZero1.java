package com.array;

import java.util.ArrayList;
import java.util.List;

public class FlipZero1 {
    public static void main(String[] args)
    {
        FlipZero1 gfg = new FlipZero1();

        List<Integer> states = new ArrayList<>();

        states.add(0);
        states.add(0);
        states.add(0);
        states.add(0);
        states.add(0);

        List<Integer> targetstates = new ArrayList<>();

        targetstates.add(0);
        targetstates.add(0);//00101,--00100-00111---00000
        targetstates.add(1);//00101, 00010-- 00001--00000
        targetstates.add(0);
        targetstates.add(1);



        System.out.println("The minimum number of switches" +
                " needed are " + gfg.bulbs(targetstates));
    }

    public   int bulbs( List<Integer> states){

        int count=0;
        int result=0;

        for(int i=0;i < states.size();i++)
        {
            //if bulb original state is on and count is even it mean it is on.
            if(states.get(i)==1 && count%2==0 ){

                System.out.println("Index "+i);

                count++;
                result++;
            }
            //It is on , no need to prees the switch
            else if(states.get(i)==0 && count%2!=0 ){

                System.out.println("Index "+i);
                count++;
                result++;

            }

            //need to press the switch
            else if(states.get(i)==1 && count%2!=0 ){

            }
//need to press the switch
            else if(states.get(i)==0 && count%2==0 ){

            }

        }
        return result;
    }
}
