package org.LocatingStrategies;
//11/08/2025
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class g_locatingImageusingcssselector {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.linkText("Mobiles")).click();
		driver.findElement(By.cssSelector("img[alt='OnePlus Nord CE5']")).click();
		

	}

}
