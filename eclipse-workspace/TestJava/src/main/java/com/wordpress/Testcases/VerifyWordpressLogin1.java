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
public class VerifyWordpressLogin1 {
	
	
	@Test 
	public void verifyWordpressLogin() 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://demosite.center/wordpress/wp-login.php");
		driver.manage().window().maximize();
		
		LoginPage login=new LoginPage(driver);
		login.loginToWordpress("admin", "demo123");
		//login.typeUserName("admin");
		//login.typePassWord("demo123");
		//login.clickOnLoginButton();
		driver.quit();
	}

}
