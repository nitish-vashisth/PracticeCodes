package stockBuySell;
import java.util.*;
// v2
public class StockSpanProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {100, 80, 60, 70, 60, 75, 85};
		int[] si = new int[a.length];
		int i=0;
		
		Stack<Integer> s = new Stack<Integer>();
		
		s.push(0);
		si[0] = 1;
		for(i=i;i<si.length;i++){
					int x = s.peek();
			while(!s.isEmpty() && a[x]<=a[i]){
					s.pop();
					if(!s.isEmpty())
						x = s.peek();
			}
		
			si[i] = (s.empty())?(i+1) : (i-x);
			s.push(i);
		}
		
		for(i=0;i<si.length;i++)
			System.out.print(si[i] + " ");

	}

}
