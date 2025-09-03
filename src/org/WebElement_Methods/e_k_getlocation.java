package org.WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class e_k_getlocation {

	public static void main(String[] args) {
       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://www.facebook.com/");
      WebElement emailtb = driver.findElement(By.id("email"));
      Point emailtblocation = emailtb.getLocation();
      int emailtbx = emailtblocation.getX();
      int emailtby = emailtblocation.getY();
      System.out.println(emailtbx);
      System.out.println(emailtby);
      
      driver.get("https://www.flipkart.com/");
    WebElement login = driver.findElement(By.xpath("//span[text()='Login']"));
      Point loginlocation = login.getLocation();
      int loginx = loginlocation.getX();
      int loginy = loginlocation.getY();
      System.out.println(loginx);
      System.out.println(loginy);
	}

}
