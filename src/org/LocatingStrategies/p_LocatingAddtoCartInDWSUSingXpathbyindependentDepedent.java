package org.LocatingStrategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//19-8-2025 Tuesday
public class p_LocatingAddtoCartInDWSUSingXpathbyindependentDepedent {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("Jewelry")).click();

	}

}
