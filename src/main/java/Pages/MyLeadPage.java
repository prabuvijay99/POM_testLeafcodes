package Pages;

import org.testng.Assert;
import org.testng.annotations.Test;

import TestNGHooks.TestNGHooksClass;

public class MyLeadPage extends TestNGHooksClass {
	
	public void verifyMyLeadPage() {
		String title = getDriver().getTitle();
		if(title.contains("My Leads | opentaps CRM"))
		{
			System.out.println("My leads page");
			Assert.assertTrue(true);
		}else
		{
			System.out.println("Not My leads page");
			Assert.assertTrue(false);
		}

	}

}
