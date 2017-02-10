import java.util.*;

public class Misc{

	public static void main(String[] args) {

		// For Converting number in String to Integer

		String s = "1234";
		int ee = Integer.parseInt(s);
		System.out.println("The converted string in intger form : " + ee);

		// Split function in java

		String str = "Today is beautiful day !!!";
		String[] sp = str.split(" ");
		for(String a:sp)
			System.out.println(a);
	}
}