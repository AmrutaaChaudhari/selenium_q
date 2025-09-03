package org.LocatingStrategies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class t_findElementsaddtocartAmazon {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("noise watch");
		driver.findElement(By.id("nav-search-submit-button")).click();
		List<WebElement> addtocart = driver.findElements(By.xpath("//button[text()='Add to cart']"));
		for(WebElement a:addtocart)
		{
			a.click();
			Thread.sleep(3000);
		}
	}

}
