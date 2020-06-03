package com.array;

import java.util.ArrayList;
import java.util.List;

public class FlipZero {

    public int bulbs(ArrayList<Integer> a, List<List<Integer>> sol)
    {
        // To keep track of switch presses so far
        int count = 0;

        List<Integer> b = new ArrayList<>();

        b=a;

        System.out.println(b);


        System.out.println("Start processing---");

        int res = 0;
        for (int i = 0; i < a.size(); i++)
        {
	            /* if the bulb's original state is on and count
	               is even, it is currently on...*/
            /* no need to press this switch */


            if (a.get(i) == 1 && count%2 == 0)
            {
                System.out.println("I am goint to execute 1st block");
                b.set(i,a.get(i));
            }



	            /* If the bulb's original state is off and count
	               is odd, it is currently on...*/
                /* no need to press this switch */
            else if(a.get(i) == 0 && count%2 != 0)
            {
                System.out.println("I am goint to execute 2nd block");
                b.set(i,a.get(i));
            }

	            /* if the bulb's original state is on and count
	               is odd, it is currently off...*/
	            /* Press this switch to on the bulb and increase
	               the count */
            else if (a.get(i) == 1 && count%2 != 0)
            {
                System.out.println("I am goint to execute 3rd block");
                b.set(i,1);
                res++;
                count++;
            }

	            /* if the bulb's original state is off and
	               count is even, it is currently off...*/
	            /* press this switch to on the bulb and
	               increase the count */
            else if (a.get(i) == 0 && count%2 == 0)
            {
                System.out.println("I am goint to execute 4th block");
                b.set(i,1);
                res++;
                count++;
            }

            System.out.println(b);
        }
        return res;
    }

    // Driver code
    public static void main(String[] args)
    {
        FlipZero gfg = new FlipZero();

        ArrayList<Integer> states = new ArrayList<Integer>();

        List<List<Integer>> solList = new ArrayList<>();

        states.add(0);
        states.add(1);
        states.add(0);
        states.add(1);

        System.out.println("The minimum number of switches" +
                " needed are " + gfg.bulbs(states,solList));
    }


}

