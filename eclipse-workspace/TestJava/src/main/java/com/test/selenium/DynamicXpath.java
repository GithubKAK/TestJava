package com.test.selenium;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.esprah.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		

		WebElement element = driver.findElement(By.xpath("//*[@id='link'and@class='nav-link'and@href='/ProductOrder1']"));
		List<WebElement> listColumns = null;
		List<WebElement> listRows = element.findElements(By.tagName("tr"));
		System.out.println("print the list of size"+listRows.size());
		String finalXpath= " ";
		for(int i=1; i<=listRows.size() -1; i++) {
			listColumns= listRows.get(i).findElements(By.tagName("td"));
			for(WebElement col : listColumns) {
				if(col.getText().equalsIgnoreCase("Online Catalog")) {
					System.out.println("Print columns value "+ col.getText() + "Row index num"+ i);
					finalXpath = "//*[@class='table table-bordered table-dark']/tbody/tr["+i+"]/td[1]";
					System.out.println("Print final xpath"+ finalXpath);
					break;
				}
			}
		}
		driver.findElement(By.xpath("finalXpath")).click();
	}

}
