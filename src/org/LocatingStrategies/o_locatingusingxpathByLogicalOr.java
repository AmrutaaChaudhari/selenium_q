package org.LocatingStrategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class o_locatingusingxpathByLogicalOr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///F:/Amruta/html/HTML2/LogicalOperators.html");
		WebElement firstname = driver.findElement(By.xpath("//input[@id='fn' or @name='first']"));
		firstname.clear();
		firstname.sendKeys("hjjj");
		

	}

}
