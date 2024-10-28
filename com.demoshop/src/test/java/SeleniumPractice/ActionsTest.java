package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.GenericLibrary.Action_Class_Utility;
import com.GenericLibrary.Base_Class;

public class ActionsTest extends Base_Class {
	
	@Test
	public void tesCase() {
		
		Action_Class_Utility a=new Action_Class_Utility(driver);
		WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Computers')][1]"));
		a.moveCursor(element).rightClick();
		
	}

}
