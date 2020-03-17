package com.esprah.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage{
	
	public MainPage(WebDriver driver)
	{
		super(driver);
	}
	
public void clickMulti() 
{
	driver.findElement(By.xpath("//*[@id='link'and@class='nav-link'and@href='/Form1']")).click();
}
public void clickSubForm()
{
	driver.findElement(By.xpath("//*[@id=\'MealPageLink\']")).click();
}

public void clickOnlineCatalog()
{
	driver.findElement(By.xpath("//*[@id=\'link\'and@href='/ProductOrder1']")).click();
}
	
}

