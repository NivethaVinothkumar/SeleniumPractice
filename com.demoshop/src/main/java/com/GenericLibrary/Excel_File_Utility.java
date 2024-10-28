package com.GenericLibrary;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * @author VINOTH
 */
public class Excel_File_Utility  extends WebDriver_Utility {
	
	/**
	 * This Method is used to fetch the single data from Excel Sheet
	 * @param sheetName
	 * @param row
	 * @param column
	 * @return
	 * @throws IOException
	 */
		public static String excelData(String sheetName,int row,int column) throws IOException {
		fis=new FileInputStream(Iconstant.excel_FilePath);
		workbook=WorkbookFactory.create(fis);
		Sheet s=workbook.getSheet(sheetName);
		Row r=s.getRow(row);
		Cell c=r.getCell(column);
		String result=c.getStringCellValue();
		return result;
	}
	
	/**
	 * Thjs method is used to return the total number of rows
	 * @param sheetName
	 * @return
	 * @throws IOException
	 */
	public static int rowSize(String sheetName) throws IOException {
		fis=new FileInputStream(Iconstant.excel_FilePath);
		workbook=WorkbookFactory.create(fis);
		Sheet s=workbook.getSheet(sheetName);
		return s.getPhysicalNumberOfRows();	
	}
	
	/**
	 * Thjs method is used to return the total number of columns
	 * @param sheetName
	 * @return
	 * @throws IOException
	 */	
	public static int columnSize(String sheetName) throws IOException {
		fis=new FileInputStream(Iconstant.excel_FilePath);
		workbook=WorkbookFactory.create(fis);
		Sheet s=workbook.getSheet(sheetName);
		Row r=s.getRow(0);
		return r.getPhysicalNumberOfCells();	
	}
	
	/**
	 * Thjs method is used to fetch all the data in the excel sheet it will display the address of object[][]
	 * @param sheetName
	 * @return 
	 * @return
	 * @throws IOException
	 */	
	public static Object[][] excelAllData(String sheetName) throws IOException {
		fis=new FileInputStream(Iconstant.excel_FilePath);
		workbook=WorkbookFactory.create(fis);
		Sheet s=workbook.getSheet(sheetName);
		Object[][] data=new Object[rowSize(sheetName)][columnSize(sheetName)];
		for(int i=0;i<rowSize(sheetName);i++) {
			for(int j=0;j<columnSize(sheetName);j++) {
				data[i][j]=s.getRow(i).getCell(j).getStringCellValue();
			}
		}
		return data;
	}
	
	
}
