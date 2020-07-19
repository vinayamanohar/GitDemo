package vin;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObject.ForgotPassword;
import pageObject.LandingPage;
import pageObject.LoginPage;
import resources.BaseBrowser;

public class Login extends BaseBrowser {
	
	public WebDriver driver;
	
	@BeforeTest
	public void initializer() throws IOException {
		driver=identifyBrowser();
		
		driver.get(pr.getProperty("url"));
		System.out.println("launching url for login");
	}
	
	@Test
	public void logi() {
		LoginPage logi = new LoginPage(driver);
		logi.login().click();
		ForgotPassword fp = new ForgotPassword(driver);
		fp.forgotpwd().click();
	}
	
	@Test
	public void forgotpwd() {
/*		ForgotPassword fp = new ForgotPassword(driver);
		fp.forgotpwd().click();*/
	}
	
	@AfterTest
	public void teardown() {
		driver.close();
	}
	

}
