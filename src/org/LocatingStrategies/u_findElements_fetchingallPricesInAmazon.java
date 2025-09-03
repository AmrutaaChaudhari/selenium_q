package org.LocatingStrategies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class u_findElements_fetchingallPricesInAmazon {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("noise watch");
		driver.findElement(By.id("nav-search-submit-button")).click();
		List<WebElement> prices = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		System.out.println(prices.size());
		for(WebElement p:prices)
		{
			System.out.println(p.getText());
			Thread.sleep(2000);
			
		}

	}

}
