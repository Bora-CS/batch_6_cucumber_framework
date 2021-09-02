package stepDefinition;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TestClass {

	public static void main(String[] args) {

		
		String[] y = {"1","2","15","-7","300"};
		Arrays.sort(y);
		System.out.println(Arrays.toString(y));
		
		System.out.println(revers("code"));
	}
	
	public static String revers(String text) {
		if(text.length()<=1) {
			return text;
		}
		String fs = text.substring(0,1);
		String ls = text.substring(1);
		
		return revers(ls)+fs;
	}

//	public static String LongestEvenLengthWord(String input) {
//		String noSuccess = "00";
//		if (input.equals(null) || input.length() == 1) {
//			return noSuccess;
//		}
//
//		int count = 0, max = 0, lastIndex = 0;
//		for (int i = 0; i < input.length(); i++) {
//			if (input[i] == ' ') {
//				if (count % 2 == 0) {
//					if (count > max) {
//						max = count;
//						lastIndex = i;
//					}
//
//					count = 0;
//				} else {
//					count = 0;
//				}
//			} else {
//				count++;
//			}
//		}
//
//		if (max == 0) {
//			return count % 2 == 0 ? input.SubString(input.Length() - count, count) : noSuccess;
//		}
//
//		return input.substring(lastIndex - max, max);
//	}

}
