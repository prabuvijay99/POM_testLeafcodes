package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import TestNGHooks.TestNGHooksClass;

public class MyHomePage extends TestNGHooksClass {
		
	
	
	public MyHomePage verifyHomePageLanding() {
		
		String landingPage = getDriver().getTitle();
		if(landingPage.equals("My Home | opentaps CRM"))
		{
			System.out.println("MyHomePage");
			Assert.assertTrue(true);
		} else {
			System.out.println("Not My HomePage");
			Assert.assertTrue(false);
		}
		return this;
	}
	
	
	public CreateLeadPage clickCreateLead() {
		
		getDriver().findElement(By.linkText("Create Lead")).click();
		return new CreateLeadPage();

	}
	
	public MyLeadPage clickLeads() {
		getDriver().findElement(By.xpath("//a[@href='/crmsfa/control/leadsMain']")).click();
		return new MyLeadPage();
		

	}
	

}
