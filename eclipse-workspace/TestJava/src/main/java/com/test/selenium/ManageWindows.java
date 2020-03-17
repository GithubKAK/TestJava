package com.test.selenium;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageWindows {
	public static void main(String [] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.seleniumeasy.com/test");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//*[@id=\"treemenu\"]/li/ul/li[5]")).click();

	driver.findElement(By.xpath("//*[@id=\"treemenu\"]/li/ul/li[5]/ul/li[3]/a")).click();
	//driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[1]/div/div[2]/div[1]/a")).click();
	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[2]/div[1]/a")).click();
	String currentWindow=driver.getWindowHandle();
	Thread.sleep(200);
	Set<String>set=driver.getWindowHandles();
	for(String newWindow:set)
	{
		if(!currentWindow.equalsIgnoreCase(newWindow)) {
			driver.switchTo().window(newWindow);
		}
		System.out.println("Printing each window ID"+newWindow);
	}
	driver.findElement(By.id("username_or_email")).sendKeys("abc@gmail.com");
	driver.findElement(By.id("password")).sendKeys("TestSelenium");
	driver.findElement(By.name("commit")).click();
	driver.close();
	driver.switchTo().window(currentWindow);
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[1]/div/div[2]/div[2]/a")).click();
	Set<String>set1=driver.getWindowHandles();
	for(String newWindow:set1)
	{
		if(!currentWindow.equalsIgnoreCase(newWindow)) {
			driver.switchTo().window(newWindow);
		}
		System.out.println("Printing each window ID"+newWindow);
	}
	
	driver.findElement(By.xpath("//*[@name='email'and@class='inputtext login_form_input_box']")).sendKeys("Tom@gmail.com");
	driver.findElement(By.xpath("//*[@id='pass'and@class='inputtext login_form_input_box']")).sendKeys("Selenium");
	driver.findElement(By.xpath("//*[@id=\"u_0_3\"]")).click();
	driver.close();
	Thread.sleep(2000);
	driver.switchTo().window(currentWindow);
	driver.close();
	}
}
