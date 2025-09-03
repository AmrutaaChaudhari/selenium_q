package org.WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class d_kolin_getAttributeMethod {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");
		driver.findElement(By.linkText("Log in")).click();
		WebElement emailTB = driver.findElement(By.id("Email"));
		String email="amruta@gmail.com";
		emailTB.sendKeys(email);
		String emailtbattvalue = emailTB.getAttribute("value");
		System.out.println(emailtbattvalue);//alpha -transparency
	}

}
