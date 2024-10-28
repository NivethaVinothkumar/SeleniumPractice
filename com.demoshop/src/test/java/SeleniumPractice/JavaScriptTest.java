package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.GenericLibrary.Base_Class;
import com.GenericLibrary.JavaScript_Executor_Utility;

public class JavaScriptTest extends Base_Class{
	@Test
	
public void testCase() throws InterruptedException {
	
	JavaScript_Executor_Utility.scrollBottomWebPage();		
	Thread.sleep(3000);
	JavaScript_Executor_Utility.scrollTopWebPage();
	WebElement element=driver.findElement(By.xpath("//div[text()='Careers']"));
	JavaScript_Executor_Utility.scrollToWebElement(element);
	Thread.sleep(2000);
}
}
