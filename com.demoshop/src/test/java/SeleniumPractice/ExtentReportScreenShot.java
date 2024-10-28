package SeleniumPractice;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportScreenShot {
	@Test
	public static void testCase() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		TakesScreenshot ts=(TakesScreenshot)driver;
		 ExtentSparkReporter spark=new ExtentSparkReporter("C:\\Users\\VINOTH\\eclipse-workspace\\Selenium\\com.demoshop\\ExtentReport\\Report.html");
		 ExtentReports report=new ExtentReports();
		 report.attachReporter(spark);
		 ExtentTest test=report.createTest("testCase");
		 test.log(Status.PASS,"File has been attached");
		 test.addScreenCaptureFromBase64String(ts.getScreenshotAs(OutputType.BASE64),"ScreenShot Captured");
		 report.flush();
		 
		 
	 }
}
