package com.PomScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ApparelPage extends BasePage{

	public ApparelPage(WebDriver driver) {
		super(driver);
	} 

	@FindBy(xpath="//a[contains(text(),'Apparel & Shoes')][1]")
	public WebElement computerLink;

	@FindBy(xpath="//select[@name='products-orderby']")
	 public WebElement sortBy;
	
	@FindBy(xpath="//select[@name='products-pagesize']")
	 public WebElement display;
	
	@FindBy(xpath="//select[@name='products-viewmode']")
	 public WebElement ViewMode;

}

