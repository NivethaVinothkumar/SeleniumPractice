package Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class NotificationPopupAvoid {
	@Test
	public static void testCase() {
		ChromeOptions obj=new  ChromeOptions();
		obj.addArguments("--disable notifications");
		WebDriver driver=new ChromeDriver(obj);
	   driver.manage().window().maximize();
	    driver.get("https://www.lenovo.com/");
	driver.findElement(By.xpath("//span[@class='Q19940_modal_close']")).click();
}
}
