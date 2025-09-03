package org.dropdownhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectclassMethods {
//selection methods
	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.facebook.com/reg");
		  WebElement monthdropdown = driver.findElement(By.id("month"));
		 Select select=new Select(monthdropdown);
		 select.isMultiple();
		 Thread.sleep(1000);
		 select.selectByIndex(1);
		 Thread.sleep(1000);
		 select.selectByValue("3");
		 Thread.sleep(1000);
		 select.selectByVisibleText("Dec");
		 

	}

}
