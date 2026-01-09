package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import constant.Constant;

public class ExcelUtility { // excel read

	static FileInputStream f;// to get details from the file
	static XSSFWorkbook wb;// to get details from the workbook to build the class
	static XSSFSheet sh; // to get details from the sheet

	public static String getStringData(int a, int b, String sheet) throws IOException {
		String filepath = Constant.TESTDATAFILE; // constant variable from constant class.
		f = new FileInputStream(filepath);
		wb = new XSSFWorkbook(f);// workbook
		sh = wb.getSheet(sheet); // variable name sheet from method
		XSSFRow r = sh.getRow(a);// to get details from the row
		XSSFCell c = r.getCell(b);// to get details from the cell
		return c.getStringCellValue();// to get details from the string value
	}

	public static String getIntegerData(int a, int b) throws IOException {
		String filepath = Constant.TESTDATAFILE;
		f = new FileInputStream(filepath);
		wb = new XSSFWorkbook(f);// workbook
		sh = wb.getSheet("sheet1"); // sheet
		XSSFRow r = sh.getRow(a);// to get details from the row
		XSSFCell c = r.getCell(b);// to get details from the cell
		int x = (int) c.getNumericCellValue();
		return String.valueOf(x); // to get details from the string value
	}

	public static String getFloatData(int a, int b) throws IOException {
		String filepath = Constant.TESTDATAFILE;
		f = new FileInputStream(filepath);
		wb = new XSSFWorkbook(f);// workbook
		sh = wb.getSheet("sheet1"); // sheet
		XSSFRow r = sh.getRow(a);// to get details from the row
		XSSFCell c = r.getCell(b);// to get details from the cell
		float x = (float) c.getNumericCellValue();
		return String.valueOf(x); // to get details from the string value
	}
}
