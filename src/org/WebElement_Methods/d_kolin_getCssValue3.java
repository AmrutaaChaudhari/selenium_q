package org.WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class d_kolin_getCssValue3 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");
		driver.findElement(By.linkText("Log in")).click();
		WebElement emailtb = driver.findElement(By.id("Email"));
		emailtb.sendKeys("amruta",Keys.ENTER);
		WebElement errmes = driver.findElement(By.xpath("//span[@for='Email']"));
		String errmescolor = errmes.getCssValue("color");
		System.out.println(errmescolor);

	}

}
