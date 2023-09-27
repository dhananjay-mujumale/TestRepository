package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	//Page Factory (Object Repository)--->
	
	@FindBy(id="email")
	@CacheLookup
	WebElement username;
	
	@FindBy(id="pass")
	WebElement password;
	
	@FindBy(name="login")
	WebElement loginbtn;
	
	@FindBy(xpath="//img[contains(@class, 'fb_logo _8ilh img')]")
	WebElement fbImage;
	
	//Page Factory initialization / initialization of page objects
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions / Methods....or different features available on page
	public String getPageTitle() {
		return driver.getTitle();
		
	}
	
	public boolean validateFBImage() {
		return fbImage.isDisplayed();
		
	}
	
	public HomePage login (String uName, String pwd) {
		username.sendKeys(uName);
		password.sendKeys(pwd);
		loginbtn.click();
		
		return new HomePage();
				
	}
	
	
	

}
