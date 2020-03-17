/**
 * 
 */
package com.wordpress.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import com.wordpressPages.LoginPage;

/**
 * @author Dolon
 *
 */
public class VerifyWordpressLogin {
	
	
	@Test 
	public void verifyWordpressLogin() 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://demosite.center/wordpress/wp-login.php");
		driver.manage().window().maximize();
		
		LoginPage login=new LoginPage(driver);
		//login.typeUserName();
		//login.typePassWord();
		//login.clickOnLoginButton();
		driver.quit();
	}

}
