package com.crm.qa.testcases;

import java.io.IOException;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class LoginPageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;

	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
	}
	
	
	
	  @Test(priority=1) public void loginPageTitleTest() { String title =
	  loginPage.getPageTitle(); Assert.assertEquals(title,
	  "Facebook – log in or sign up");
	  
	  }
	  
	  @Test(priority=2) public void fbLogoImageTest() { boolean flag =
	  loginPage.validateFBImage(); Assert.assertTrue(flag); }
	  
	  @Test(priority=3) public void loginTest() { homePage =
	  loginPage.login(prop.getProperty("username"), prop.getProperty("passwoord"));
	  }
	 
	
		/*
		 * @DataProvider public Object[][] getTestData() { Object data[][] = null; try {
		 * data = TestUtil.getTestData("Sheet1"); } catch (EncryptedDocumentException e)
		 * { e.printStackTrace(); } catch (IOException e) { e.printStackTrace(); }
		 * return data; } //Try catch is required above because try catch is not handled
		 * in TestUtil.getTestData
		 * 
		 * 
		 * @Test(priority=4, dataProvider="getTestData") public void
		 * loginTestWithData(String uName, String Pass) { homePage =
		 * loginPage.login(uName, prop.getProperty("passwoord")); }
		 */
	

	/*@Test(priority=4)
	public void loginTestWithData() {
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("passwoord"));
	}*/
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}
