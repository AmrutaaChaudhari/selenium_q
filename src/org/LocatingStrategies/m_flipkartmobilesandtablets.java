package org.LocatingStrategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class m_flipkartmobilesandtablets {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//plum image
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//img[@alt='Mobiles & Tablets']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//img[contains(@alt,'Plum Red')]")).click();
		//driver.findElement(By.xpath("//a[contains(text(),'Plum Red')]")).click();
		//driver.findElement(By.xpath("MOTOROLA g05 (Plum Red, 64 GB)"));
	}

}
