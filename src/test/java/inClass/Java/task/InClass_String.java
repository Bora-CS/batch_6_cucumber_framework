package inClass.Java.task;

public class InClass_String {
	
	
	/**
	 
	 1.Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end. 
	 	The string length will be at least 2.
	 
			input("Hello") → "lloHe"
			input("java") → "vaja"
			input("Hi") → "Hi"
	 
	 if str.length <3 / <=2  --> return str
	 str.subString(0,2) --> first part
	 str.sbuString(2,str.length()) --> second part
	 
	 
	 
	 2.Given a string of odd length, return a string made of the middle three chars, so the string "strings" yields "rin". 
	 	The string length will be at least 3.

			input("strings") → "rin"
			input("codes") → "ode"
			input("Practices") → "cti"
			
			int startIndex = str.length/2 - 1  --> 2
			int endIndex = str.length/2 + 1    --> 4
			str.subString( 2 , 4+1)   
			

			
	 
	 3.Given a string, return true if it ends in "es".

			input("codes") → true
			input("s") → false
			input("Practice") → false
			
			subString() -> 
			str.subString(    str.length-2     )
			
			
			
	 
	 4.optional
	 	https://codingbat.com/prob/p122943
	 	
	 */
	
	
	
	public static void main(String[] args) {
		String test = "kjashfkaj0";
		String code = "s";
		code.substring(code.length()-2);
		System.out.println();
		
		
		
		
		
		
//		test.subst
	}

}
