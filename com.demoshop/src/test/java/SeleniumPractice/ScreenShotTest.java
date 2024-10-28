package SeleniumPractice;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.GenericLibrary.Base_Class;
import com.GenericLibrary.Take_ScreenShot_Utility;

public class ScreenShotTest extends Base_Class {
		@Test 
	
		public void testCase() throws InterruptedException, IOException
		{
		
			driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[3]/diva/div[3]/div[6]/div/div[2]/div[3]/div[2]/input"));
			Take_ScreenShot_Utility.ScreenShotFailure();
		}
		@Test
		public void testCase1() throws IOException
		{
			WebElement element1=driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div[3]/ul/li[2]/a"));
			Take_ScreenShot_Utility.ElementFailure(element1);
		}
	}

