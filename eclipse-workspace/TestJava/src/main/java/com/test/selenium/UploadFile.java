package com.test.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.seleniumeasy.com/test");
		//driver.get("http://demo.guru99.com/test/upload/");
		//http://demo.guru99.com/test/upload/
		driver.manage().window().maximize();
		//*[@id="treemenu"]/li/ul/li[2]/a
		//*[@id="treemenu"]/li/ul/li[2]/ul/li[1]/a
		driver.findElement(By.xpath("//*[@id=\"treemenu\"]/li/ul/li[2]/a")).click();
		//driver.findElement(By.xpath("//*[@id=\"treemenu\"]/li/ul/li[2]/i")).click();
		driver.findElement(By.xpath("//*[@id=\"treemenu\"]/li/ul/li[2]/ul/li[1]/a")).click();
		driver.findElement(By.className("form-control")).click();
		
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/tbody/tr[3]/td[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"datepicker\"]/input[1]")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/tbody/tr[3]/td[4]")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/tbody/tr[3]/td[7]")).click();
		
		//driver.findElement(By.xpath("")).
		/*driver.findElement(By.name("uploadfile_0")).sendKeys("C:\\Users\\Dolon\\Documents\\Alam.txt");
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.xpath("//*[@id=\"submitbutton\"]")).click();*/
		driver.close();
		
		
		
		//selecting date
		//driver.findElement(By.id("")).sendKeys("03/10/2020");

	}

}
