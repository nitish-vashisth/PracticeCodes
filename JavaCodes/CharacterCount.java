//String str = "a12b5c900w4a2c1";
public class CharacterCount{

	public static void main(String[] args){
	String str="a12b5c900w4a2c1";

	int[] count= new int[26];

	char[] ch = str.toCharArray();

	int start = 0;

	for(int i=1;i<ch.length;i++){

		int num=0;
		int val2=ch[i];

		while(val2<58 && i<ch.length){
			num = num*10 + (val2-48);
			i++;
			if(i==ch.length)
				break;
			val2=ch[i];
		}
		count[ch[start]-97] = count[ch[start]-97] + num;
		start =i;
	}

	for(int j=0;j<count.length;j++){

		if(count[j]>0){
			int k=97+j;
			System.out.println((char)k + " "+count[j]);
		}
	}
}
}