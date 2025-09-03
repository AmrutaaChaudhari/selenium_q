package org.LocatingStrategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class l_VaidatingloginpageusingXpathBycontains {

	public static void main(String[] args) {
		String expectedText="Welcome, Please Sign In!";
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		WebElement loginpagetext = driver.findElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));
		String actualtext=loginpagetext.getText();
		if(expectedText.equals(actualtext))
		{
			System.out.println("Login page displayed successfully");
		}
		else
		{
			System.out.println("Login page not displayed, stop here");
		}
		}

	}

