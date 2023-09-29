package com.crm.qa.testcases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;

	//Logger log = Logger.getLogger(LoginPageTest.class);
	Logger log = LogManager.getLogger(LoginPageTest.class);
	
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
	}
	
	
	
	  @Test(priority=1) 
	  public void loginPageTitleTest() { String title =
	  loginPage.getPageTitle(); Assert.assertEquals(title,
	  "Facebook – log in or sign up");
	  
	    log.info("entering application URL");
		log.warn("Hey this just a warning message");
		log.fatal("hey this is just fatal error message....**************");
		log.debug("this is debug message");
		
  }
//	  
//	  @Test(priority=2) public void fbLogoImageTest() { boolean flag =
//	  loginPage.validateFBImage(); Assert.assertTrue(flag); }
//	  
//	  @Test(priority=3) public void loginTest() { homePage =
//	  loginPage.login(prop.getProperty("username"), prop.getProperty("passwoord"));
//	  }
//	 
	
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
