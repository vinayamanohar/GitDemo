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
	
	
	public void ForgotPasswordgittest(WebDriver driver) {
		this.driver=driver;
		System.out.println("Branching test");
		System.out.println("Braching test Github2");
		System.out.println("Branching GitHub - Origin is GitX");
		System.out.println("Branching GitHub2 - Origin is GitX");
		
	}
	
	
	public void testGitX(WebDriver driver) {
		this.driver=driver;
		System.out.println("Branching test -  GitX");
		System.out.println("Braching test - Gitx");
						
	}
	
	public WebElement forgotpwd() {
		return driver.findElement(forgot);
	}

}
 