package com.PomScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BooksPage  extends BasePage{

	public BooksPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//a[contains(text(),'Books')][1]")
	public WebElement bookLink;
	
	@FindBy(xpath="//select[@name='products-orderby']")
	 public WebElement sortBy;
	
	@FindBy(xpath="//select[@name='products-pagesize']")
	 public WebElement display;
	
	@FindBy(xpath="//select[@name='products-viewmode']")
	 public WebElement ViewMode;

   @FindBy(xpath="//a[contains(text(),'Computing and Internet')][1]")
   public WebElement image1Name;
   
   @FindBy(xpath="//a[text()='Fiction']")
   public WebElement image3Name;
   
   @FindBy(xpath="//a[text()='Health Book']")
   public WebElement image5Name;
   
   @FindBy(xpath="//input[@value='Add to cart'][1]")
   public WebElement addToCart1;

 
 
}

