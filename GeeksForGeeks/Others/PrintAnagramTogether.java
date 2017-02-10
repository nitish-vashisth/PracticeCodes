import java.util.*;

class abs{
	int index;
	String su;
}

public class PrintAnagramTogether {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> arr = new ArrayList<String>();
		ArrayList<abs> brr = new ArrayList<abs>();
	
		
		arr.add("cat");
		arr.add("dog");
		arr.add("tac");
		arr.add("god");
		arr.add("act");
		int count = 0;
		for(String a:arr){
			
			char[] ap = a.toCharArray();
			Arrays.sort(ap);
			//System.out.println(ap);
			String s = new String(ap);
			//brr.add(count, s);
			count++;
			//System.out.println("The converted string is : " + s);
		}
		

	}

}