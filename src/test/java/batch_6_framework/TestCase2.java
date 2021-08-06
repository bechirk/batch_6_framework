package batch_6_framework;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import projectData.BoraTech_TestData;
import utilityLibrary.BasePage;

public class TestCase2 extends BasePage {

	@Test(priority = 15, enabled = true, groups = "regression")
	public void verifyExpirence() {

		home.clickOnLoginButton();

		login.login(BoraTech_TestData.userName_testAccount, BoraTech_TestData.password_testAccount);

		dashboard.clickAddExpirenceButton();

		expirence.addExpirence();

	}

	@Test(enabled = true, groups = {"regression","sanity"})
	public void verifyEducation() {

		home.clickOnLoginButton();

		login.login(BoraTech_TestData.userName_testAccount, BoraTech_TestData.password_testAccount);

		dashboard.clickAddEducation();

		edu.addEducation();
	}

	@Test(priority = -3, groups = "sanity")
	public void verifyLogin() {

		home.clickOnLoginButton();

		login.login(BoraTech_TestData.userName_testAccount, BoraTech_TestData.password_testAccount);

//		dashboard.verifyPage();
	}

	@Test(priority = -5, enabled = true, groups = "sanity")
	public void CreateUser() {

		home.clickOnLoginButton();

		// enter userName / Password
		login.login(BoraTech_TestData.userName_testAccount, "invalidPassword");

		String messageFromUI = "invlaid creditial";

		AssertJUnit.assertEquals(messageFromUI, "invalid");

//		dashboard.verifyPage();

	}

}