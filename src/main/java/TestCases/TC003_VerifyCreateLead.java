package TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.LoginPage;
import TestNGHooks.TestNGHooksClass;

public class TC003_VerifyCreateLead extends TestNGHooksClass{
	@Test
	public void verifyCreatedLead() {
		
		new LoginPage()
		.sendUserName("demosalesmanager")
		.sendUserPassword("crmsfa")
		.clickLogin()
		.verifyLoginStatus()
		.clickcrmsfa()
		.verifyHomePageLanding()
		.clickCreateLead()
		.verifyCreatePageLanding()
		.sendCompanyName()
		.sendFirstName()
		.sendLastName()
		.clickCreateLeadButton()
		.verifyViewPageLanding()
		.verifyCreatedLeadStatus("Vivek");
		}
		
	}


