package org.WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class e_k_getRect3 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement passtb = driver.findElement(By.id("pass"));
		Rectangle rec = passtb.getRect();
		int passh = rec.getHeight();
		int passw = rec.getWidth();
		int passx = rec.getX();
		int passy = rec.getY();
		System.out.println(passh);
		System.out.println(passw);
		System.out.println(passx);
		System.out.println(passy);
		
		driver.get("https://www.amazon.com/");
     	WebElement  logo= driver.findElement(By.id("nav-logo-sprites"));
		Rectangle rec2 = logo.getRect();
		int logoh = rec2.getHeight();
		int logow = rec2.getWidth();
		int logox = rec2.getX();
		int logoy = rec2.getY();
		System.out.println(logoh);
		System.out.println(logow);
		System.out.println(logox);
		System.out.println(logoy);

	}

}
