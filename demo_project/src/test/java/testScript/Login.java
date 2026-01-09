package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Login extends BaseClass{

	@Test
	public void login() {
		
		String username1="admin";
		String password1="admin";
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys("username1");
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("password1");
		WebElement signInButton = driver.findElement(By.xpath("//button[@type='submit']"));
		signInButton.click();

	}
	@Test
public void login1() {
		
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys("adminn");
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("admin");
		WebElement signInButton = driver.findElement(By.xpath("//button[@type='submit']"));
		signInButton.click();

	}
	@Test
public void login2() {
	
	WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
	username.sendKeys("admin");
	WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
	password.sendKeys("adminn");
	WebElement signInButton = driver.findElement(By.xpath("//button[@type='submit']"));
	signInButton.click();

}
	@Test
public void login3() {
	
	WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
	username.sendKeys("adminn");
	WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
	password.sendKeys("adminn");
	WebElement signInButton = driver.findElement(By.xpath("//button[@type='submit']"));
	signInButton.click();

}
	@Test
	public void login4() {
		
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		String username1= "xyz";
		username.sendKeys(username1);
		//username.sendKeys("");
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		String password1="abc";
		password.sendKeys(password1);
		//password.sendKeys("adminn");
		WebElement signInButton = driver.findElement(By.xpath("//button[@type='submit']"));
		signInButton.click();
}
public void login5() {
		
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys("");
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("adminn");
		WebElement signInButton = driver.findElement(By.xpath("//button[@type='submit']"));
		signInButton.click();
}
}