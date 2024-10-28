package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.GenericLibrary.Base_Class;
import com.GenericLibrary.Select_Class_Utility;

public class SelectTest extends Base_Class{

@Test
public void testCase() {
	//This is For DemoWebShop App
//		driver.findElement(By.xpath("(//a[contains(text(),'Digital downloads')])[1]")).click();
//		Select_Class_Utility slt=new Select_Class_Utility(driver.findElement(By.id("products-orderby")));
//		slt.index(1);
//		slt.value("https://demowebshop.tricentis.com/digital-downloads?orderby=10");
//		slt.text("Created on");
//		
//		System.out.println(slt.ismultiSelect());
//		
	
	//The below program is for demoapp.skillrally App
		Select_Class_Utility s=new Select_Class_Utility(driver.findElement(By.xpath("//select[@id='cars']")));
		System.out.println(s.isMultiSelect());		
	}

	@Test
	public void testCase1()
	{
		Select_Class_Utility s=new Select_Class_Utility(driver.findElement(By.xpath("//select[@id='cars']")));
		s.index(1);
		s.text("INR 100 - INR 199 ( 16 ) ");
		//System.out.println(s.Firstselected());
		System.out.println(s.allSelected());
	}
	
	@Test
	public void testCase2() throws InterruptedException
	{
		Select_Class_Utility s=new Select_Class_Utility(driver.findElement(By.xpath("//select[@id='cars']")));
		s.index(2);
		Thread.sleep(2000);
		s.deselectIndex(2);
		
	}
	@Test
	public void testCase3()
	{
	WebElement dropD=driver.findElement(By.xpath("//select[@id='cars']"));
		Select_Class_Utility s=new Select_Class_Utility(dropD);
		s.index(0);
		s.value("500");
	List<WebElement>allopt=	s.allSelected();
	for(WebElement opt:allopt)
	{
		System.out.println(opt.getText());
	}
	System.out.println(s.firstSelected().getText());
	}
	
	@Test
	public void testCase4()
	{
		Select_Class_Utility s=new Select_Class_Utility(driver.findElement(By.xpath("//select[@id='cars']")));
		s.index(1);
		s.index(2);
		s.index(4);
		System.out.println(s.firstSelected().getText());
	}
	@Test
	public void testCase5()
	{
		WebElement dd1=driver.findElement(By.xpath("//select[@id='cars']"));
		Select_Class_Utility s=new Select_Class_Utility(dd1);
		
		List<WebElement> options=s.getAllOptions();
		for(WebElement opt1:options)
		{
			System.out.println(opt1.getText());
		}
	}
	@Test
	public void testCase6()
	{
		Select_Class_Utility s=new Select_Class_Utility(driver.findElement(By.xpath("//select[@id='cars']")));
		s.index(1);
		s.index(2);
		s.index(4);
		s.clearAll();
	}
}

