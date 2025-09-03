package org.WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class d_kolin_getTagname {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");
		WebElement reg=driver.findElement(By.linkText("Register"));
		String tagname = reg.getTagName();
		System.out.println(tagname);
		

	}

}
