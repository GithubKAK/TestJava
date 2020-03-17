package com.test.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestSelenium {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://esprah.com");
		driver.manage().window().maximize();
		
		
		//Conditional Logic page
		driver.findElement(By.xpath("//*[@id='link' and @class='nav-link'and@href='/ConditionalLogic']")).click();
		driver.findElement(By.name("firstName")).sendKeys("First Name");
		driver.findElement(By.name("lastName")).sendKeys("Last Name");
		driver.findElement(By.name("city")).sendKeys("Columbia");
		Select sel=new Select(driver.findElement(By.name("state")));
		sel.selectByVisibleText("Maryland");
		driver.findElement(By.name("zip")).sendKeys("27832");
		driver.findElement(By.name("email")).sendKeys("Abc@gmail.com");
		driver.findElement(By.xpath("//*[@id='radio-contact-sales']")).click();
		driver.findElement(By.name("subject")).sendKeys("Pizza");
		driver.findElement(By.name("message")).sendKeys("This is a note");
		driver.findElement(By.cssSelector("#submitButton > span")).click();
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[3]/form/button")).click();
		
		
		
		
		//driver.findElement(By.cssSelector("#MealPageLink > svg")).click();
		
		/*driver.findElement(By.cssSelector("#link")).click();
		driver.findElement(By.name("firstName")).sendKeys("FirstName");
		driver.findElement(By.name("lastName")).sendKeys("LastName");
		driver.findElement(By.id("email")).sendKeys("Abc@gmail.com");
		driver.findElement(By.name("confirmEmailAddress")).sendKeys("Abc@gmail.com");
		driver.findElement(By.id("phoneNumber")).sendKeys("411 232 6766");
	    driver.findElement(By.name("contact")).click();
	    driver.findElement(By.id("nextButton")).click();
	    
		driver.findElement(By.name("getMethod")).click();
		Select sel=new Select(driver.findElement(By.name("getMethod")));
		sel.selectByVisibleText("Pick Up");
		
		Select sel1=new Select(driver.findElement(By.name("size")));
		sel1.selectByVisibleText("Foot Long");
		Select sel2=new Select(driver.findElement(By.name("crust")));
		sel2.selectByVisibleText("Italian");
		driver.findElement(By.xpath("//input[@name='meat'and@label='Chicken']")).click();
		driver.findElement(By.name("meat")).click();
		driver.findElement(By.name("cheese")).click();
		//driver.findElement(By.xpath("//*[@id=\'meat\']/div[1]/div[2]")).click();
		//driver.findElement(By.className("is-touched is-dirty av-valid form-check-input")).click();
		//driver.findElement(By.xpath("//*[@id=\"radio-cheese-emailOpt\"]")).click();
		driver.findElement(By.className("#radio-cheese-emailOpt")).click();
		//driver.findElement(By.id("radio-cheese-emailOpt")).click();
		driver.findElement(By.name("cheese")).click();
		driver.findElement(By.id("topping1")).clear();
		driver.findElement(By.id("topping3")).clear();
		driver.findElement(By.id("topping4")).clear();
		driver.findElement(By.id("topping5")).clear();
		driver.findElement(By.id("topping6")).clear();
		
		driver.findElement(By.cssSelector("#instructions")).sendKeys("Please use whole whiet ");
		driver.findElement(By.cssSelector("//*[@id='react-app']/div/div/div/div[2]/div/div[2]/div/form/div[11]/button")).click();
			*/
		//*[@id='react-app']/div/div/div/div[2]/div/div[2]/div/form/div[11]/button
		//*[@id="react-app"]/div/div/div/div[2]/div/div[2]/div/form/div[11]/button
		
		
		//*[@id="react-app"]/div/div/div/div[2]/div/div[2]/div/form/div[11]/button
		
		
		
		
		/*
		driver.findElement(By.name("phoneNumber")).sendKeys("443 345 5678");
		driver.findElement(By.cssSelector("#radio-contact-emailOpt")).click();
		driver.findElement(By.id("nextButton")).click();
		driver.findElement(By.id("address1")).sendKeys("6950 Col Get Way Dr");
		driver.findElement(By.name("city")).sendKeys("Columbia");
		driver.findElement(By.name("state")).sendKeys("Maryland");
		driver.findElement(By.id("zip")).sendKeys("20867");
		Select sel1=new Select(driver.findElement(By.name("country")));
		sel1.selectByVisibleText("United States");
		
		driver.findElement(By.name("catalog")).click();
		driver.findElement(By.cssSelector("#nextButton > span")).click();
		Select sel=new Select(driver.findElement(By.name("department")));
		sel.selectByVisibleText("Sales");
		driver.findElement(By.id("message")).sendKeys("Please sent all my items via USPS");
		driver.findElement(By.id("nextButton")).click();
		driver.findElement(By.id("agree")).click();
		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[3]/form/button")).click();
		
		*/
		//driver.close();
		//department
		
	}

}
