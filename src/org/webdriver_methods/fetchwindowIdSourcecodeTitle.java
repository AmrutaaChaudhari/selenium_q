package org.webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fetchwindowIdSourcecodeTitle {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		String windowid =driver.getWindowHandle();
		System.out.println(windowid);
		String pagesourceorsourcecode = driver.getPageSource();
		System.out.println(pagesourceorsourcecode);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.get("https://www.google.com/");
		driver.switchTo().activeElement().sendKeys("selenium");
	}

}
