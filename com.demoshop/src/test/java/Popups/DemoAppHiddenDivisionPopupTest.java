package Popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class DemoAppHiddenDivisionPopupTest {
@Test
public static void testCase() {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapps.qspiders.com/ui/hidden?sublist=0/");
	WebDriverWait w=new WebDriverWait(driver, Duration.ofSeconds(15));
	w.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@fdprocessedid='uwqwm']")));
	driver.findElement(By.xpath("//button[@fdprocessedid='uwqwm']")).click();
	driver.quit();
	
}
}
