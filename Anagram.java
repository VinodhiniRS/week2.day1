package week2.day1.assignments;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
// Declare a String 
		String text1 = "stops";
// Declare another String 
		String text2 = "potss";
// Check length of the strings are same then (Use A Condition)
		System.out.println("String Length is:"+text1.length());
		System.out.println("String Length is:"+text2.length());
		if(text1.length()==text2.length()){
		System.out.println("String Length is Same");	
// Convert both Strings in to characters
		char[] str1 = text1.toCharArray();
		char[] str2 = text2.toCharArray();
// Sort Both the arrays
		Arrays.sort(str1);
		Arrays.sort(str2);
// Check both the arrays has same value		
		if(Arrays.equals(str1, str2)) {
		System.out.println("Anagram");
		}
		else
		{
		System.out.println("Not Anagram");
}
}
}
}
