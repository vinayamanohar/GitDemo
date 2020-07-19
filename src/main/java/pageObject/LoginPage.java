package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public WebDriver driver;
	
	
	public LoginPage (WebDriver driver) {
		this.driver=driver;
	}
	
	
	By login = By.xpath("//a[text()='Login']");
	
	public WebElement login() {
		return driver.findElement(login);
	}

}
