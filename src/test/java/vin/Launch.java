package vin;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import pageObject.LandingPage;
import pageObject.RegisterPage;
import resources.BaseBrowser;

public class Launch extends BaseBrowser{
	public WebDriver driver;
	public static Logger log = LogManager.getLogger(Launch.class.getName()); //classname.class.getName()
	
	@BeforeTest
	public void initializer() throws IOException {
		driver = identifyBrowser();
	}
	
	@Test(dataProvider="getData")
	public void basePageNavigation(String username, String password) {
		driver.get(pr.getProperty("url"));
		LandingPage lp = new LandingPage(driver);
		RegisterPage login = lp.register(); //here we are not creating new object. 
		//loginPage login = new loginPage(driver);  for optimization
		//login.email().sendkeys("aaa");
		//login.password().sendkeys("ssds");
		//login.getLogin().click();
		login.username().sendKeys(username);
		login.email().sendKeys(password);
		log.info("provided username and password");
		login.terms().click();
		login.signup().click();
		
		//driver.close();
	}
	
	@DataProvider
	public Object[][] getData(){
		Object[][] data = new Object[3][2];
		data[0][0]="mel";
		data[0][1]="mel1";
		
		data[1][0]="mis";
		data[1][1]="mis1";
		
		data[2][0]="vin";
		data[2][1]="vin1";
			
		return data;
		
	}
	
	@AfterTest
	public void teardown() {
		driver.close();
	}

}


//click on login
