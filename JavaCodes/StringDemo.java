// This shows how StringBUilder Works in java
// StringBuilder Vs StringBUffers
/*
StringBuffer is the thread safe utility class to perform several operations on Strings. 
It contains append() and insert() methods that are widely used to perform operation 
on Strings in a multi-thread environment. Most of its 
functions are synchronized for thread safety.

Since most of the String operations, for example concatenation happens in a single thread environment, 
Java 1.5 introduced another utility class StringBuilder to perform similar operations but doesn’t provide 
thread safety. All the methods are unsynchronized.

*/


import java.io.*;

class StingDemo{

	public static void main(String[] args){

	StringBuilder br = new StringBuilder("12321");
	String org = br.toString();
	br.reverse();

	String rev = br.toString();

	System.out.println(rev);

	if(org.equals(rev)){
		System.out.println("Palindrome");
	}


}

}
