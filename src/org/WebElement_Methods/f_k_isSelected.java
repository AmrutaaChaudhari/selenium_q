package org.WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class f_k_isSelected {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		WebElement remcb = driver.findElement(By.id("RememberMe"));
		System.out.println(remcb.isSelected());
		Thread.sleep(2000);
		if(remcb.isSelected())
		{
			System.out.println("yes selected");
		}
		else
		{
		System.out.println("not ");
		remcb.click();
		}
		System.out.println(remcb.isSelected());
	}

}
