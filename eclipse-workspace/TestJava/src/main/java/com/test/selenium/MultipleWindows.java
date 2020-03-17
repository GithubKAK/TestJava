package com.test.selenium;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MultipleWindows {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.seleniumeasy.com/test");
		driver.manage().window().maximize();
		//Thread.sleep(2000);
	
		/*//Implicit wait for browser 
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//Explicit wait for the elements
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"treemenu\"]/li/ul/li[5]/ul/li[1]/a")))).click();*/
		//Fluent wait for element in the browser 
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
		driver.quit();
	}

}
