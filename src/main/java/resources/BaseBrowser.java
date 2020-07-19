package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
//Define different browsers on which test should perform. define implicit wait
public class BaseBrowser {
	public Properties pr = new Properties();
	//if we define this in Static, all the test cases will share the same driver (memory is saved), if another test want to use it, it will just override
	// if we want to run in sequence, we can use statis. If parallel then dont use Statci.
	//But in this Framework even if we use static and run parallely. it works because we are having a local copy "driver" in all the class
	
	public WebDriver driver; 
	
	public WebDriver identifyBrowser() throws IOException {
		
		String propertiespath = System.getProperty("user.dir")+"\\src\\main\\java\\resources\\objectproperties.properties";
		FileInputStream fs = new FileInputStream(propertiespath);
		pr.load(fs);
		String browserName=pr.getProperty("browser");
	//String browserName=	System.getProperty("browser"); // this is to run from maven. also configured in Jenkins
		
		if(browserName.contains("chrome")) {
			 // copy the driver and paste it insisde subfloders of resources folder. so this will avoid hardcoding the path
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			
			if(browserName.contains("headless")) {
			//using ChromeOptions to invoke in Headless browser for chrome
			options.addArguments("headless"); // "--headless" also works
			}
			
			driver = new ChromeDriver(options);
		}
		
		else if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\BrowserDriver\\geckodriver.exe");
			driver = new FirefoxDriver();
			
		}
		else if(browserName.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver", "D:\\BrowserDriver\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}

	public String takeScreenshot(String testCaseName, WebDriver driver) throws IOException {
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String destFile=System.getProperty("user.dir")+"\\reports"+testCaseName+".png";
		FileUtils.copyFile(source, new File(destFile));
		return destFile;
		
	}
	
}
