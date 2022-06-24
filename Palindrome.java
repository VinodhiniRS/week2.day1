package week2.day1.assignments;

import java.lang.reflect.Array;

public class Palindrome {
public static void main(String[] args) {
// Declare A String value as"madam"
	String str="madam";
//  Declare another String rev value as ""
	String rev="";
	int length=str.length();
//Iterate over the String in reverse order
	for (int i=length-1; i>=0; i-- )
//Add the char into rev
	{
		rev=rev+str.charAt(i);
	}
//Compare the original String with the reversed String, if it is same then print palinDrome 
	if(str.equalsIgnoreCase(rev))
	{
	System.out.println("The string is palindrome");
	}
	else
	{
		System.out.println("The string is not a palindrome");
	}
}
}