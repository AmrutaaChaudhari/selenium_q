package org.webdriver_methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingSizeRelatedMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		Dimension size = driver.manage().window().getSize();
		System.out.println(size.getHeight());
		System.out.println(size.getWidth());
		Dimension d=new Dimension(600,500);
		driver.manage().window().setSize(d);

	}

}
