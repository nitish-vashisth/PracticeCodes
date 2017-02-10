
// Program to separate anagrams
// Source : Leet Code
// String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};

import java.util.*;

public class GroupAnagram{

	public static void main(String[] args){

		String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
		
		Map<String,List<String>> al = new LinkedHashMap<String,List<String>>();

		for(int i=0;i<input.length;i++){

			char[] br = input[i].toCharArray();
			Arrays.sort(br);

			List<String> l = al.get(Arrays.toString(br));

			if(l==null)
				al.put(Arrays.toString(br),l=new ArrayList<String>());

				l.add(input[i]);
			
		}

		for(List<String> l:al.values()){
			System.out.println(l);
		}
	}
}
