package SeleniumPractice;

import java.io.IOException;

import com.GenericLibrary.Property_File_Utility;

public class property_Test
{
	public static void main(String[] args) throws IOException {
		System.out.println(Property_File_Utility.propertyData("url"));
	}
	
}
