package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import TestNGHooks.TestNGHooksClass;

public class ViewLeadPage extends TestNGHooksClass{
	
	
	
		public ViewLeadPage verifyViewPageLanding() {
				
				String landingPage = getDriver().getTitle();
				if(landingPage.equals("View Lead | opentaps CRM"))
				{
					System.out.println("ViewLeadPage");
					Assert.assertTrue(true);
				} else {
					System.out.println("Not ViewLeadPage");
					Assert.assertTrue(false);
				}
				return this;
			}
		
		public ViewLeadPage verifyCreatedLeadStatus(String fname) {
		String lead_FirstName = getDriver().findElement(By.id("viewLead_firstName_sp")).getText();
		Assert.assertEquals(lead_FirstName, fname);
		return this;
	}
}
