package week2.day1.assignments;

public class FindTypes {
	public static void main(String[] args) {
// Here is the input
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
// Here is what the count you need to find
		int  letter = 0, space = 0, num = 0, specialChar = 0;
//  Convert the String to character array
		char[] ch = test.toCharArray();
// Traverse through each character (using loop)
		for (int i=0;i<ch.length;i++)
		{
// Find if the given character is what type using (if)
			if(Character.isLetter(ch[i])==true)
				letter++;
			else if(Character.isDigit(ch[i])==true)
				num++;
			else if(Character.isWhitespace(ch[i])==true)
				space++;
			else
				specialChar++;
}		
//// Print the count here
		System.out.println("Letters="+letter);
		System.out.println("Numbers="+num);
		System.out.println("Spaces="+space);
		System.out.println("SpecialCharacters="+specialChar);
}
}
	