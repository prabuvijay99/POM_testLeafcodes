package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import TestNGHooks.TestNGHooksClass;

public class WelcomePage extends TestNGHooksClass {
	
//	public WebDriver driver;
//	
//	public WelcomePage(WebDriver driver) {
//		
//		this.driver=driver;
//	}
	
	public WelcomePage verifyLoginStatus() {
		
		String WelcomeTitle = getDriver().getTitle();
		if(WelcomeTitle.contains("Leaftaps - TestLeaf Automation Platform"))
		{
			System.out.println("Login Successful");
			Assert.assertTrue(true);
		}else
		{
			System.out.println("Login not successful");
			Assert.assertTrue(false);
		}
		return this;
	}
	
	public LoginPage clickLogout() {
		getDriver().findElement(By.tagName("input")).click();
		return new LoginPage();
	}

	public MyHomePage clickcrmsfa() {
		getDriver().findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage(); 
	}
	
}

	



