package TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Pages.LoginPage;
import TestNGHooks.TestNGHooksClass;

public class TC002_VerifyLogout extends TestNGHooksClass

	{
	@Test
	public void verify_Logout() {
	new LoginPage()
		.sendUserName("demosalesmanager")
		.sendUserPassword("crmsfa")
		.clickLogin()
		.verifyLoginStatus()
		.clickLogout()
		.verifyLogoutStatus();
}
		
	}
