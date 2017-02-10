// Given an array A[] and a number x, check for pair in A[] with sum as x
import java.util.*;

public class PairSum{

	public static void main(String[] args){

		int[] input = {4,12,45,100,46,1,19,34};

		int sum = 47;

		Arrays.sort(input);

		//System.out.println(Arrays.toString(input));

		int i=0,j=input.length-1,x=0;
		

		while(i<j){
			x=input[i]+input[j];

			if(x==sum){
				System.out.println("The pair is " + input[i] + " " + input[j]);
				break;
			}
			else if(x<sum){
				i++;
			}
			else{
				j--;
			}
		}

	}
}