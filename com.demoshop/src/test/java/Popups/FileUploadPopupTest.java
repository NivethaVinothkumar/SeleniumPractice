package Popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileUploadPopupTest {
@Test
public static void testCase() {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://the-internet.herokuapp.com/upload");
	driver.findElement(By.xpath("//input[@id='file-upload']")).sendKeys("C:\\Users\\VINOTH\\OneDrive\\Desktop\\DURAI AND CO\\New folder\\19 20 21 WOS.pdf");
	
	
}
}
