package testScript;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import constant.Constant;
import utilities.WaitUtility;


public class BaseClass {

	public WebDriver driver;
	FileInputStream fileinputstream;
    Properties properties;
	@BeforeMethod(alwaysRun = true)
	@Parameters("browser") // parameterisation annotation
	public void intializeBrowser(String browser) throws Exception {
		try {
			properties = new Properties();
			fileinputstream= new FileInputStream(Constant.CONFIGPATH);
			properties.load(fileinputstream);
			
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
		if (browser.equalsIgnoreCase("chrome")) // for chrome driver
		{
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("FireFox")) { // for firefox driver
			driver = new FirefoxDriver();
		} else {
			throw new Exception("Invalid browser");
		}

		driver.get(properties.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WaitUtility.IMPLICITWAIT));
		//driver.get("https://groceryapp.uniqassosiates.com/admin/login");
		driver.manage().window().maximize();
	}
		

	@AfterMethod(alwaysRun = true)

	public void closeBrowser() {
		driver.quit();
	}
}
