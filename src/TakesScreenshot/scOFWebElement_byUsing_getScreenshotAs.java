package TakesScreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class scOFWebElement_byUsing_getScreenshotAs {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement fblogo = driver.findElement(By.xpath("//img[@alt='Facebook']/../.."));
		 File screenshot = fblogo.getScreenshotAs(OutputType.FILE);
		 File dest=new File(".\\errorshots\\sc3.png");
		FileHandler.copy(screenshot, dest);

	}

}
