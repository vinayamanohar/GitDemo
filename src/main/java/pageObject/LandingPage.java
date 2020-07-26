package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LandingPage {
	
public WebDriver driver;
	
	private By register =By.xpath("//a[text()='Register']");
	
	private By titlefeature = By.xpath("//h2[text()='Featured Courses']");
	private By contact = By.xpath("//a[text()='Contact']");
	
	private By login = By.xpath("//a[text()='Login']");
	private By banner = By.cssSelector("div[class='col-md-6 text-left'] h2");
	 
	
	
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		System.out.println("Learning GitHub2 - Origin is GitX");
		
	}

	public RegisterPage register()
	{
		 driver.findElement(register).click();
		 RegisterPage login=new RegisterPage(driver);
		 return login;
	}
	
	public WebElement titlefeature() {
		return driver.findElement(titlefeature);
	}
	
	public WebElement contact() {
		return driver.findElement(contact);
	}
	
	
	public WebElement login() {
		return driver.findElement(login);
	}
	
	public WebElement validateBanner() {
		return driver.findElement(banner);
	}
}
