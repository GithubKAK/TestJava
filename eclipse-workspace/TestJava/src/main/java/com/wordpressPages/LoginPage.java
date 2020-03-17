package com.wordpressPages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
 // @author Alam

public class LoginPage {
	// create local variable 
	WebDriver driver;
	By username=By.id("user_login");
	By password=By.xpath(".//*[@id='user_pass']");
	By loginbutton=By.name("wp-submit");
	
	public LoginPage(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	public void loginToWordpress(String userid, String pass)
	{
		driver.findElement(username).sendKeys(userid);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(loginbutton).click();
	}
	
	/* public void typeUserName(String uid)
	{
		driver.findElement(username).sendKeys(uid);
	}
	public void typePassWord(String pass)
	{
		driver.findElement(password).sendKeys(pass);
	}
	public void clickOnLoginButton()
	{
		driver.findElement(loginbutton).click();
	}*/

}
