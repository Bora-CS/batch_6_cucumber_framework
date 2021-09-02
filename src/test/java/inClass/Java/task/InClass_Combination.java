package inClass.Java.task;

import java.util.Arrays;

public class InClass_Combination {
	
	public static void main(String[] args) {
		

		public boolean luckyThirteen(int number){
			
			if(Math.abs((number >= 224 && number <= 250) || (number >= 332 && number<=358)));
 
				return true;
			}
		} else { return false;
	}
		
		public boolean isSpecial(int number){
			if(number % 13 == 0 || number+1 % 13 == 0 || number-1 <= 0) {		
				return true;
			}
		}
		
	
		public int AB(int a, int b){
			int sum = a+b;
			if(sum>=8 && sum<=17) {
				 return 20;
			}else {
				return sum;
			}
		}
		
		public int BC(int b, int c){
			int sum = a+b;
			if(sum>=8 && sum<=17)? 20: sum; {
			
		}
		
		public int[] flipIt(int[] intArray ){
	
		int[] intArray = new int[intArray.length()];
			for(i = 0; i <= intArray.length()-2; i++) {
				result[i]= intArray[i+1];
			}
			result [intArray.length -1]= intArray[0];
		}
	
	/** 
		1.Given an integer, return true if it is within 13 of 237 or 345. 
			Note: Math.abs(num) computes the absolute value of a number.
			
		2.We'll say a number is special if it is a multiple of 13 OR if it is one more/less than a multiple of 13. 
			Return true if the given non-negative number is special.
		
		3.Given 2 integer, a and b, return their sum. 
			However, if sums in the range between 8 - 17, then just return 20.
		
		4.Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.

			input([1, 2, 3])  expecting output [2, 3, 1]
			input([5, 11, 9]) expecting output [11, 9, 5]
			input([7, 0, 0])  expecting output [0, 0, 7]
			
			// make a loop and reverse iterate from last dat[i]
			
		5.optional
			https://codingbat.com/prob/p199612
			https://codingbat.com/prob/p138990
	 */
}
