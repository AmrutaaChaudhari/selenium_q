package org.LocatingStrategies;
//11/08/2025
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class f_cssselector {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.cssSelector("input[id='Email']")).sendKeys("amrutachqq@gmail.com");
		driver.findElement(By.cssSelector("input[name='Password']")).sendKeys("amrutachqq");
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
		//login link by css selector)

	}

}
