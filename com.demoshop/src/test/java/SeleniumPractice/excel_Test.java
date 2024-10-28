package SeleniumPractice;

import java.io.IOException;

import org.testng.annotations.Test;

import com.GenericLibrary.Excel_File_Utility;


public class excel_Test {

	@Test
	public static void testCase() throws IOException {
	System.out.println(Excel_File_Utility.excelData("Sheet1",0,0));	
	System.out.println(Excel_File_Utility.rowSize("Sheet2"));
	System.out.println(Excel_File_Utility.columnSize("Sheet3"));
	System.out.println(Excel_File_Utility.excelAllData("Sheet3"));
	}
	
}
