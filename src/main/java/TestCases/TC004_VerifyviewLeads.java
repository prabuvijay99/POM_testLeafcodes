package TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.LoginPage;
import TestNGHooks.TestNGHooksClass;

public class TC004_VerifyviewLeads extends TestNGHooksClass{
	@Test
	public void verifyCreatedLead() {
		
				new LoginPage()
		.sendUserName("demosalesmanager")
		.sendUserPassword("crmsfa")
		.clickLogin()
		.verifyLoginStatus()
		.clickcrmsfa()
		.verifyHomePageLanding()
		.clickLeads()
		.verifyMyLeadPage();
		
				
		}
		
	}


