package com.bora.helpers;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	public static void main(String[] args) throws IOException {

	XSSFWorkbook workbook = new XSSFWorkbook("C:\\data\\Test.xlsx");
	XSSFSheet sheet = workbook.getSheet("filePath");
	XSSFRow row = sheet.getRow(1);
	XSSFCell cell = row.getCell(2);
	String name = cell.getStringCellValue();
	System.out.println(name);
	}
}
