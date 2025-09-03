package org.WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class f_kolin_isEnabledMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[text()='Disabled']")).click();
		Thread.sleep(2000);
		
		WebElement nametb = driver.findElement(By.id("name"));
		boolean result = nametb.isEnabled();
		
		if(result==true)
		{
			System.out.println("is enabled");
		}
		else
		{
			System.out.println("not enabled");
		}
	}

}
