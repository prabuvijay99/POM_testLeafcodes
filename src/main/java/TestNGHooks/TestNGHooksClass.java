package TestNGHooks;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestNGHooksClass {
	
	
	private static final ThreadLocal<WebDriver> tlDriver = new ThreadLocal<WebDriver>();
	

	public void setDriver(WebDriver driver) {
		tlDriver.set(driver);
	}
	
	public  WebDriver getDriver() {
		return tlDriver.get();
	}
	

	
	@BeforeClass
	public void preCondition() {
		
		
		setDriver(new ChromeDriver()); 
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		getDriver().manage().window().maximize();
		getDriver().get("http://leaftaps.com/opentaps/control/main");
		
		  

	}
	@AfterClass
	public void postCondition() {
		
		if (getDriver() != null)
		{
			getDriver().quit();
		}
	}
}	
	
