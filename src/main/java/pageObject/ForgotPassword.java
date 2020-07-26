package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgotPassword {
	WebDriver driver;
	
	By forgot = By.xpath("//a[text()='Forgot Password?']");
	
	public ForgotPassword(WebDriver driver) {
		this.driver=driver;
		System.out.println("Learning Github");
		System.out.println("Learning Github2");
		System.out.println("Learning GitHub - Origin is GitX");
		System.out.println("Learning GitHub2 - Origin is GitX");
		
	}
	
	public WebElement forgotpwd() {
		return driver.findElement(forgot);
	}

}
 