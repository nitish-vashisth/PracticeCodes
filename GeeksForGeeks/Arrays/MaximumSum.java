/*

Maximum sum such that no two elements are adjacent

http://www.geeksforgeeks.org/maximum-sum-such-that-no-two-elements-are-adjacent/

*/

import java.util.*;

class MaximumSum{
   
    public static void main(String[] args){ // par[]ameter

           int[] inp = {5,  5, 10, 40, 50, 35};

           int inc = inp[0];
           int exc  = 0;
           int max=0;

           for(int i=1;i<inp.length;i++){

                max = (inc>exc) ? inc : exc;

                inc = exc + inp[i];
                exc = max; 
           }

           max = (inc>exc) ? inc : exc;
           System.out.println(max);

    }
}