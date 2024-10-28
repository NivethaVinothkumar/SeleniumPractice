package SeleniumPractice;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport {
 @Test
 public static void testCase() {
	 ExtentSparkReporter spark=new ExtentSparkReporter("C:\\Users\\VINOTH\\eclipse-workspace\\Selenium\\com.demoshop\\ExtentReport\\Report.html");
	 ExtentReports report=new ExtentReports();
	 report.attachReporter(spark);
	 ExtentTest test=report.createTest("testCase");
	 test.log(Status.PASS,"File has been attached");
	 report.flush();
	 
	 
 }
}
