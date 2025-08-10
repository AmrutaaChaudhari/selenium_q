package org.LocatingStrategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class a_UnderstandingfindElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement emailTextBox = driver.findElement(By.id("email"));
		emailTextBox.sendKeys("amruta@gmail.com");
		WebElement passwordTextBox = driver.findElement(By.id("pass"));
		passwordTextBox.sendKeys("amruta");
		driver.findElement(By.name("login")).click();
		Thread.sleep(5000);
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://demowebshop.tricentis.com/login");
		WebElement emailbox = driver.findElement(By.id("Email"));
		emailbox.sendKeys("amruta@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("1234");
		driver.findElement(By.id("RememberMe")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("RememberMe")).click();
		
		


	}

}
