package com.PomScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ComputerPage extends BasePage{

	public ComputerPage(WebDriver driver) {
		super(driver);
	} 

	@FindBy(xpath="//a[contains(text(),'Computers')][1]")
	public WebElement computerLink;

	@FindBy(xpath="//select[@name='products-orderby']")
	 public WebElement sortBy;
	
	@FindBy(xpath="//select[@name='products-pagesize']")
	 public WebElement display;
	
	@FindBy(xpath="//select[@name='products-viewmode']")
	 public WebElement ViewMode;
	
	@FindBy(xpath="//img[@alt='Picture for category Desktops']")
	public WebElement desktopLink;
	
	@FindBy(xpath="//a[text()='Build your own cheap computer']")
	public WebElement image1Name;
	
	@FindBy(xpath="//a[text()='Build your own computer']")
	public WebElement image2Name;
	
	@FindBy(xpath="//a[text()='Build your own expensive computer']")
	public WebElement image3Name;
	
	 @FindBy(xpath="//input[@value='Add to cart'][1]")
	 public WebElement addToCart1;
}
