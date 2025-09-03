package org.WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class c_kolin_getTextMethotwo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		driver.findElement(By.linkText("Log in")).click();
		WebElement emailtextfield = driver.findElement(By.id("Email"));
		emailtextfield.sendKeys("amruta",Keys.ENTER);
		String message = driver.findElement(By.xpath("//span[@for=\"Email\"]")).getText();
		System.out.println(message);
		

	}

}
