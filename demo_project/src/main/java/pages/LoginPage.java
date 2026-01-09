package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitUtility;



public class LoginPage {

	@FindBy(xpath = "//input[@name='username']")
	WebElement username;
	@FindBy(xpath = "//input[@name='password']")
	WebElement password;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement signInButton;
	@FindBy(xpath = "//p[text()='Dashboard']")
	WebElement dashboard;
	@FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")
	WebElement alert;

	public WebDriver driver;
	// FileUploadUtility fileupload = new FileUploadUtility(); // file upload object
	// created for fileupload class.globally declared
//	WaitUtility waitutility = new WaitUtility();

	public LoginPage(WebDriver driver) { // construtor

		this.driver = driver;
		PageFactory.initElements(driver, this); // local driver, this means current class driver. PageFactory is a class
		// to intiliaze webelement
	}

	public void entertheusername(String username2) {
		username.sendKeys(username2);

	}

	public void enterthepassword(String password2) {
		password.sendKeys(password2);
	}

	public void buttonClickonSignInButton() {
		
		//waitutility.waitForElementToBeClickable(driver, signInButton);
		signInButton.click();
	}

	// public void chooseFile() { method for file upload

	// fileupload.fileuploadusingSendKeys(WebElement name,Constant.TESTDATAIMAGE);
	// webelement name of the locator. eg: choose file

	/// }

	public boolean isDashboardDisplayed() {
		return dashboard.isDisplayed(); // return true or false. verifying the login page is loaded. calling this method
										// in logintest

	}

	public boolean isAlertDisplayed() {
		return alert.isDisplayed();
	}

}
