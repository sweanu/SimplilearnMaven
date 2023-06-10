package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testCases.Baseclass;

public class Loginpage {
	WebDriver pagedriver;
	//===========objects=============
	
	@FindBy(linkText="Log in")
	WebElement login;
	
	@FindBy(name="user_login")
	WebElement Username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(className="rememberMe")
	WebElement checkbox;
	
	@FindBy(name="btn_login")
	WebElement loginbtn;
	
	public Loginpage(WebDriver driver)
	{
		pagedriver=driver;
		PageFactory.initElements(pagedriver, this);
	}

	public void Loginfunction(String name, String passwords)
	{
		
		login.click(); 	
		Username.sendKeys(name);	
		password.sendKeys(passwords);
		checkbox.click();
		loginbtn.click();
	}
}
