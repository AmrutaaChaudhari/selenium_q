package org.dropdownhandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class b_using_getOptions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.facebook.com/reg");
		 WebElement datedropdown = driver.findElement(By.id("day"));
		 Select select=new Select(datedropdown);
		 List<WebElement> options = select.getOptions();
		 System.out.println(options.size());
		 
		 for(WebElement option:options)
		 {
			 System.out.println(option.getText());
			String text = option.getText();
			 Thread.sleep(500);
			 select.selectByVisibleText(text);
			
		 }
		 
 }
		 
		 
	}