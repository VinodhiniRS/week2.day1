package week2.day1.assignments;

public class ReverseEvenWords {
	public static void main(String[] args) {
		    String test = "I am a software tester";
			String[] splittedString = test.split(" ");
			String newRevString = "";

			for (int i = 0; i < splittedString.length; i++) {
				if(i%2 != 0) {
					String temp = splittedString[i];
					StringBuffer reverse = new StringBuffer(temp).reverse();
					newRevString = newRevString + reverse;
				} else {
					newRevString = newRevString + splittedString[i];
				} 
				newRevString = newRevString + " ";
			}  
			System.out.println(newRevString);
		}	
}

