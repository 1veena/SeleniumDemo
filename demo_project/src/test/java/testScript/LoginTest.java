package testScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends BaseClass {

	@Test(groups = {
			"regression" }, description = "Testcase varifies the user can able to login using invalid username and valid password", retryAnalyzer = retry.Retry.class) 																									// testcase
	public void verifytheUserisabletoLoginUsingValidCredentials() throws IOException {
		// String username = "admin";
		// String password ="admin";
		String username = ExcelUtility.getStringData(1, 0, "Loginpage"); // Loginpage is the page name of th exel sheet
		String password = ExcelUtility.getStringData(1, 1, "Loginpage");
		LoginPage loginpage = new LoginPage(driver); // create object for loginpage class
		loginpage.entertheusername(username); // mthod from loginpge
		loginpage.enterthepassword(password);
		loginpage.buttonClickonSignInButton();
		boolean homepage = loginpage.isDashboardDisplayed();// verifying the dashboard is displaying or not True/False).
															// return the value in boolean variable homepage
		Assert.assertTrue(homepage, "User is not able to login by using valid credentials");// hard assertion

	}

	@Test(description = "Testcase varifies the user can able to login using invalid username and valid password")
	public void verifytheUserisabletoLoginUsingInValidUsernameValidPassword() {

		String username = "xyz";
		String password = "admin";
		LoginPage loginpage = new LoginPage(driver); // create object for loginpage class
		loginpage.entertheusername(username); // mthod from loginpge
		loginpage.enterthepassword(password);
		loginpage.buttonClickonSignInButton();
		boolean homepage = loginpage.isAlertDisplayed();
		Assert.assertTrue(homepage, Constant.LOGININVALIDUSERNAME);
	}

	@Test(description = "Testcase varifies the user can able to login using valid username and invalid password")
	public void verifytheUserisabletoLoginUsingValidUsernameInValidPassword() {
		String username = "admin";
		String password = "xyz";
		LoginPage loginpage = new LoginPage(driver); // create object for loginpage class
		loginpage.entertheusername(username); // mthod from loginpge
		loginpage.enterthepassword(password);
		loginpage.buttonClickonSignInButton();
		boolean homepage = loginpage.isAlertDisplayed();
		Assert.assertTrue(homepage);

	}

	@Test(description = "Testcase varifies the user can able to login using invalid username and invalid password")
	public void verifytheUserisabletoLoginUsingInValidUsernameInValidPassword() {
		String username = "xyz";
		String password = "xyz";
		LoginPage loginpage = new LoginPage(driver); // create object for loginpage class
		loginpage.entertheusername(username); // mthod from loginpge
		loginpage.enterthepassword(password);
		loginpage.buttonClickonSignInButton();
		boolean homepage = loginpage.isAlertDisplayed();
		Assert.assertTrue(homepage);
	}
}
