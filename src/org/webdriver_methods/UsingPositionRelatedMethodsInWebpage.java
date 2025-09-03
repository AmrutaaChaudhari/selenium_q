package org.webdriver_methods;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingPositionRelatedMethodsInWebpage {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		Point position = driver.manage().window().getPosition();
		System.out.println(position);
		System.out.println(position.getX());
		System.out.println(position.getY());
		Point target = new Point(200,300);
		driver.manage().window().setPosition(target);
		//System.out.println();

	}

}
