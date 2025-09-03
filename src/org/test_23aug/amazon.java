package org.test_23aug;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("iPhone16");
		search.sendKeys(Keys.ENTER);
		//add to cart
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'iPhone 16 256 GB: 5G') and contains(text(),'Pink')]/../../../..//button[text()='Add to cart']")).click();
		//price
		//String price=driver.findElement("//span[contains(text(),'iPhone 16 256 GB: 5G') and contains(text(),'Pink')]/../../../..//span[@class='a-price-whole']")
	String price = driver.findElement(By.xpath("//span[contains(text(),'iPhone 16 256 GB: 5G') and contains(text(),'Pink')]/../../../..//span[@class='a-price-whole']")).getText();
	System.out.println(price);
	

	}

}
