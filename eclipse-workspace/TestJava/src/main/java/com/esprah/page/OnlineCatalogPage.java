package com.esprah.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OnlineCatalogPage extends BasePage{
	
		
		public OnlineCatalogPage(WebDriver driver)
		{
			super(driver);
		}
	public void enterQuntity1(String  qunt) 
	{
		driver.findElement(By.xpath("//*[@id=\"quantity1\"]")).sendKeys(qunt);
	}
	public void enterQuntity2(String  quat) 
	{
		driver.findElement(By.name("quantity2")).sendKeys(quat);
	}
	public void enterQuntity3(String  quat) 
	{
		driver.findElement(By.name("quantity3")).sendKeys(quat);
	}
	public void enterQuntity4(String  quat) 
	{
		driver.findElement(By.name("quantity4")).sendKeys(quat);
	}
	public void clickNext3() 
	{
		driver.findElement(By.id("nextButton")).click();
	}
}
