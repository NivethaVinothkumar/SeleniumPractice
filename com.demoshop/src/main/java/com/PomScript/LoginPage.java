package com.PomScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage  extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//a[text()='Log in']")
	public WebElement loginLink;
	
	@FindBy(xpath="//input[@id='Email']")
	public WebElement emailId;
	
	@FindBy(xpath="//input[@id='Password']")
	public WebElement password;

	@FindBy(xpath="//input[@value='Log in']")
	public WebElement loginButton;
	
	
	
	

}
