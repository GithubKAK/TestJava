package com.esprah.test;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class TestJunitMulti {
public static WebDriver driver;
// @Before doesn't go with static but @BeforeClass need satic 	
// Will open the browser onec with @BeforeClass and will do the all @Test and @AfterClass will close the browser  
@Before
public void launchWebside() throws InterruptedException {
	    System.out.println("Launch the browser ");
	    System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	    driver=new ChromeDriver();
		driver.get("http://www.esprah.com");
		driver.manage().window().maximize();
	    Thread.sleep(2000);
	
        }
@Test
	public void testMultiPage()
   {
	  
	driver.findElement(By.id("multiPageFormLink")).click();
	
		String expecteds="Personal Information";
		String actuals=driver.findElement(By.xpath("//*[@id='react-app']/div/div/div/div[2]/div/div[2]/div/div[1]/h2")).getText();
		Assert.assertEquals(expecteds, actuals);
		System.out.println("Testing the multiPageForm ");
		System.out.println("Actuals title is: "+actuals);
		
		//driver.close();
   }
	@Test
	public void testOnlineCatalog()
	{
		
		driver.findElement(By.xpath("//*[@id=\'productOrderPageLink\']")).click();
		String expecteds="Online Catalog";
		String actuals=driver.findElement(By.xpath("//*[@id=\"react-app\"]/div/div/div/div[2]/div/div[2]/div/div/h2")).getText();
		Assert.assertEquals(expecteds, actuals);
		System.out.println("Testing the OneLine Catlog page ");
		System.out.println("Actuals tital is: "+ actuals);
		//driver.close();
	}
	
	@After
	public void closeTest()
	{
		System.out.println("The test is finished ");
       driver.close();

	}
}
	
	
	
	/*@Test
	public void testMultiPage()
	{
		System.out.println("This is  test one ");
		Wait wait = new FluentWait(driver).withTimeout(20,TimeUnit.SECONDS).
				pollingEvery(2, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
		driver.findElement(By.xpath("//*[@id=\"treemenu\"]/li/ul/li[5]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"treemenu\"]/li/ul/li[5]/ul/li[3]/a")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[2]/div[1]/a")).click();
		
		Set<String> handler= driver.getWindowHandles();
		Iterator<String> it= handler.iterator();
		String parentWindow=it.next();
		System.out.println("parent window id "+parentWindow);
		String cildWindow=it.next();
		String cildWindow1=it.next();
		
		System.out.println("child window id "+cildWindow);
		driver.switchTo().window(cildWindow);
		System.out.println("child window id"+driver.getTitle());
	    //Face-book 
		driver.findElement(By.xpath("//*[@name='email'and@class='inputtext login_form_input_box']")).sendKeys("Tom@gmail.com");
		driver.findElement(By.xpath("//*[@id='pass'and@class='inputtext login_form_input_box']")).sendKeys("Selenium");
		driver.findElement(By.xpath("//*[@id=\"u_0_3\"]")).click();
		driver.close();
		driver.switchTo().window(cildWindow1);
		
		driver.findElement(By.id("username_or_email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("password")).sendKeys("TestSelenium");
		driver.findElement(By.name("commit")).click();
		
		driver.close();
		//driver.quit();*/
	
	
	
	
	
