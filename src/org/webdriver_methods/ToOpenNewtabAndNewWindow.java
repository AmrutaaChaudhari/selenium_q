package org.webdriver_methods;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToOpenNewtabAndNewWindow {

	private static final WindowType Windowtype = null;

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.google.com/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		Set<String> windowhandles = driver.getWindowHandles();
		System.out.println(windowhandles);
				

	}

}
