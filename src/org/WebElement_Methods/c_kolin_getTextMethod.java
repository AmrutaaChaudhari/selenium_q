package org.WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class c_kolin_getTextMethod {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		WebElement loginlink = driver.findElement(By.linkText("Log in"));
		String logintext = loginlink.getText();
		System.out.println(logintext);

	}

}
