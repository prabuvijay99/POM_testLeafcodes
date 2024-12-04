package TestCases;

import org.testng.annotations.Test;

import Pages.LoginPage;
import TestNGHooks.TestNGHooksClass;

public class TC001_VerifyLogin extends TestNGHooksClass
	{
	
		@Test
		public void verify_Login() {
			new LoginPage()
			.sendUserName("demosalesmanager")
			.sendUserPassword("crmsfa")
			.clickLogin()
			.verifyLoginStatus();

}
		
		
		
}
