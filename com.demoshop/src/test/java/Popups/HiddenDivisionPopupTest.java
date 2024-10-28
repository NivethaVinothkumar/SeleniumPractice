package Popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class HiddenDivisionPopupTest {
@Test
public static void testCase() throws InterruptedException {
	
	//ChromeOptions notification=new ChromeOptions();
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.woodenstreet.com/");
	Thread.sleep(10000);
	WebElement closePopup=driver.findElement(By.xpath("//div[@id='loginclose1']"));
	Thread.sleep(2000);
	closePopup.click();
	driver.quit();
	
 //OR the below method we are using WebDriverWait method for  wait time it will wait until the condition is satisfied if it is found before that time it will skip 
	
	WebDriver driver1=new ChromeDriver();
	driver1.manage().window().maximize();
	driver.get("https://www.woodenstreet.com/");
	WebDriverWait w=new WebDriverWait(driver1, Duration.ofSeconds(15));
	w.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='loginclose1']")));
	driver1.findElement(By.xpath("//div[@id='loginclose1']")).click();
	driver1.quit();
}
}
