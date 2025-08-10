package org.LocatingStrategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class b_Registerindemowebshop {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Amruta");
		driver.findElement(By.id("LastName")).sendKeys("Chaudhari");
		driver.findElement(By.id("Email")).sendKeys("amrutachqq@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("amrutachqq");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("amrutachqq");
		driver.findElement(By.id("register-button")).click();
		

	}

}
