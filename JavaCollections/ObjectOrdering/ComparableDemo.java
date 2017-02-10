
// code sorts the elements based on the number of set bits in its binary representation..
// If two number have same no of set bits then they will be compared based on their decimal representation value.
// int[] a = {31,9,12,16,8,5,4,7};
// o/p : 4 8 16 5 9 12 7 31 

import java.util.*;

class Node implements Comparable<Node>{
	int num;
	int bcount;  // binary count

	Node(int num, int bcount){
		this.num = num;
		this.bcount=bcount;
	}

	public int compareTo(Node st){
		if(bcount==st.bcount){
			if(num>=st.num){
				return 1;
			}
			else
				return -1;
		}
		else if(bcount>st.bcount){
			return 1;
		}

		else
			return -1;
	}
}
public class ComparableDemo{

	 public void Find(int[] input){

		List<Node> inputlist = new ArrayList<Node>();

		for(int a:input){
			inputlist.add(new Node(a,Integer.bitCount(a)));
		}

		Collections.sort(inputlist);

		for(Node bl:inputlist){
			System.out.print(bl.num + " ");
		}
	}

	public static void main(String[] args){
		
		code1 obj = new code1();
		int[] input = {31,9,12,16,8,5,4,7};
		obj.Find(input);

	}
}