package Popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class NotificationPopup {
	@Test
	public static void testCase() throws AWTException, InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.lenovo.com/in/en/");
	WebDriverWait w=new WebDriverWait(driver, Duration.ofSeconds(15));
	w.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='Q19940_modal_close']")));
	//driver.findElement(By.xpath("//span[@class='Q19940_modal_close']")).click();
	
	Robot r=new Robot();
	Thread.sleep(2000);
	
	r.keyPress(KeyEvent.VK_TAB);
	r.keyRelease(KeyEvent.VK_TAB);
	
	r.keyPress(KeyEvent.VK_TAB);
	r.keyRelease(KeyEvent.VK_TAB);
	
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	driver.findElement(By.xpath("//span[@class='Q19940_modal_close']")).click();
}
}
