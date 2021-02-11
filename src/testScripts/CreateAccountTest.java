package testScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.PredefinedActions;
import pages.AuthenticationPage;
import pages.CreateAccountPage;
import pages.HomePage;
import pages.MyProfilePage;

public class CreateAccountTest {

	@Test
	public void automationPracticeLogin() {
		PredefinedActions.start();
		HomePage homePage = new HomePage();
		AuthenticationPage authenticationPage = homePage.clickOnSignIn();
		authenticationPage.enterEmailAddress("nitin1002jain@gmail.com");
		CreateAccountPage createAccountPage = new CreateAccountPage();
		System.out.println("Navigate to create account page");
		createAccountPage.enterCreateAccountDetails();
		MyProfilePage myProfilePage = createAccountPage.clickOnRegistration();
		String actual = myProfilePage.getHeaderText();
		String expected = "Nitin jain";
		Assert.assertEquals(actual, expected, "Verification of headerText failed");

	}

}
