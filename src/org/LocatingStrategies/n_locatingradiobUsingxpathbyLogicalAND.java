package org.LocatingStrategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class n_locatingradiobUsingxpathbyLogicalAND {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///F:/Amruta/html/HTML2/LogicalOperators.html");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='Gender' and @value='F']")).click();

	}

}
