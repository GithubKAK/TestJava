package com.test.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/drag-and-drop-demo.html");
		driver.manage().window().maximize();
		//Thread.sleep(2000);
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//Explicit wait
		WebDriverWait wait=new WebDriverWait(driver,20);
		//wait.until(Ex)
		
		    WebElement sourceElement=driver.findElement(By.xpath("//*[@id=\"todrag\"]/span[1]"));
			WebElement targetElement=driver.findElement(By.xpath("//*[@id=\"mydropzone\"]"));
			
			Actions action= new Actions(driver);
			//action.clickAndHold(sourceElement).moveToElement(targetElement).release().build().perform();
		//action.clickAndHold(sourceElement).moveToElement(targetElement).release().build().perform();
		
		action.moveToElement(sourceElement).pause(2).moveToElement(targetElement).perform();
		//*[@id="todrag"]/span[1]
//action.dragAndDrop(sourceElement, targetElement)
	}

}
