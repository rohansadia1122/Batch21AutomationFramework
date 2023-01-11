package com.batch21.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	public static FileInputStream fileInputStream;
	public static XSSFWorkbook wb;
	public static XSSFSheet ws;
	public static XSSFRow row;
	public static XSSFCell cell;
	
	
	
	public static int getRowCount(String Xlfile, String Xlsheet) throws Exception {
		
		fileInputStream= new FileInputStream(Xlfile);
		wb= new XSSFWorkbook(fileInputStream);
		ws= wb.getSheet(Xlsheet);
		int rowcount = ws.getLastRowNum();
		wb.close();
		fileInputStream.close();
		return rowcount;
	}

	public static int getCellCount(String Xlfile, String Xlsheet, int rownum) throws Exception {
		fileInputStream= new FileInputStream(Xlfile);
		wb= new XSSFWorkbook(fileInputStream);
		ws= wb.getSheet(Xlsheet);
		row=ws.getRow(rownum);
		int cellcount = row.getLastCellNum();
		wb.close();
		fileInputStream.close();
		return cellcount;
	}

	public static String getCelldata(String Xlfile, String Xlsheet, int rownum, int column) throws Exception {
		fileInputStream= new FileInputStream(Xlfile);
		wb= new XSSFWorkbook(fileInputStream);
		ws= wb.getSheet(Xlsheet);
		row=ws.getRow(rownum);
		cell=row.getCell(column);
		
		String data;
		
		try {
			DataFormatter formatter= new DataFormatter();
			String cellData=formatter.formatCellValue(cell);
			return cellData;
		} catch (Exception e) {
			data="";
		}
		wb.close();
		fileInputStream.close();
		return data;
		
		
	}

}
