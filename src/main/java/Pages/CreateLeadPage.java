package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import TestNGHooks.TestNGHooksClass;

public class CreateLeadPage  extends TestNGHooksClass {
	
	
public CreateLeadPage verifyCreatePageLanding() {
		
		String landingPage = getDriver().getTitle();
		if(landingPage.equals("Create Lead | opentaps CRM"))
		{
			System.out.println("CreateLeadPage");
			Assert.assertTrue(true);
		} else {
			System.out.println("Not My CreateLeadPage");
			Assert.assertTrue(false);
		}
		return this;
	}

	public CreateLeadPage sendCompanyName() {
		getDriver().findElement(By.id("createLeadForm_companyName")).sendKeys("Google");
		return this;

	}
	
	public CreateLeadPage sendFirstName() {
		getDriver().findElement(By.id("createLeadForm_firstName")).sendKeys("Vivek");
		return this;

	}
	
	public CreateLeadPage sendLastName() {
		getDriver().findElement(By.id("createLeadForm_lastName")).sendKeys("C");
		return this;

	}
	
	public ViewLeadPage clickCreateLeadButton() {
		getDriver().findElement(By.name("submitButton")).click();
		return new ViewLeadPage();

	}

}
