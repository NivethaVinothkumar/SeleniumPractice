package com.PomScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DigitalPage extends BasePage{

	public DigitalPage(WebDriver driver) {
		super(driver);
	} 
	
	@FindBy(xpath="//a[contains(text(),'Digital downloads')][1]")
	public WebElement computerLink;

	@FindBy(xpath="//select[@name='products-orderby']")
	 public WebElement sortBy;
	
	@FindBy(xpath="//select[@name='products-pagesize']")
	 public WebElement display;
	
	@FindBy(xpath="//select[@name='products-viewmode']")
	 public WebElement ViewMode;

}
