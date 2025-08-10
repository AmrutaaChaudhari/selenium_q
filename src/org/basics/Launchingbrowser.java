package org.basics;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Launchingbrowser {

	public static void main(String[] args) {
		System.out.println("Enter The Browser Name To Be Open");
		Scanner sc=new Scanner(System.in);
		String browser=sc.next();
		WebDriver driver=null;
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("fire"))
		{
			driver=new FirefoxDriver();
		}
	}
}
