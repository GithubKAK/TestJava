package com.test.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandealAlert {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"treemenu\"]/li/ul/li[5]")).click();
		driver.findElement(By.xpath("//*[@id=\"treemenu\"]/li/ul/li[5]/ul/li[5]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/button")).click();
		Thread.sleep(2000);
		Alert alert=driver.switchTo().alert();
		alert.accept();
		driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/button")).click();
		
		Thread.sleep(2000);
		Alert alert1=driver.switchTo().alert();
		alert1.dismiss();
		driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[3]/div[2]/button")).click();
		Thread.sleep(2000);
		Alert alert2=driver.switchTo().alert();
		//alert2.toString().
		//driver.switchTo()alert().
		alert2.sendKeys("Alam");
		Thread.sleep(2000);
		alert2.accept();

	}

}
