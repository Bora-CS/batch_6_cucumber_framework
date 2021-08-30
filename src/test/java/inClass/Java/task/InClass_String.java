package inClass.Java.task;

import java.util.Arrays;

public class InClass_String {

	/**
	 * 1.Given a string, return a "rotated left 2" version where the first 2 chars
	 * are moved to the end. The string length will be at least 2.
	 * 
	 * input("Hello") → "lloHe" input("java") → "vaja" input("Hi") → "Hi"
	 **/
	public static void main(String[] args) {

		System.out.println(left2Rotated("Hello"));
		System.out.println(left2Rotated("java"));
		System.out.println(left2Rotated("Hi"));
		middleThreeChars("strings");
		middleThreeChars("codes");
		middleThreeChars("Practies");
		System.out.println(endCharEs("Practice"));
		System.out.println(endCharEs("s"));;
		System.out.println(endCharEs("codes"));
	}

//1.
	private static String left2Rotated(String input) {
		if (input.length() <= 2) {
			return input;
		} else {
			return input.substring(2, input.length()) + input.substring(0, 2);

		}

	}

	/**
	 * 2.Given a string of odd length, return a string made of the middle three
	 * chars, so the string "strings" yields "rin". The string length will be at
	 * least 3. input("strings") → "rin" input("codes") → "ode" input("Practices") →
	 * "cti"
	 **/

	public static void middleThreeChars(String str) {

		int len = str.length() / 2;
		if (str.length() % 2 != 0) {
			System.out.println(str.substring(len - 1, len + 2));

		}

	}

	/**
	 * 3.Given a string, return true if it ends in "es". input("codes") → true
	 * input("s") → false input("Practice") → false
	 * @return 
	 */

	private static  boolean endCharEs(String word) {

			return(word.endsWith("es"));
		}
		

	}


/**
 * 4.optional https://codingbat.com/prob/p122943
 * 
 */
