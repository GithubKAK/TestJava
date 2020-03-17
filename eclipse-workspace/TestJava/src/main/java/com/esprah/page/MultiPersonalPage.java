package com.esprah.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MultiPersonalPage extends BasePage{
	
	public MultiPersonalPage(WebDriver driver)
	{
		super(driver);
	}
public void enterFirstName(String name) 
{
	driver.findElement(By.name("firstName")).sendKeys(name);
}
public void enterLastName(String lname) 
{
	driver.findElement(By.name("lastName")).sendKeys(lname);
}
public void enterEmail(String email) 
{
	driver.findElement(By.name("email")).sendKeys(email);
}
public void enterConfirmEmail(String confirmemail) 
{
	driver.findElement(By.name("confirmEmailAddress")).sendKeys(confirmemail);
}
public void enterPhoneNumber(String phonenumber) 
{
	driver.findElement(By.name("phone")).sendKeys(phonenumber);
}
public void enterPhoneNumber1(String phonenumber) 
{
	driver.findElement(By.xpath("//*[@id=\'phoneNumber\']")).sendKeys(phonenumber);
}
public void clickNext() 
{
	driver.findElement(By.xpath("//*[@id=\"react-app\"]/div/div/div/div[2]/div/div[2]/div/form/div[11]/button")).click();
}
public void clickNext1()
{
	driver.findElement(By.className("mr-2")).click();
}

//-------------- Online Order-------------
public void enterQuntity1(Integer qunt) 
{
	driver.findElement(By.xpath("//*[@id=\"quantity1\"]")).sendKeys("3");
}
public void enterQuntity2(Integer qunt) 
{
	driver.findElement(By.xpath("//*[@id=\"quantity1\"]")).sendKeys("3");
}
/*public void clickNext() 
{
	driver.findElement(By.xpath("//*[@id=\"react-app\"]/div/div/div/div[2]/div/div[2]/div/form/div[11]/button")).click();
}
public void clickNext1()
{
	driver.findElement(By.className("mr-2")).click();
*/
}