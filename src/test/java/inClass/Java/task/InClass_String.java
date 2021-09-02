package inClass.Java.task;

public class InClass_String {
	
	public static void main(String[] args) {
		
		public void rotateLeft(String input){
			if(input.length()>=2) {
				return input;
			}
			input.substring(0,3);
			input.substring(2, input.length());

		}
		
	}
	
	public String middleThree(String input){
		int startIndex = input.length()/2 - 1;
		int endIndex = input.length()/2 + 1;
		input.substring(2, 4+1);
	}
	
	public boolean endsIn(String input) {
		if(input.endsWith("es")) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 
	 1.Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end. 
	 	The string length will be at least 2.
	 
			input("Hello") → "lloHe"
			input("java") → "vaja"
			input("Hi") → "Hi"
	 
	 // separate the first  two chars values
	 // reverse CharArray
	 
	 2.Given a string of odd length, return a string made of the middle three chars, so the string "strings" yields "rin". 
	 	The string length will be at least 3.

			input("strings") → "rin"
			input("codes") → "ode"
			input("Practices") → "cti"
	 
	 3.Given a string, return true if it ends in "es".

			input("codes") → true
			input("s") → false
			input("Practice") → false
	 
	 4.optional
	 	https://codingbat.com/prob/p122943
	 	
	 */

}
