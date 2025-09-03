package TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class takesScreenshotWithTimestamp {

	public static void main(String[] args) throws IOException {
		LocalDateTime ldt=LocalDateTime.now();
		String timestamp=ldt.toString();
		System.out.println(timestamp);
		String timestamp1=ldt.toString().replace(":","-");
		System.out.println(timestamp1);
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File screenshot=ts.getScreenshotAs(OutputType.FILE);
		File Dest=new File("./errorshots/"+timestamp1+"sc.png");
		FileHandler.copy(screenshot, Dest);
		
		

	}

}
