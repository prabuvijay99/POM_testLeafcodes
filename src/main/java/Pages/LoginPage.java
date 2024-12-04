package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import TestNGHooks.TestNGHooksClass;

public class LoginPage extends TestNGHooksClass{
	
	
	public LoginPage sendUserName(String uName) {
		getDriver().findElement(By.id("username")).sendKeys(uName);
		return this;

	}
	
	public LoginPage sendUserPassword(String uPass) {
		getDriver().findElement(By.id("password")).sendKeys(uPass);
		return this;

	}

	
	public WelcomePage clickLogin() {
		getDriver().findElement(By.className("decorativeSubmit")).click();
		return new WelcomePage();
	}
	
public LoginPage verifyLogoutStatus() {
		
		String WelcomeTitle = getDriver().getTitle();
		if(WelcomeTitle.contains("Leaftaps - TestLeaf Automation Platform"))
		{
			System.out.println("LogOut Successful");
			Assert.assertTrue(true);
		}else
		{
			System.out.println("LogOut not successful");
			Assert.assertTrue(false);
		}
		return this;

	}

}