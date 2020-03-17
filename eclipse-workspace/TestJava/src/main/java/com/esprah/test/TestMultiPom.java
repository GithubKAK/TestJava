package com.esprah.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.esprah.page.MainPage;
import com.esprah.page.MultiPersonalPage;
import com.esprah.page.OnlineCatalogPage;

public class TestMultiPom extends BaseTest{
	
	@Before
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	    driver=new ChromeDriver();
		driver.get("http://esprah.com");
		driver.manage().window().maximize();	
	}
	@Test
	public void Online() 
	{
		MainPage main=new MainPage(driver);
		main.clickOnlineCatalog();
		OnlineCatalogPage onlinecatalog=new OnlineCatalogPage(driver);
		onlinecatalog.enterQuntity1("3");
		onlinecatalog.enterQuntity2("2");
		onlinecatalog.enterQuntity3("1");
		onlinecatalog.enterQuntity4("4");
		onlinecatalog.clickNext3();
		
	}
	//-------------
	@Test
	public void Multi() 
	{
		MainPage main=new MainPage(driver);
		main.clickMulti();
		MultiPersonalPage personal=new MultiPersonalPage(driver);
		personal.enterFirstName("Jhon");
		personal.enterLastName("Henk");
		personal.enterEmail("JhonH@gmail.com");
		personal.enterConfirmEmail("JhonH@gmail.com");
		personal.enterPhoneNumber1("202-777-6000");
		personal.clickNext1();
		
	}
	@Test
		public void SubForm() 
	{
		MainPage main1=new MainPage(driver);
		main1.clickSubForm();
		MultiPersonalPage personal=new MultiPersonalPage(driver);
		personal.enterFirstName("Jhon");
		personal.enterLastName("Henk");
		personal.enterPhoneNumber("202-777-6000");
		personal.clickNext();
		
	}
	/*@AfterClass
	public static void clossPage() {
		driver.close();
	}*/
	@After 
	public void teardown() 
	{
		driver.close();
	}
}
