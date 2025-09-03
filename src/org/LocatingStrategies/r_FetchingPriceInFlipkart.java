package org.LocatingStrategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class r_FetchingPriceInFlipkart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("samsung");
		driver.findElement(By.xpath("//button[contains(@title,'Search for Products, Brands and More')]")).click();
		String price=driver.findElement(By.xpath("//div[contains(text(),'Z Fold7 5G (Silver Shadow')]/../..//div[contains(text(),'₹')]")).getText();
        System.out.println(price);
	}

}
