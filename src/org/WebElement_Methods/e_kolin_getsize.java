package org.WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class e_kolin_getsize {
//friday 29-8-25
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		 WebElement search=driver.findElement(By.cssSelector("input[name=q]"));
		 Dimension searchsize = search.getSize();
		 int searchheight = searchsize.getHeight();
		 int searchwidth = searchsize.getWidth();
		 System.out.println(searchheight);
		 System.out.println(searchwidth);
		
		driver.get("https://www.facebook.com/");
		WebElement emailtb=driver.findElement(By.id("email"));
		 Dimension emailtbsize = emailtb.getSize();
		 int emailtbheight = emailtbsize.getHeight();
		 int emailtbwidth = emailtbsize.getWidth();
		 System.out.println(emailtbheight);
		 System.out.println(emailtbwidth);

	}

}
