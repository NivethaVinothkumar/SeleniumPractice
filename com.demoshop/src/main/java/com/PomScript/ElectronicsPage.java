package com.PomScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElectronicsPage extends BasePage{

	public ElectronicsPage(WebDriver driver) {
		super(driver);
	} 

	@FindBy(xpath="//a[contains(text(),'Electronics')][1]")
	public WebElement computerLink;

	@FindBy(xpath="//select[@name='products-orderby']")
	 public WebElement sortBy;
	
	@FindBy(xpath="//select[@name='products-pagesize']")
	 public WebElement display;
	
	@FindBy(xpath="//select[@name='products-viewmode']")
	 public WebElement ViewMode;
	
	@FindBy(xpath="//img[@alt='Picture for category Camera, photo']")
	public WebElement cameraLink;
	
	@FindBy(xpath="//a[text()='1MP 60GB Hard Drive Handycam Camcorder']")
	public WebElement image1Name;
	
	@FindBy(xpath="//a[text()='Camcorder']")
	public WebElement image2Name;
}
