package org.LocatingStrategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class q_LocatingAddToCartAmazonByIndepedentDependent {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Noise watch");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement
		(By.xpath("//span[contains(text(),'NoiseFit Halo') and contains(text(),'Smart Gesture Control, 100 Sports Modes (Vintage Brown)')]/../../../..//button[text()='Add to cart']"))
		.click();
		//button[text()='Add to cart']
		//fetch the price
		String price=driver.findElement
		(By.xpath("//span[contains(text(),'NoiseFit Halo') and contains(text(),'Smart Gesture Control, 100 Sports Modes (Vintage Brown)')]/../../../..//span[@class=\"a-price-whole\"]"))
		.getText();
		System.out.println(price);
		

	}

}
