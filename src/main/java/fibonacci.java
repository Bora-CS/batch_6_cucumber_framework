import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.poi.xssf.streaming.SXSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class fibonacci {
	public static void main(String[] args) throws IOException {
//		int count = 10;
//		int a = 0, b= 0, c= 1;
//		for (int i = 0; i <= count; i++) {
//			a=b;
//			b=c;
//			c=a+b;
//			
//			System.out.print(a+", ");}
//
////		
////		List<String> list = new ArrayList<String>();
////		list.add("Hello");
////		list.add("what's up");
////		for (String string : list) {
////			System.out.println(string);
////		for (int i =0 ; i<= 10; i++) {
//		System.out.println();
////		System.out.println(Fibonacci(10)+", ");
////		}
//		String text= "bhebbhhh";
//		
//		int coun = 0;
//		
//	char[] arr = text.toCharArray();
//	for (int i = 0; i < arr.length; i++) {
//		for (int j = i+1; j < arr.length; j++) {
//			if (arr[i]== arr[j]) {
////				System.out.println("duplicate carachter is : "+ arr[i]);
//				coun++;
//			}
////			System.out.println("duplicate carachter is : "+ arr[i]);
//			
//		}
//		System.out.println("duplicate carachter is : "+ arr[i]);
//		
//	}
//		
////		int arr[] = { 100,14, 46, 47, 94, 94, 52, 86, 36, 94, 89 };
////        int largest = 0;
////        int secondLargest = 0;
////        
////		for (int i = 0; i < arr.length; i++) {
////			if (arr[i]> largest) {
////				secondLargest=largest;
////				largest= arr[i];
////			}
////			else if (arr[i] > secondLargest)
////            {
////                secondLargest = arr[i];
////            }
////		}System.out.println("Largest = "+largest+" Second Largest = "+ secondLargest);
////	}
////
////	public static int Fibonacci(int n) {
////		
////
////			if (n == 0 || n == 1) {
////				return n;
////			} else {
////				return Fibonacci(n - 1) +Fibonacci(n - 2);
////			}
////		
////		
////
//	}
//	String filePath= "C:\\Users\\bechi\\Downloads\\New Microsoft Excel Worksheet.xlsx";
////	File file= new File(filePath);
//	// get the file from it's location 
//	FileInputStream filee= new FileInputStream(filePath);
//	// navigate to the workbook in the console
//	XSSFWorkbook book= new XSSFWorkbook(filee);
//	//navigate to the sheet
//	XSSFSheet sheet= book.getSheet("Hello");
//	// point on the row
//	XSSFRow rowHugo = sheet.getRow(1);
//	// point on the cell
////	XSSFCell cellHugo = rowHugo.getCell(0);
//	System.out.println("J user name= "+rowHugo.getCell(0) + "J pASSWORD+ "+ rowHugo.getCell(1) );
//	 
////	XSSFRow JonathanUsername= sheet.getRow(1) ;
////	XSSFCell JonathanPassword= JonathanUsername.getCell(1)
////	System.out.println(row.getRowStyl);
//	
//	driver.finelement.sendkeys "rowHugo.getCell(0)"
		
		
		
		HashMap<String, Integer> map= new HashMap<String, Integer>();
		map.put("Anna", 20);
		map.put("Bechir", 29);
		map.put("Hugo", 25);
		
		 Set<Entry<String, Integer>> entries = map.entrySet();
		 for (Entry<String, Integer> entry : entries) {
			System.out.println("Key= "+entry.getKey()+ " Value= "+ entry.getValue());
		}
	}
}
