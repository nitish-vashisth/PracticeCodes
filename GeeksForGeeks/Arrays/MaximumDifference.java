
//Maximum difference between two elements such that larger element appears after the smaller number
// max(aj-ai) such that i<j
//updated

public class MaximumDifference{

	public static void main(String[] args){

		int[] input = {2,3,1,10,6,4,8};

		int i=0,j=1,diff=0,maxdiff=0;

		while(j<input.length){

			while((j<input.length) && (input[i]<input[j])){

				diff = input[j]-input[i];

				if(diff>maxdiff)
					maxdiff=diff;

				j++;
			}

			if(j<input.length){
				i=j; j++;
			}
		}

		System.out.println("Max difference is " + maxdiff);
	}
}
