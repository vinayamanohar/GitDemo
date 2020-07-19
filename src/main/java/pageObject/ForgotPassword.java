package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgotPassword {
	WebDriver driver;
	
	By forgot = By.xpath("//a[text()='Forgot Password?']");
	
	public ForgotPassword(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement forgotpwd() {
		return driver.findElement(forgot);
	}

}
