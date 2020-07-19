package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
//rahulonlinetutor@gmail.com
public class RegisterPage {

	
	public WebDriver driver;
	
	By username = By.id("user_name");
	By email = By.id("user_email");
	
	By terms = By.id("user_agreed_to_terms");
	By signup = By.name("commit");
		
	public RegisterPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
	}


	
	@Test
	public WebElement username() {
		return driver.findElement(username);
	}
	@Test
	public WebElement email() {
		
		return driver.findElement(email);
	}
	
	
	@Test
	public WebElement terms() {
		return driver.findElement(terms);
	}
	
	@Test
	public WebElement signup() {
		return driver.findElement(signup);
	}
	
}
