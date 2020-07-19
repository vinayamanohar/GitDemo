package stepdefinition;

//import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import pageObject.LandingPage;
import pageObject.RegisterPage;
import resources.BaseBrowser;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class StepDefinition extends BaseBrowser {
	LandingPage lp;

	@Given("^Initialize browser with Chrome$")
	public void initialize_browser_with_Chrome() throws Throwable {
	    
		driver=identifyBrowser();

	}

	@Given("^Navigate to \"([^\"]*)\" site$")
	public void navigate_to_site(String arg1) throws Throwable {
	 	//driver.get(pr.getProperty("url"));
		driver.get(arg1); // we can pass the URL from cucumber feature class instead of properties file
		System.out.println("launching url for login");
	}

	@Given("^Click on Login Link to login to Secure login page$")
	public void click_on_Login_Link_to_login_to_Secure_login_page() throws Throwable {
		 lp = new LandingPage(driver);
		 

	}

	//@When("^User enters \"([^\"]*)\" and \"([^\"]*)\" and logs in$")
    @When("^User enters (.+) and (.+) and logs in$")
	public void user_enters_and_and_logs_in(String username, String pwd) throws Throwable {
		RegisterPage login = lp.register();
		login.username().sendKeys(username);
		login.email().sendKeys(pwd);
	//	log.info("provided username and password");
		login.terms().click();
		login.signup().click();

	}

	@Then("^verify the user is successfully logged in$")
	public void verify_the_user_is_successfully_logged_in() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions

		System.out.println("validate successful login");
		driver.close();
	}


   
}