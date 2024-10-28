package Popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Naukri {
@Test
public static void testCase() {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.naukri.com/");
	driver.findElement(By.xpath("//a[@id='register_Layer']")).click();
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,1000)");
	driver.findElement(By.xpath("(//h2[@class='main-3'])[1]")).click();
	driver.findElement(By.xpath("(//input[@type='file']) [1]")).sendKeys("C:\\Users\\VINOTH\\OneDrive\\Desktop\\DURAI AND CO\\New folder\\19 20 21 WOS.pdf");
}
}
