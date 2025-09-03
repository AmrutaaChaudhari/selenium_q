package org.test_23aug;

import java.net.http.WebSocket;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class clickme {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		String expectedurl="https://www.swiggy.com/";
		driver.get("file:///C:/Users/Lenovo/Downloads/Assign.html");
		driver.findElement(By.xpath("//button[text()='Click Me']")).click();
		Set<String> windowids = driver.getWindowHandles();
		for(String w:windowids)
		{
			driver.switchTo().window(w);
			String actualurl = driver.getCurrentUrl();
			if(actualurl.equals(expectedurl))
			{
				driver.close();
				
			}
		Thread.sleep(2000);
		
		}
	}

}
