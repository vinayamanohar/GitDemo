package vin;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.*;

import junit.framework.Assert;
import pageObject.LandingPage;
import resources.BaseBrowser;

public class ValidateLandingContact extends BaseBrowser {
	public WebDriver driver;
	public static Logger log = LogManager.getLogger(ValidateLandingContact.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException {
		driver=identifyBrowser();
		driver.get(pr.getProperty("url"));
		log.info("launched URL inside validateContact");
	}

	@Test
	public void validateContact() {
		LandingPage lp1 = new LandingPage(driver);
		Assert.assertTrue(lp1.contact().isDisplayed());
		System.out.println("Contact verified");
		//Assert.assertFalse(false); to make test case fail forcefully
		log.info("verified contact");
	}
	
	
	@AfterTest
	public void teardown() {
		driver.close();
	}
	
}
