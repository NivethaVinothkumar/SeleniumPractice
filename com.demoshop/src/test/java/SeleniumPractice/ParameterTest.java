package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParameterTest {
@Test
public static void testCase() {
	String url=System.getProperty("url");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(url);
	System.out.println(driver.getTitle());
	}
}
