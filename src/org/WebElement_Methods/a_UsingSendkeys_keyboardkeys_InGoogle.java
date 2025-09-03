package org.WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class a_UsingSendkeys_keyboardkeys_InGoogle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		WebElement searchbar = driver.findElement(By.name("q"));
		Thread.sleep(3000);
		searchbar.sendKeys("samsung", Keys.ENTER);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.google.com/");
		WebElement searchbar2 = driver.findElement(By.name("q"));
		searchbar2.sendKeys("one plus");
		searchbar2.sendKeys(Keys.ENTER);
	}

}
