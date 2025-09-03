package TakesScreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class scOfWebpageByusinggetScreenshotAs {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.yamaha-motor-india.com/");
		TakesScreenshot ts=(TakesScreenshot)driver;
		 File screnshot = ts.getScreenshotAs(OutputType.FILE);
		 File dest = new File("C:\\Users\\Lenovo\\eclipse-workspace\\SeleniumQ\\takesscreenshot\\sc1.png");
		 FileHandler.copy(screnshot, dest);

	}

}
