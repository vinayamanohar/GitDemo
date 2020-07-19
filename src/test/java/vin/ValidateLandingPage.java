package vin;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObject.LandingPage;
import resources.BaseBrowser;

public class ValidateLandingPage extends BaseBrowser {
	
	public WebDriver driver;
	// making LandingPage object as global.
	//There are many methods in this class which can use this object instead of creating object inside each class
	LandingPage val;  
	public static Logger log = LogManager.getLogger(ValidateLandingContact.class.getName());
	
	@BeforeTest
	public void initializer() throws IOException {
		driver=identifyBrowser();
		
		driver.get(pr.getProperty("url"));
	}
	
	@Test
	public void validate() {
		//LandingPage val = new LandingPage(driver);
		val = new LandingPage(driver);
		//Assert.assertTrue(val.titlefeature().isDisplayed());
		Assert.assertEquals(val.titlefeature().getText(), "Featured Courses");
		System.out.println("Feature title compared");
			
	}
	
	@Test
	public void validateBanner_LandingPage() {
		Assert.assertEquals(val.validateBanner().getText(), "An Academy to Learn Earn & Shine  in your QA Career");
		System.out.println("Validating Banner in Landing page");
		
		
	}
	
	@AfterTest
	public void teardown() {
		driver.close();
	}
	

}
