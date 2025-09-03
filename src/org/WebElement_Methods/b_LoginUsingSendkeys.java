package org.WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class b_LoginUsingSendkeys {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(3000);
		driver.switchTo().activeElement().sendKeys("amrutachqq@gmail.com",Keys.TAB,"amrutachqq",Keys.ENTER);
		//driver.findElement.submit() -it is use only when login button 
		//is design using input tag with an attribute type="submit"
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("schools near me");
		Thread.sleep(2000);
		search.sendKeys(Keys.CONTROL+"a");//ctrl+c , ctrl+v, ctrl+x
		
	
		

	}

}
