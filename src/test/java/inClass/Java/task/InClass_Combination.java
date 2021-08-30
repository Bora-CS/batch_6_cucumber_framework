package inClass.Java.task;

import java.util.Arrays;

public class InClass_Combination {
	
	/** 
		1.Given an integer, return true if it is within 13 of 237 or 345. 
			Note: Math.abs(num) computes the absolute value of a number.
			
			num -->  num-13 - num+13
			
			i  --> 224 - 250    --> (i>=224 && i<=250)
			i  --> 332 - 358    --> (i>=332 && i<=358)
			-347 --> Math.abs() --> 347
			
			return (i>=224 && i<=250) ||  (i>=332 && i<=358)
			
		2.We'll say a number is special if it is a multiple of 13 OR if it is one more/less than a multiple of 13. 
			Return true if the given non-negative number is special.
		
		13% 13 =0 --> special -> true
		
		27%13 = 1 --> special -> true
		
		25%13 = 12 --> special -> true
		
		
		
		
		3.Given 2 integer, a and b, return their sum. 
			However, if sums in the range between 8 - 17, then just return 20.
		
		int sum = a+b;
		
		if ( sum<=17 && sum >=8) return 20;
		return sum;
		
		return (sum<=17 && sum >=8) ? 20:sum;
		--> if(sum<=17 && sum >=8) {
		    	20
		    }else{
		    	sum
		    }
		
		
		
		4.Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.

			input([1, 2, 3])  expecting output [2, 3, 1]
			input([5, 11, 9]) expecting output [11, 9, 5]
			input([7, 0, 0])  expecting output [0, 0, 7]
			
			int[] result = {  array[1], array[2], array[0]  };
			
			{12,24,34,54,23,43,16,46,24,83}
			
			{24,34,54,23,43,16,46,24,83,12}
			int[] result = new int[  array.length ];
			
			for( int i=0; i< array.length-2; i++){
				result[ i ]= array[ i+1 ] 
			}
			result [ array.length-1] = 	 array[0];
			
			
			
		5.optional
			https://codingbat.com/prob/p199612
			https://codingbat.com/prob/p138990
	 */
	
	
	public static void main(String[] args) {
		
		int[] array = {12,24,34};
		
		int[] result = new int[  array.length ];
		
		for( int i=0; i<= array.length-2; i++){
			result[ i ]= array[ i+1 ]; 
		}
		result [ array.length-1] = 	 array[0];
		
		System.out.println(Arrays.toString(result));
	}
}
